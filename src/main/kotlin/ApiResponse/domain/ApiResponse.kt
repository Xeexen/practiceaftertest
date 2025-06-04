package org.example.ApiResponse.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Lob
import java.util.UUID

@Entity
data class ApiResponse(
    @Id
    val id: String = UUID.randomUUID().toString(),

    val source: String = "",

    @Column(columnDefinition = "TEXT")
    val rawJson: String = ""
)