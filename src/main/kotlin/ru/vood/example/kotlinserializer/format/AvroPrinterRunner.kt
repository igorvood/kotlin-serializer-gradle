package ru.vood.example.kotlinserializer.format

import com.github.avrokotlin.avro4k.Avro
import org.apache.avro.Schema
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Service

@Service
class AvroPrinterRunner : CommandLineRunner {

    override fun run(vararg args: String?) {
        val schemaUaspDto: Schema = Avro.default.schema(UaspDto.serializer())
        val schemaUaspDtoCuttten: Schema = Avro.default.schema(UaspDtoCuttten.serializer())
        println(schemaUaspDtoCuttten.toString(true))

        println(schemaUaspDto.toString(true))
    }
}