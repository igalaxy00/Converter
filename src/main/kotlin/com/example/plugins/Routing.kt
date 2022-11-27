package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
val DEGREES = "degrees"
fun Application.configureRouting() {

    routing {
        get("/convert") {
            val degree = call.parameters[DEGREES]
            call.respondText("Hello World!")
        }
    }



}
