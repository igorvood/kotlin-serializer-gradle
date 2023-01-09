package ru.vood.example.kotlinserializer.caseData

import kotlinx.serialization.json.Json
import org.junit.jupiter.api.Test

class CaseClassTest {

    @Test
    fun avroCompatibleTest() {

        val listOf = listOf(Begin("asd"), End("Asd", "asd"))
        val listCase = ListCase(listOf)

        val encodeToString = Json.encodeToString(ListCase.serializer(), listCase)


        println(encodeToString)

//        val serializer = UaspDto.serializer()
//
//        val encodeToByteArray = Avro.default.encodeToByteArray(serializer, obj)
//
//        val decodeFromByteArray = Avro.default.decodeFromByteArray(serializer, encodeToByteArray)
//        Assertions.assertEquals(obj,decodeFromByteArray )
//
//        val decodeFromByteArrayCuttten = Avro.default.decodeFromByteArray(UaspDtoCuttten.serializer(), encodeToByteArray)
//
//
//        Assertions.assertEquals(obj.id,decodeFromByteArrayCuttten.id )
//        Assertions.assertEquals(obj.dataDouble,decodeFromByteArrayCuttten.dataDouble )
//        Assertions.assertEquals(obj.dataString,decodeFromByteArrayCuttten.dataString )

    }


}

