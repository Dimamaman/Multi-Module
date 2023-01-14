package com.example.database

import java.io.Serializable

data class Birds(
    val id: Long,
    val name: String,
    val image: String,
    val number: String,
    val team: String,
    val description: String
): Serializable

