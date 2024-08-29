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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.example.nicolesapp.ui.theme.Babypink
import com.example.nicolesapp.R
import com.example.nicolesapp.ui.theme.Mypurple


@Composable
fun DashboardScreen(navController: NavController) {

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally)

    {
        Text(
            text = "Insight",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Mypurple
        )

        Image(
            painter = painterResource(id = R.drawable.wellness),
            contentDescription = "home",
            modifier = Modifier
                .size(150.dp),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "Start your healing today...",
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(10.dp))


        //Start of main card
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(700.dp),
            shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp),
            colors = CardDefaults.cardColors(Babypink)
        ) {
            //start of Row1
            Row(modifier = Modifier.padding(20.dp))
            {
                //Card1
                Card(
                    modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable {
                        })
                {
                    Column {
                        Spacer(modifier = Modifier.height(15.dp))

                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center)
                        {
                            Image(painter = painterResource(id = R.drawable.finance),
                                contentDescription = "financial freedom",
                                modifier = Modifier.size(100.dp))
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = "Financial Freedom",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                //End of Card1

                Spacer(modifier = Modifier.height(10.dp))

                //Card2
                Card(
                    modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable {
                        })
                {
                    Column {
                        Spacer(modifier = Modifier.height(15.dp))

                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center)
                        {
                            Image(painter = painterResource(id = R.drawable.productive),
                                contentDescription = "productivity",
                                modifier = Modifier.size(100.dp))
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = "Productivity",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                //End of Card2
            }
            //End of Row1

            //Start of Row2
            Row(modifier = Modifier.padding(20.dp))
            {
                //Card1
                Card(
                    modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable {
                        })
                {
                    Column {
                        Spacer(modifier = Modifier.height(15.dp))

                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center)
                        {
                            Image(painter = painterResource(id = R.drawable.healthymind),
                                contentDescription = "wellness",
                                modifier = Modifier.size(100.dp))
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = "Feeling Well",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                //End of Card1

                Spacer(modifier = Modifier.height(10.dp))

                //Card2
                Card(
                    modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable {
                        })
                {
                    Column {
                        Spacer(modifier = Modifier.height(15.dp))

                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center)
                        {
                            Image(painter = painterResource(id = R.drawable.peace),
                                contentDescription = "personal life",
                                modifier = Modifier.size(100.dp))
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = "Personal Life",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                //End of Card2
            }
            //End of Row2






        }

    }


}
@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview() {
    DashboardScreen(rememberNavController())
}



