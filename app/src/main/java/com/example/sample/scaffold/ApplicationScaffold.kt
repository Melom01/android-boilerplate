package com.example.sample.scaffold

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.navigation.Navigator
import com.example.sample.navigation.NavigationComponent

@Composable
fun ApplicationScaffold(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val navigator = Navigator(navController)

    Scaffold(
        floatingActionButtonPosition = FabPosition.End,
    ) {
        Box(modifier = modifier.padding(it)) {
            NavigationComponent(
                navController = navController,
                navigator = navigator,
            )
        }
    }
}
