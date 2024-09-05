package com.example.nicolesapp.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nicolesapp.R
import com.example.nicolesapp.data.AuthViewModel
import com.example.nicolesapp.navigation.ROUT_SIGNUP
import com.example.nicolesapp.ui.theme.Mypurple


@Composable
fun LoginScreen(navController: NavController) {

    Column (modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.background),
            contentScale = ContentScale.FillBounds
        ),
        horizontalAlignment = Alignment.CenterHorizontally)
        {
        Spacer(modifier = Modifier.height(80.dp))


            Text(text = "INSIGHT",
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                color = Mypurple )

            Text(text = "Unlock the serenity within...",
                fontSize = 18.sp,
                fontFamily = FontFamily.SansSerif)

            Spacer(modifier = Modifier.height(20.dp))

            var email by remember {mutableStateOf("")}
            var password by remember { mutableStateOf("")}

          TextField(value = email,
              onValueChange = {email = it},
              label = { Text(text = "Email Address")},
              modifier = Modifier
                  .fillMaxWidth()
                  .padding(start = 20.dp, end = 20.dp),
              leadingIcon = { Image(imageVector = Icons.Default.Email, contentDescription = "")},
              keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))

            Spacer(modifier = Modifier.height(10.dp))

            TextField(value = password,
                onValueChange = {password = it},
                label = { Text(text = "password")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = { Image(imageVector = Icons.Default.Email, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation ())

            Spacer(modifier = Modifier.height(20.dp))

            val context = LocalContext.current
            val authViewModel = AuthViewModel(navController, context)

            Button(onClick = {authViewModel.login(email, password)},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(start = 20.dp, end = 20.dp),
                colors = ButtonDefaults.buttonColors(Color.Magenta),
                shape = RoundedCornerShape(10.dp))
            {
                Text(text = "Log in")
            }

            Spacer(modifier = Modifier.height(10.dp))


            Text(text = "Don't have an account? Register here",
                fontSize = 18.sp,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate(ROUT_SIGNUP)
                    },
                textAlign = TextAlign.Center)
        }
}


@Composable
@Preview(showBackground = true)
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}
