package com.example

import com.example.model.PostgresTaskRepository
import io.ktor.server.application.*
import io.ktor.server.config.ApplicationConfig

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val repository = PostgresTaskRepository()
    configureSerialization(repository)
    configureDatabases(environment.config)
    configureRouting()
}
