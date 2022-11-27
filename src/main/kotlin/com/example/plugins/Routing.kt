package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

val DEGREES = "degrees"
fun Application.configureRouting() {

    routing {
        get("/convert") {
            val degree = call.parameters[DEGREES]
            if (degree == null) {
                call.respondText("ERROR EMPTY PARAMETER")
            } else {
                val out = "Seconds are " + (degree.toInt() * 120).toString()
                call.respondText(out)
            }
        }
    }

}
