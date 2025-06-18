package org.example.core.mvvm

import core.factoryPattern.domain.HelloWorld
import org.example.core.cqrs.application.CqrsHelloWordCommand
import org.example.core.cqrs.application.CqrsHelloWordQuery

class HelloWorldViewModel(
    private val helloWorldQuery: CqrsHelloWordQuery,
    private val helloWorldCommand: CqrsHelloWordCommand
) {
    private var helloWorldList: List<HelloWorld> = emptyList()

    fun loadHelloWorldData() {
        helloWorldList = helloWorldQuery.findAllHelloWords()
    }

    fun createHelloWorld(helloWorld: HelloWorld){
        val newHelloWorld = helloWorldCommand.saveHelloWord(helloWorld)
        print(newHelloWorld)
    }
}