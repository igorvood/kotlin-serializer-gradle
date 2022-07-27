package ru.vood.example.kotlinserializer.format

import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class UaspDto(
    val id: String,
    val dataString: Map<String, String>,
    val dataDouble: Map<String, Double>,
    @Serializable(with = BigDecimalSerializer::class)
    val dataDecimal: BigDecimal,

    )

