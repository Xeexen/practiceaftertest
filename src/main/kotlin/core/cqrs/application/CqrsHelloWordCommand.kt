package org.example.core.cqrs.application

import core.factoryPattern.domain.HelloWorld
import core.factoryPattern.domain.HelloWorldRepository
import org.springframework.stereotype.Service

@Service
class CqrsHelloWordCommand(private val helloWorldRepository: HelloWorldRepository) {

    fun saveHelloWord(helloWorld: HelloWorld) {
        helloWorldRepository.save(helloWorld)
    }
}