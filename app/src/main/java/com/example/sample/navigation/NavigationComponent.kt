package com.example.sample.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.navigation.Navigator
import com.example.navigation.routes.HomeRoutes
import com.example.presentation.navigation.homeGraph

@Composable
fun NavigationComponent(
    navController: NavHostController,
    navigator: Navigator,
) {
    NavHost(
        navController = navController,
        startDestination = HomeRoutes.HomeModule,
    ) {
        homeGraph(
            navigator = navigator,
        )
    }
}
