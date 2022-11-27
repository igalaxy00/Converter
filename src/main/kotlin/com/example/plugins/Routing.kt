package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

val DEGREES = "degrees"
val MINUTES = "minutes"
fun Application.configureRouting() {

    routing {
        get("/convert/degree") {
            val degree = call.parameters[DEGREES]
            if (degree == null) {
                call.respondText("ERROR EMPTY PARAMETER")
            } else {
                val out = "Seconds are " + (degree.toInt() * 3600).toString()
                call.respondText(out)
            }
        }

        get("/convert/minute") {
            val minute = call.parameters[MINUTES]
            if (minute == null) {
                call.respondText("ERROR EMPTY PARAMETER")
            } else {
                val out = "Seconds are " + (minute.toInt() * 60).toString()
                call.respondText(out)
            }
        }
    }
}
