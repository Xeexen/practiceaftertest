package org.example.ApiResponse.application

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import okhttp3.Request
import org.example.ApiResponse.domain.ApiResponse
import org.example.ApiResponse.domain.ApiResponseRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class ApiResponseCommandService(private val repository: ApiResponseRepository) {
    private val client = OkHttpClient()
    private val json = Json { ignoreUnknownKeys = true }

    fun getApiResponse(): List<ApiResponse> {
        return repository.findAll()
    }

    suspend fun fetchAndStore(sourceName: String, url: String) {
        val request = Request.Builder().url(url).build()

        val response = withContext(Dispatchers.IO) {
            client.newCall(request).execute()
        }

        if (response.isSuccessful) {
            val responseBody = response.body?.string() ?: throw RuntimeException("Empty response")
            val apiResponse = ApiResponse(
                source = sourceName,
                rawJson = responseBody
            )
            repository.save(apiResponse)
            println("Saved response from $sourceName")
        } else {
            throw RuntimeException("Failed to fetch from $sourceName: ${response.code}")
        }
    }


    suspend fun execute() {
        fetchAndStore("API 1", "https://api.restful-api.dev/objects")
        fetchAndStore("API 2", "https://dummyjson.com/products")
        fetchAndStore("API 3", "https://jsonplaceholder.typicode.com/todos")
        fetchAndStore("API 4", "https://catfact.ninja/facts")
    }
}