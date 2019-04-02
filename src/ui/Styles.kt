package it.skrape.ui

import azadev.kotlin.css.*
import azadev.kotlin.css.colors.rgb
import azadev.kotlin.css.dimens.em
import azadev.kotlin.css.dimens.percent
import azadev.kotlin.css.dimens.px

fun styling() =
    Stylesheet {
        body {
            background = rgb(250,216,0)
            background = "linear-gradient(90deg, rgba(255,245,184,1) 0%, rgba(247,247,149,1) 43%, rgba(255,232,221,1) 100%)"
            fontFamily = "Arial"
            fontSize = 1.em
        }
        h1 {
            textAlign = CENTER
        }
        ".meal" {
            display = INLINE_BLOCK
            backgroundImage = "url(/static/meal.jpeg)"
            backgroundSize = "cover"
            borderRadius = 10.px
            margin = "10px"
            padding = "10px"
            width = 30.percent
            minHeight = 200.px
            fontSize = 1.em
            position = RELATIVE
        }
        ".meal p" {
            margin = "10%"
            fontSize = 1.3.em
            fontWeight = BOLD
            textShadow = "1px -1px 0px #ffffff;"
            color = 0x006400
        }
        ".price" {
            position = ABSOLUTE
            display = "flex"
            borderRadius = 50.px
            color = WHITE
            fontWeight = BOLD
            backgroundColor = RED
            padding = "15px"
            fontSize = 1.5.em
            alignItems = CENTER
            right = 10.px
            bottom = 10.px
            height = 20.px
        }
        ".restaurant" {
            color = RED
            fontSize = 1.3.em
            marginLeft = 10.percent
        }
    }
