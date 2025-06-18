package org.example.core.mvp.domain

import core.factoryPattern.domain.HelloWorld

interface HelloWorldView {
    fun showHelloMessage(helloWorld: HelloWorld)
}