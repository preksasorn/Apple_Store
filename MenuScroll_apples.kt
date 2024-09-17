package com.example.myapplication2.Apple_products

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myapplication2.R


//@Preview(showSystemUi = true)
@Composable
fun AppleMultiLayouts(navController: NavHostController,vm:ProductViewModels) {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter,
    ) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            composeFoodRow(navController,vm)
            ComposeFoodRow(navController,vm)
            composeFoodRows(navController,vm)
        }
    }
}

@Composable
fun composeFoodRow(navController: NavHostController ,vm:ProductViewModels) {
    Text(text = "Iphone products", modifier = Modifier.padding(start = 16.dp, top = 8.dp, bottom = 3.dp), fontWeight = FontWeight.Bold, fontSize = 17.sp)
    Surface(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(10.dp)
    ) {
        LazyRow {
            item {
                composeImage(navController,vm)
            }
        }
    }
}

@Composable
fun ComposeFoodRow(navController: NavHostController,vm:ProductViewModels) {
    Text(text = "Mak Books", modifier = Modifier.padding(start = 16.dp, top = 8.dp, bottom = 3.dp), fontWeight = FontWeight.Bold, fontSize = 17.sp)
    Surface(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(10.dp)
    ) {
        LazyRow {
            item {
                composeImage2(navController,vm)
            }
        }
    }
}
@Composable
fun composeFoodRows(navController: NavHostController,vm:ProductViewModels) {
    Text(text = "Spacial Offer", modifier = Modifier.padding(start = 16.dp, top = 8.dp, bottom = 3.dp), fontWeight = FontWeight.Bold, fontSize = 17.sp)
    Surface(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(10.dp)
    ) {
        LazyRow {
            item {
                composeImage3(navController,vm)
            }
        }
    }
}

@Composable
fun composeImage(navController: NavHostController,vm:ProductViewModels) {
    Image(
        painter = painterResource(id = R.drawable.phone),
        contentDescription = "Your Image",
        modifier = Modifier
            .fillMaxHeight()
            .width(380.dp)
            .padding(end = 10.dp)
            .clickable {
                navController.navigate("ListMenuApple")
            },
        contentScale = ContentScale.Crop


    )

    Image(
        painter = painterResource(id = R.drawable.apple15),
        contentDescription = "Your Image",
        modifier = Modifier
            .fillMaxHeight()
            .width(380.dp)
            .padding(end = 10.dp)
            .clickable {
                navController.navigate("ListMenuApple")
            },// Set the desired height here
        contentScale = ContentScale.Crop
    )
    Image(
        painter = painterResource(id = R.drawable.iphoneall),
        contentDescription = "Your Image",
        modifier = Modifier
            .fillMaxHeight()
            .width(380.dp)
            .padding(end = 10.dp)
            .clickable {
                navController.navigate("ListMenuApple")
            },// Set the desired height here
        contentScale = ContentScale.Crop
    )
}

@Composable
fun composeImage2(navController: NavHostController,vm:ProductViewModels) {
    Image(
        painter = painterResource(id = R.drawable.maxresdefault),
        contentDescription = "Your Image",
        modifier = Modifier
            .fillMaxHeight()
            .width(380.dp)
            .padding(end = 10.dp)
            .clickable {
                navController.navigate("ListMenuApple")
            },// Set the desired height here
        contentScale = ContentScale.Crop
    )

    Image(
        painter = painterResource(id = R.drawable.macbook1),
        contentDescription = "Your Image",
        modifier = Modifier
            .fillMaxHeight()
            .width(380.dp)
            .padding(end = 10.dp)
            .clickable {
                navController.navigate("ListMenuApple")
            },// Set the desired height here

        contentScale = ContentScale.Crop
    )
    Image(
        painter = painterResource(id = R.drawable.makboo2),
        contentDescription = "Your Image",
        modifier = Modifier
            .fillMaxHeight()
            .width(380.dp)
            .padding(end = 10.dp)
            .clickable {
                navController.navigate("ListMenuApple")
            },
        contentScale = ContentScale.Crop
    )
}

@Composable
fun composeImage3(navController: NavHostController,vm:ProductViewModels) {
    Image(
        painter = painterResource(id = R.drawable.smartwatch2),
        contentDescription = "Your Image",
        modifier = Modifier
            .fillMaxHeight()
            .width(390.dp)
            .padding(end = 10.dp)
            .padding(end = 10.dp)
            .clickable {
                navController.navigate("ListMenuApple")
            },// Set the desired height here
        contentScale = ContentScale.Crop
    )

    Image(
        painter = painterResource(id = R.drawable.smartwatch3),
        contentDescription = "Your Image",
        modifier = Modifier
            .fillMaxHeight()
            .width(380.dp)
            .padding(end = 10.dp)
            .clickable {
                navController.navigate("ListMenuApple")
            },// Set the desired height here
        contentScale = ContentScale.Crop
    )
    Image(
        painter = painterResource(id = R.drawable.smartwatch1),
        contentDescription = "Your Image",
        modifier = Modifier
            .fillMaxHeight()
            .width(380.dp)
            .padding(end = 10.dp),// Set the desired height here
        contentScale = ContentScale.Crop
    )
}
