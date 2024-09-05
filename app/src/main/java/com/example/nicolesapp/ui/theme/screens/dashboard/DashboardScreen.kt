package com.example.nicolesapp.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nicolesapp.R
import com.example.nicolesapp.navigation.ROUT_HOME
import com.example.nicolesapp.navigation.ROUT_INTENT
import com.example.nicolesapp.ui.theme.Babypink
import com.example.nicolesapp.ui.theme.Mypurple


@Composable

fun DashboardScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Welcome to Insight",
            fontSize = 50.sp,
            fontFamily = FontFamily.Cursive,
            color = Mypurple

        )
        Image(
            painter = painterResource(id = R.drawable.wellbeing),
            contentDescription = "home",
            modifier = Modifier
                .size(150.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Every small step you take is progress...",
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black

        )
        Spacer(modifier = Modifier.height(20.dp))

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//Start of Main Card
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(700.dp),
                shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp),
                colors = CardDefaults.cardColors(Babypink)) {

                //Row 1
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card 1
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { navController.navigate(ROUT_HOME) },
                        elevation = CardDefaults.cardElevation(10.dp)) {

                        Column {
                            Spacer(modifier = Modifier.height(10.dp))
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.session),
                                    contentDescription = "home",
                                    modifier = Modifier.size(100.dp))

                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Book a session",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center)
                        }

                    }
                    Spacer(modifier = Modifier.width(25.dp))
                    //Card 2
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { navController.navigate(ROUT_HOME) },
                        elevation = CardDefaults.cardElevation(10.dp)) {

                        Column {
                            Spacer(modifier = Modifier.height(10.dp))
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.contacts),
                                    contentDescription = "peace",
                                    modifier = Modifier.size(100.dp))

                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Contacts",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center)
                        }

                    }
                }

                //End of Row 1
                Row(modifier = Modifier.padding(start = 100.dp)){
                    //Card 3
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { navController.navigate(ROUT_INTENT) },
                        elevation = CardDefaults.cardElevation(10.dp)) {


                        Column {
                            Spacer(modifier = Modifier.height(10.dp))
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.payment),
                                    contentDescription = "productivity",
                                    modifier = Modifier.size(100.dp))

                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Payment",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center)
                        }

                    }

                }



                //End of Row 2
            }
//End of Main Card
        }






    }

}






@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())


}