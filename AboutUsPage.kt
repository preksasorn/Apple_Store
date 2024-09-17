package com.example.myapplication2.Apple_products

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip
import androidx.navigation.NavHostController
import com.example.myapplication2.R
import androidx.compose.foundation.Image

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutUsPage(navController: NavHostController, vm: ProductViewModels) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("About Us") },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(
                            imageVector = Icons.Rounded.ArrowBackIosNew,
                            contentDescription = "Back",
                            modifier = Modifier.size(30.dp)
                        )
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFF2B96E7)
                )
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFFFFF))
                .padding(innerPadding)
                .padding(16.dp), // Padding around the entire content
            contentAlignment = Alignment.TopCenter
        ) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Profile Image
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape) // Default background in case image doesn't load
                            .padding(4.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.applelogo), // Replace with your drawable resource ID
                            contentDescription = "Profile Image",
                            modifier = Modifier.size(100.dp)
                        )
                    }

                    Text(
                        text = "About Us",
                        style = TextStyle(
                            fontSize = 28.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                    )

                    Text(
                        text = "We are a company dedicated to providing the best service possible. Our mission is to offer quality products and exceptional customer support. We strive to continuously improve and exceed our customers' expectations.",
                        style = TextStyle(
                            fontSize = 16.sp,
                            color = Color.Gray,
                            textAlign = TextAlign.Center
                        ),
                        modifier = Modifier.padding(bottom = 8.dp)
                    )

                    Text(
                        text = "Thank you for visiting our app. We look forward to serving you!",
                        style = TextStyle(
                            fontSize = 14.sp,
                            color = Color.DarkGray,
                            textAlign = TextAlign.Center
                        ),
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    // Connect Icons
                    Row(
                        modifier = Modifier.padding(top = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(24.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Phone,
                            contentDescription = "Phone",
                            tint = Color.Black,
                            modifier = Modifier
                                .size(24.dp)
                                .clickable { /* Handle phone click action */ }
                        )
                        Icon(
                            imageVector = Icons.Rounded.Email,
                            contentDescription = "Email",
                            tint = Color.Black,
                            modifier = Modifier
                                .size(24.dp)
                                .clickable { /* Handle email click action */ }
                        )
                    }
                }
            }
        }
    }
}
