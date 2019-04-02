package it.skrape.ui

import io.ktor.http.ContentType
import it.skrape.data.EsswirtschaftFetcher
import it.skrape.utils.asFormattedPrice
import it.skrape.utils.getCurrentDay
import kotlinx.html.*
import java.util.*


fun HTML.markup() {
    head {
        title { +"Lunch Monitor" }
        style(type = ContentType.Text.CSS.toString()) {
            +styling().render()
        }
    }
    body {
        h1 { +"Lunch am ${getCurrentDay(Locale.GERMAN)}" }

        EsswirtschaftFetcher().todaysMeals().forEach {
            div("meal") {
                p { +it.name }
                span("price") { +it.priceInCent.asFormattedPrice() }
            }
        }
    }
}
