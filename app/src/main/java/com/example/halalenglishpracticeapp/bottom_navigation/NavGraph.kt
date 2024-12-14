package com.example.halalenglishpracticeapp.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(
    navHostController: NavHostController
) {

    NavHost(navController = navHostController, startDestination = "ready_users_screen"){
        composable("all_users_screen") {
            Screen1()
        }
        composable("new_users_screen") {
            Screen2()
        }
        composable("ready_users_screen") {
            Screen3()
        }
        composable("online_users_screen") {
            Screen4()
        }
        composable("settings_screen") {
            Screen5()
        }

    }
}