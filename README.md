Lunch Monitor [![Build Status](https://travis-ci.org/christian-draeger/lunch-monitor.svg?branch=master)](https://travis-ci.org/christian-draeger/lunch-monitor)
=============

**This project is build with a Kotlin only Stack (because I wanted to try it):** 
* [Ktor](https://ktor.io)
* [kotlinx.html](https://github.com/Kotlin/kotlinx.html)
* [Kotlin CSS DSL](https://github.com/olegcherr/Aza-Kotlin-CSS)
* [skrape{it}](docs.skrape.it)
    
### Production usage
    
Assembles a deployable fat-jar:

    ./gradlew stage
    
### Local Development

Start application on local machine (http://localhost:8080):

    ./gradlew run
    
Run all Tests:

    ./gradlew check