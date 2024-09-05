package com.example.nicolesapp.ui.theme.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nicolesapp.R
import com.example.nicolesapp.navigation.ROUT_ABOUT
import com.example.nicolesapp.navigation.ROUT_ADD
import com.example.nicolesapp.navigation.ROUT_DASHBOARD
import com.example.nicolesapp.navigation.ROUT_LOGIN
import com.example.nicolesapp.navigation.ROUT_SIGNUP
import com.example.nicolesapp.navigation.ROUT_SPLASH
import com.example.nicolesapp.ui.theme.Babypink
import com.example.nicolesapp.ui.theme.Mypurple
import com.example.nicolesapp.ui.theme.serenepink


@Composable
fun HomeScreen(navController: NavController){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(serenepink),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "home",
            modifier = Modifier
                .size(300.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Welcome",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.White,
            fontWeight = FontWeight.ExtraBold

        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Learn how to relax with guided sessions and sleep better with Sounds.Meditate to discoveryour inner self",
            fontSize = 18.sp,
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.Center,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Your journey to mental clarity starts here...",
            fontSize = 18.sp,
            fontFamily = FontFamily.Serif,
            color = Color.White,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(50.dp))

        OutlinedButton(
            onClick = { navController.navigate(ROUT_SIGNUP) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(10.dp)
        ){
            Text(text = "Sign Up",fontSize = 20.sp,)
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.navigate(ROUT_LOGIN) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 30.dp, end = 30.dp),
            colors = ButtonDefaults.buttonColors(Mypurple),
            shape = RoundedCornerShape(10.dp)
        ){
            Text(text = "Login",fontSize = 20.sp,)
        }

        Spacer(modifier = Modifier.height(20.dp))


        Text(
            text = "Login As An Admin",
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.clickable {
                navController.navigate(ROUT_ADD)
            }

        )


    }
}
@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())


}

