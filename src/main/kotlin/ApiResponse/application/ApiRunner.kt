package org.example.ApiResponse.application

import kotlinx.coroutines.runBlocking
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class ApiRunner(
    private val service: ApiResponseCommandService
) : CommandLineRunner {
    override fun run(vararg args: String?) = runBlocking {
        service.execute()
    }
}