package com.example.plugins

import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.CallLogging

/**
 * This file is in charge of installing [CallLogging] plug-in
 */
fun Application.configureMonitoring() {
    install(CallLogging)
}
