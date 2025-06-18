package org.example.core.mvp.application

import core.factoryPattern.domain.HelloWorld
import org.example.core.mvp.domain.HelloWorldModel
import org.example.core.mvp.domain.HelloWorldView

class HelloWorldPresenter(private val view: HelloWorldView) {
    private val model = HelloWorldModel()
    fun presenterHelloWorld(helloWorld: HelloWorld){
        val resultModel = model.saveHelloWorld(helloWorld)
        view.showHelloMessage(resultModel)
    }
}