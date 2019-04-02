package it.skrape.utils

import io.ktor.http.ContentType
import kotlinx.css.CSSBuilder
import kotlinx.html.FlowOrMetaDataContent
import kotlinx.html.style
import java.text.NumberFormat
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*

// extend html with inline css
fun FlowOrMetaDataContent.css(builder: CSSBuilder.() -> Unit) {
    style(type = ContentType.Text.CSS.toString()) {
        +CSSBuilder().apply(builder).toString()
    }
}

fun getCurrentDay(locale: Locale): String {
    val dayOfWeek = LocalDate.now().dayOfWeek
    return dayOfWeek.getDisplayName(TextStyle.FULL, locale)
}

fun Long.asFormattedPrice(): String = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(this / 100.0)