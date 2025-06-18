package core.factoryPattern.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HelloWorldRepository : JpaRepository<HelloWorld, String> {
    fun getHelloWorld(): HelloWorld
}