package com.example.easyshop.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.easyshop.screen.AuthScreen

@Composable
fun AppNavigation(modifier: Modifier= Modifier)
{
    val navController= rememberNavController()
    NavHost(navController=navController, startDestination = "auth") {
        composable("auth")
        {
            AuthScreen(modifier)
        }

    }
}