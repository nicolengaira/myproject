package com.example.nicolesapp.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.nicolesapp.R
import com.example.nicolesapp.navigation.ROUT_HOME
import com.example.nicolesapp.navigation.ROUT_LOGIN
import com.example.nicolesapp.ui.theme.Babypink
import com.example.nicolesapp.ui.theme.Mypurple
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition", "ResourceType")
@Composable
fun SplashScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Babypink),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)

    {
        var coroutineScope = rememberCoroutineScope()
        coroutineScope.launch {
            delay(2000)
            navController.navigate(ROUT_HOME)
        }

        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.mentalwellness))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(400.dp)
        )
        //End of lottie

        Text(
            text = "Insight",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Mypurple

        )






        }
    }
@Composable
@Preview(showBackground = true)
fun SplashScreenPreview() {
    SplashScreen(rememberNavController(

    ))
}