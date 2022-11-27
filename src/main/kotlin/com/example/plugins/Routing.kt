package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
val DEGREES = "degrees"
val MINUTES = "minutes"
fun Application.configureRouting() {

    routing {
        get("/convert/degree") {
            val degree = call.parameters[DEGREES]
            call.respondText("Hello World!")
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
