package ru.vood.example.kotlinserializer.format

import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class UaspDtoCuttten (
    val id: String,
    val dataString: Map<String, String>,
    val dataDouble: Map<String, Double>,
    )