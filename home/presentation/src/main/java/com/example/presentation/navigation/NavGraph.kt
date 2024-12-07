package com.example.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.Navigator
import com.example.navigation.routes.HomeRoutes
import com.example.presentation.HomeView

fun NavGraphBuilder.homeGraph(
    navigator: Navigator,
) {
    navigation<HomeRoutes.HomeModule>(
        startDestination = HomeRoutes.Home,
    ) {
        composable<HomeRoutes.Home> {
            HomeView(
                onNavigateButtonClick = {}
            )
        }
    }
}
