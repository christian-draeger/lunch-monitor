package it.skrape.domain

enum class Restaurant(val displayName: String) {
    ESSWIRTSCHAFT("Esswirtschaft")
}

data class Meal(
    val restaurant: Restaurant,
    val name: String,
    val priceInCent: Long
)
