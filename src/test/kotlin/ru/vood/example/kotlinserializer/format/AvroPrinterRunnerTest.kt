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


    }


    companion object{
        val obj = UaspDto( "id1",
            mapOf("1" to "one"),
            mapOf<String, Double>(),
            BigDecimal(12)
        )

    }
}

