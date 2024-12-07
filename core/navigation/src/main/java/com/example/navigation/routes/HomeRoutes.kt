package com.example.navigation.routes

import kotlinx.serialization.Serializable

@Serializable
sealed class HomeRoutes {
    @Serializable
    object HomeModule

    @Serializable
    object Home
}
