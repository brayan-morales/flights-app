package com.example.flightsapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.flightsapp.screens.LoginScreen
import com.example.flightsapp.screens.SignUpScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ){
        composable("login"){
            LoginScreen(navController)
        }
        composable("signup"){
            SignUpScreen(navController)
        }
    }
}