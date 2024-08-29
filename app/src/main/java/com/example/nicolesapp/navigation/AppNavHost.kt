package com.example.nicolesapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nicolesapp.ui.theme.screens.home.HomeScreen
import com.example.nicolesapp.ui.theme.screens.about.AboutScreen
import com.example.nicolesapp.ui.theme.screens.details.DetailsScreen
import com.example.nicolesapp.ui.theme.screens.login.LoginScreen
import com.example.nicolesapp.ui.theme.screens.signup.SignupScreen
import com.example.nicolesapp.ui.theme.screens.splash.SplashScreen
import com.example.nicolesapp.ui.theme.screens.intent.IntentScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_HOME
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)

        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)

        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }

        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }

        composable(ROUT_DETAIL) {
            DetailsScreen(navController = navController)

        }

        composable(ROUT_INTENT) {
            IntentScreen(navController = navController)
        }

        composable(ROUT_INTENT) {
            IntentScreen(navController = navController)
        }








    }
}




