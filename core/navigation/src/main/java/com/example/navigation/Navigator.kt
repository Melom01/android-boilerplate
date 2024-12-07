package com.example.navigation

import androidx.navigation.NavController

class Navigator(
    val navController: NavController,
) {
    fun navigateUp() = navController.navigateUp()

    inline fun <reified T : Any> navigateTo(navTarget: T) {
        navController.navigate(navTarget) {
            popUpTo<T>()
        }
    }
}