package ru.vood.example.kotlinserializer.caseData

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
sealed interface ICaseData

@kotlinx.serialization.Serializable
@SerialName("Begin")
data class Begin(val begin: String):ICaseData

@kotlinx.serialization.Serializable
@SerialName("End")
data class End(val begin: String,
               val end: String):ICaseData