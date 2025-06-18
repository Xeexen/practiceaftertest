package org.example.core.mvp.infrastructure

import core.factoryPattern.domain.HelloWorld
import org.example.core.mvp.domain.HelloWorldView
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("mvp")
class MvpHelloWorldController : HelloWorldView{
    @GetMapping("")
    override fun showHelloMessage(helloWorld: HelloWorld) {
        println("the view shows: $helloWorld" )
    }
}