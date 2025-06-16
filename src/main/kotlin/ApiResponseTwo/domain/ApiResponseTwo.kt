package org.example.ApiResponseTwo.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import okio.Source
import java.util.UUID

@Entity
data class ApiResponseTwo(
    @Id
    val id: String = UUID.randomUUID().toString(),
    val source: String,
    @Column(columnDefinition = "TEXT")
    val data: String,
)
