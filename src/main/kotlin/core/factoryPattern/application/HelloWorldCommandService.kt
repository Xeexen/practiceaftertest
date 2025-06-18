package core.factoryPattern.application

import core.factoryPattern.domain.HelloWorld
import core.factoryPattern.domain.HelloWorldRepository
import org.springframework.stereotype.Service

@Service
class HelloWorldCommandService : HelloWorldRepository {
    override fun getHelloWorld(): HelloWorld {
        return HelloWorld(message = "Hello, World!")
    }
}