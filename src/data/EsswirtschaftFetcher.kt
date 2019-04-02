package it.skrape.data

import it.skrape.domain.Meal
import it.skrape.domain.Restautant
import it.skrape.extract
import it.skrape.selects.elements
import it.skrape.skrape
import it.skrape.utils.getCurrentDay
import org.jsoup.nodes.Element
import java.util.*


class EsswirtschaftFetcher {

    fun todaysMeals(): List<Meal> {
        val raw = extractTodaysMeal()

        return raw.map {
            val meal = extractMeal(it.text())
            Meal(priceInCent = meal.first, name = meal.second, restaurant = Restautant.ESSWIRTSCHAFT)
        }
    }

    private fun extractMeal(s: String): Pair<Long, String> {
        val rawPrice = s.split("€").last()
            .remove("€")
            .replace(",", ".")
            .trim()
        val meal = s.split("€").first()
        val price = (rawPrice.toDouble() * 100).toLong()
        return Pair(price, meal)
    }

    private fun extractTodaysMeal(): List<Element> {
        val meal = skrape {
            url = "https://www.esswirtschaft.de/wochenkarte/wochenkarte.html"
            extract {
                elements("h2 + p")
            }
        }

        return listOf(meal[0], meal[1], meal[2], meal[getPositionByDay()])

    }

    private fun getPositionByDay(): Int {
        return when (getCurrentDay(Locale.ENGLISH)) {
            "Monday" -> 3
            "Tuesday" -> 4
            "Wednesday" -> 5
            "Thursday" -> 6
            "Friday" -> 7
            else -> 0
        }
    }

    private fun String.remove(substring: String) = this.replace(substring, "")
}
