package it.skrape

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.html.respondHtml
import io.ktor.http.content.files
import io.ktor.http.content.static
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.netty.EngineMain.main
import it.skrape.ui.markup

fun main(args: Array<String>): Unit = main(args)

fun Application.module(testing: Boolean = false) {
    routing {
        get("/") {
            call.respondHtml { markup() }
        }
        static("/static") {
            files("resources/pics")
        }
    }
}
