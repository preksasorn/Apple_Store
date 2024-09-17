package com.example.myapplication2.Apple_products

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.myapplication2.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailScreen(
    productId: String,
    viewModel: ProductViewModels,
    navController: NavHostController
) {
    // Retrieve the product detail based on the productId
    val product = viewModel.records.find { it.pid == productId }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Product Details") },
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
        Surface(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxSize()  // Ensure the Surface takes the full size
        ) {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())  // Make the column scrollable
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                if (product != null) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(
                                width = 2.dp,
                                color = Color(0xFF01CFBC),
                                shape = RoundedCornerShape(15.dp)
                            )
                            .padding(8.dp)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Text(
                            text = product.title,
                            style = MaterialTheme.typography.titleLarge.copy(
                                fontWeight = FontWeight.W500,
                                color = Color.DarkGray
                            ),
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    AsyncImage(
                        model = product.image,
                        contentDescription = product.title,
                        modifier = Modifier.size(250.dp),
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Title: ${product.title}",
                        style = MaterialTheme.typography.titleLarge,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Price: USD ${product.price}",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Text(
                        text = "In Stock: ${product.qty}",
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Text(
                        text = "Description: ${product.body}",  // Changed from "In Stock" to "Description"
                        style = MaterialTheme.typography.bodyMedium
                    )
                } else {
                    Text(
                        text = "Product not found",
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}
