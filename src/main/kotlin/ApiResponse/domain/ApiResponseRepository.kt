package org.example.ApiResponse.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ApiResponseRepository : JpaRepository<ApiResponse, String> {
}