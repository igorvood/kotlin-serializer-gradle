package ru.vood.example.kotlinserializer.format

import com.github.avrokotlin.avro4k.Avro
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class AvroPrinterRunnerTest {

    @Test
    fun avroCompatibleTest(){
        val serializer = UaspDto.serializer()

        val encodeToByteArray = Avro.default.encodeToByteArray(serializer, obj)

        val decodeFromByteArray = Avro.default.decodeFromByteArray(serializer, encodeToByteArray)
        Assertions.assertEquals(obj,decodeFromByteArray )

        val decodeFromByteArrayCuttten = Avro.default.decodeFromByteArray(UaspDtoCuttten.serializer(), encodeToByteArray)


        Assertions.assertEquals(obj.id,decodeFromByteArrayCuttten.id )
        Assertions.assertEquals(obj.dataDouble,decodeFromByteArrayCuttten.dataDouble )
        Assertions.assertEquals(obj.dataString,decodeFromByteArrayCuttten.dataString )





    }


    companion object{
        val obj = UaspDto( "id1",
            mapOf("1" to "one"),
            mapOf<String, Double>(),
            BigDecimal(12)
        )

    }
}

