package ru.vood.example.kotlinserializer.format

import com.github.avrokotlin.avro4k.Avro
import com.github.avrokotlin.avro4k.io.AvroBinaryOutputStream
import com.github.avrokotlin.avro4k.io.AvroOutputStream
import org.apache.avro.Schema
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Service
import java.io.File
import java.math.BigDecimal

@Service
class AvroPrinterRunner : CommandLineRunner {

    override fun run(vararg args: String?) {
        val schemaUaspDto= Avro.default.schema(UaspDto.serializer())
        val schemaUaspDtoCuttten= Avro.default.schema(UaspDtoCuttten.serializer())
        println(schemaUaspDtoCuttten.toString(true))

        println(schemaUaspDto.toString(true))

    }


    fun asdasd(){

        val serializer = UaspDto.serializer()
        val schema = Avro.default.schema(serializer)

        val obj = UaspDto( "id1",
            mapOf("1" to "one"),
            mapOf<String, Double>(),
            BigDecimal(12)
        )
        val encodeToByteArray = Avro.default.encodeToByteArray(serializer, obj)


        val r = Avro.default.toRecord(serializer, obj)


    }
}