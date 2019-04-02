package it.skrape.ui

import io.ktor.http.ContentType
import it.skrape.data.EsswirtschaftFetcher
import it.skrape.domain.Meal
import it.skrape.domain.Restaurant
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

        EsswirtschaftFetcher().todaysMeals().forEach { tile(it) }
    }
}

private fun BODY.tile(meal: Meal) {
    div("meal") {
        p { +meal.name }
        restaurantBadge(meal.restaurant)
        priceBadge(meal.priceInCent)
    }
}

private fun DIV.priceBadge(priceInCent: Long) {
    span("price") { +priceInCent.asFormattedPrice() }
}

private fun DIV.restaurantBadge(restaurant: Restaurant) {
    span("restaurant") { +"\uD83D\uDCCD ${restaurant.displayName}" }
}
