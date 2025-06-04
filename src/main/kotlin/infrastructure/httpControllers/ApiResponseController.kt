package org.example.infrastructure.httpControllers

import org.example.ApiResponse.application.ApiResponseCommandService
import org.example.ApiResponse.domain.ApiResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiResponseController(
    private val apiResponseService: ApiResponseCommandService
) {
    @GetMapping("/api-responses")
    fun getApiResponses(): ResponseEntity<List<ApiResponse>> {
        return ResponseEntity.ok(apiResponseService.getApiResponse())
    }
}