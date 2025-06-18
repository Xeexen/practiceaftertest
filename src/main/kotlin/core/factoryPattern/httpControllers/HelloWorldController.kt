package org.example.core.factoryPattern.httpControllers

import core.factoryPattern.application.HelloWorldCommandService
import core.factoryPattern.domain.HelloWorld
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("factory-pattern")
class HeloWorldController(
    private val helloWorldService: HelloWorldCommandService
) {

    @RequestMapping("")
    fun helloWorld(): ResponseEntity<HelloWorld> {
        return ResponseEntity<HelloWorld>(helloWorldService.getHelloWorld(), HttpStatus.OK)
    }
}