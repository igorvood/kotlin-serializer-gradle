package ru.vood.example.kotlinserializer.format

import kotlinx.serialization.Serializable

@Serializable
data class UaspDto(
    val id: String,
    val dataString: Map<String, String>,
//                   val dataDecimal: Map<String, BigDecimal>,
    val dataDecimal: Map<String, Double>,
)
