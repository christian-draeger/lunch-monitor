package it.skrape.ui

import it.skrape.utils.css
import kotlinx.css.*
import kotlinx.html.HEAD

fun HEAD.styling() = css {
    body {
        backgroundColor = Color("#ffebcd")
        fontFamily = "Arial"
        fontSize = 1.em
    }
    h1 {
        textAlign = TextAlign.center
    }
    rule(".meal") {
        display = Display.inlineBlock
        backgroundImage = Image("url(/static/meal.jpeg)")
        backgroundSize = "cover"
        borderRadius = 10.px
        margin = "10px"
        padding = "10px"
        width = 30.pct
        minHeight = 200.px
        fontSize = 1.em
        position = Position.relative
    }
    rule(".meal p") {
        margin = "10%"
        fontSize = 1.3.em
        fontWeight = FontWeight.bold
        color = Color("#006400")
    }
    rule(".price") {
        position = Position.absolute
        display = Display.flex
        borderRadius = 50.px
        color = Color.white
        fontWeight = FontWeight.bold
        backgroundColor = Color.red
        padding = "15px"
        fontSize = 1.5.em
        alignItems = Align.center
        right = 10.px
        bottom = 10.px
        height = 20.px
    }
}