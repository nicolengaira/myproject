package com.example.nicolesapp.ui.theme.screens.discover

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nicolesapp.R
import com.example.nicolesapp.ui.theme.Mypurple
import com.example.nicolesapp.ui.theme.screens.dashboard.bottomNavItems


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DiscoverScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar (
                    contentColor = Color.Black){
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge (containerColor = Color.White){
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            }
                        )
                    }
                }
            },



            //Content Section
            content = @Composable{
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),

                    ){
                    //Body of the screen

                    //Column1

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Mypurple)
                            .height(140.dp)
                            .padding(top = 30.dp, start = 20.dp, end = 20.dp)) {


                        Row {

                            Text(
                                text = "Discover",
                                color = Color.White,
                                fontSize = 25.sp,
                                fontWeight = FontWeight.ExtraBold
                            )

                            Spacer(modifier = Modifier.width(250.dp))


                            Icon(
                                imageVector = Icons.Default.Notifications,
                                contentDescription = "",
                                tint = Color.White)
                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        //Searchbar
                        var search by remember { mutableStateOf("") }
                        TextField(
                            value = search,
                            onValueChange = { search = it },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(end = 20.dp),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Search,
                                    contentDescription = "Search"
                                )
                            },
                            placeholder = { Text(text = "Search") }
                        )

                        //End of searchbar

                    }
                    //Colum1-End


                    Spacer(modifier = Modifier.height(20.dp))


                    Column (modifier = Modifier.padding(start = 25.dp,end=25.dp)){

                        Spacer(modifier = Modifier.height(20.dp))

                        Text(
                            text = "Programs",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.height(20.dp))

                        //Card 1
                        Card(
                            modifier = Modifier
                                .height(150.dp)
                                .fillMaxWidth(),
                            colors = CardDefaults.cardColors(Mypurple)
                        ) {

                            Row {

                                Column (modifier = Modifier.padding(20.dp)){
                                    Text(
                                        text = "Courses",
                                        fontSize = 25.sp,
                                        fontWeight = FontWeight.ExtraBold,
                                        color = Color.White
                                    )
                                    Text(
                                        text = "Sessions to boost a skill of mi8ndfullness",
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.ExtraBold,
                                        color = Color.White
                                    )

                                }





                            }


                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        //Card 1
                        Card(
                            modifier = Modifier
                                .height(150.dp)
                                .fillMaxWidth(),
                            colors = CardDefaults.cardColors(Mypurple)
                        ) {

                            Row {

                                Column (modifier = Modifier.padding(20.dp)){
                                    Text(
                                        text = "Singles",
                                        fontSize = 25.sp,
                                        fontWeight = FontWeight.ExtraBold,
                                        color = Color.White
                                    )
                                    Text(
                                        text = "Bite-sized practices to find inner peace.",
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.ExtraBold,
                                        color = Color.White
                                    )

                                }





                            }


                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        //Card 1
                        Card(
                            modifier = Modifier
                                .height(150.dp)
                                .fillMaxWidth(),
                            colors = CardDefaults.cardColors(Mypurple)
                        ) {

                            Row {

                                Column (modifier = Modifier.padding(20.dp)){
                                    Text(
                                        text = "Microlearning",
                                        fontSize = 25.sp,
                                        fontWeight = FontWeight.ExtraBold,
                                        color = Color.White
                                    )
                                    Text(
                                        text = "Heal Your Childhood Traumas",
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.ExtraBold,
                                        color = Color.White
                                    )
                                    Text(
                                        text = "Overcome past hurts",
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.ExtraBold,
                                        color = Color.White
                                    )

                                }





                            }


                        }




                    }






                }

            }

        )

    }


}



val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),

    BottomNavItem(
        title = "Breath",
        route="motivation",
        selectedIcon=Icons.Filled.Info,
        unselectedIcon=Icons.Outlined.Info,
        hasNews = false,
        badges=0
    ),
    BottomNavItem(
        title = "Discover",
        route="discover",
        selectedIcon=Icons.Filled.Star,
        unselectedIcon=Icons.Outlined.Star,
        hasNews = false,
        badges=0
    ),

    BottomNavItem(
        title = "Login",
        route="login",
        selectedIcon=Icons.Filled.Person,
        unselectedIcon=Icons.Outlined.Person,
        hasNews = false,
        badges=0
    ),






    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon : ImageVector,
    val hasNews :Boolean,
    val badges :Int
)


@Composable
@Preview(showBackground = true)
fun DiscoverScreenPreview() {
    DiscoverScreen(rememberNavController())
}
