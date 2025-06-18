package org.example.core.cqrs.httpControllers

import core.factoryPattern.domain.HelloWorld
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.util.UUID

class HelloWorldRequest(
    val id : String?,
    @NotNull(message = "Message must not be blank")
    @NotBlank(message = "Message must not be blank"  )
    val message : String?
){
    fun toDomain() : HelloWorld {
        return HelloWorld(id?: UUID.randomUUID().toString()  , message!!)
    }
}