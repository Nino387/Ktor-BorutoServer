package com.example.plugins

import io.ktor.serialization.*
import io.ktor.features.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*

/**
 * This file is in charge of installing [ContentNegotiation] plug-in for serialization/deserialization
 */
fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}
