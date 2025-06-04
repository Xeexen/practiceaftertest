package org.example.ApiResponse.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Lob

@Entity
data class ApiResponse(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String? = null,

    val source: String,

    @Column(columnDefinition = "TEXT")
    val rawJson: String
)
