package it.skrape.ui

import it.skrape.data.EsswirtschaftFetcher
import it.skrape.utils.asFormattedPrice
import it.skrape.utils.getCurrentDay
import kotlinx.html.*
import java.util.*


fun HTML.markup() {
    head {
        title { +"Lunch Monitor" }
        styling()
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
