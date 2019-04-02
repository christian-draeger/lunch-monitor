package it.skrape.domain

enum class Restautant {
    ESSWIRTSCHAFT
}

data class Meal(
    val restaurant: Restautant,
    val name: String,
    val priceInCent: Long
)
