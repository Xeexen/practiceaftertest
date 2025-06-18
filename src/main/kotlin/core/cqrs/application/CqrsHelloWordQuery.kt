package org.example.core.cqrs.application

import core.factoryPattern.domain.HelloWorld
import core.factoryPattern.domain.HelloWorldRepository
import org.springframework.stereotype.Service

@Service
class CqrsHelloWordQuery(
    private val helloWorldRepository: HelloWorldRepository
) {
    fun findAllHelloWords(): List<HelloWorld> {
        return helloWorldRepository.findAll()
    }
}