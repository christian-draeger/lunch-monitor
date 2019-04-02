Lunch Monitor [![Build Status](https://travis-ci.org/christian-draeger/lunch-monitor.svg?branch=master)](https://travis-ci.org/christian-draeger/lunch-monitor)
=============

**Kotlin only Stack:** Ktor, kotlinx.html, kotlinx.css, skrape{it}, gradle (with kotlin DSL)
    
### Production usage
    
Assembles a deployable fat-jar:

    ./gradlew stage
    
### Local Development

Start application on local machine (http://localhost:8080):

    ./gradlew run
    
Run all Tests:

    ./gradlew check