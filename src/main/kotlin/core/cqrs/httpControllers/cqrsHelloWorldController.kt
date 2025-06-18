package org.example.core.cqrs.httpControllers

import core.factoryPattern.domain.HelloWorld
import org.example.core.cqrs.application.CqrsHelloWordCommand
import org.example.core.cqrs.application.CqrsHelloWordQuery
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("cqrs")
class cqrsHelloWorldController(
    private val cqrsHelloWordCommand: CqrsHelloWordCommand,
    private val cqrsHelloWordQuery: CqrsHelloWordQuery
) {

    @GetMapping("")
    fun getAllHelloWords(): ResponseEntity<List<HelloWorld>> {
        return ResponseEntity.ok(cqrsHelloWordQuery.findAllHelloWords())
    }

    @PostMapping("")
    fun createHelloWorld(helloWorld: HelloWorld): ResponseEntity<Unit> {
        return ResponseEntity.ok(cqrsHelloWordCommand.saveHelloWord(helloWorld))
    }
}