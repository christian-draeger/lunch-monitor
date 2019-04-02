package it.skrape.utils

import java.text.NumberFormat
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*

fun getCurrentDay(locale: Locale): String {
    val dayOfWeek = LocalDate.now().dayOfWeek
    return dayOfWeek.getDisplayName(TextStyle.FULL, locale)
}

fun Long.asFormattedPrice(): String = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(this / 100.0)