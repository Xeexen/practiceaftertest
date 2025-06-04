package org.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.scheduling.annotation.EnableAsync
import java.util.TimeZone

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
@EnableAsync
open class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}