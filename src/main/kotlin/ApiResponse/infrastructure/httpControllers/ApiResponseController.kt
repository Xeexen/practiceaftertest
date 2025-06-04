package org.example.ApiResponse.infrastructure.httpControllers

import org.example.ApiResponse.application.ApiResponseCommandService
import org.example.ApiResponse.domain.ApiResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiResponseController(
    private val apiResponseService: ApiResponseCommandService
) {
    @GetMapping("/api-responses")
    fun getApiResponses(): ResponseEntity<List<ApiResponse>> {
        val apiResponses: List<ApiResponse> = apiResponseService.getApiResponse()
        return ResponseEntity.ok(apiResponses)
    }
}