package ru.vood.example.kotlinserializer.format

import com.github.avrokotlin.avro4k.Avro
import com.github.avrokotlin.avro4k.io.AvroBinaryOutputStream
import com.github.avrokotlin.avro4k.io.AvroOutputStream
import org.apache.avro.Schema
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Service
import java.io.File

@Service
class AvroPrinterRunner : CommandLineRunner {

    override fun run(vararg args: String?) {
        val schemaUaspDto= Avro.default.schema(UaspDto.serializer())
        val schemaUaspDtoCuttten= Avro.default.schema(UaspDtoCuttten.serializer())
        println(schemaUaspDtoCuttten.toString(true))

        println(schemaUaspDto.toString(true))

    }


    fun asdasd(){

        val schema = Avro.default.schema(UaspDto.serializer())

        val os = AvroOutputStream.binary(schema, UaspDto.serializer()).to(File("pizzas.avro"))
    }
}