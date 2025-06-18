package org.example.core.mvp.domain

import core.factoryPattern.domain.HelloWorld
import java.util.UUID

class HelloWorldModel{
     fun saveHelloWorld(helloWorld: HelloWorld): HelloWorld = HelloWorld(UUID.randomUUID().toString(), "Hello MVP")
 }
