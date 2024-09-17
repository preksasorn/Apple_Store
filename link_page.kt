package com.example.myapplication2.Apple_products

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController



@Composable
fun link_Page() {
    val vm=ProductViewModels()
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home_page") {
        composable(route = "Home_page") {
            Apple_home(navController,vm)
        }
        composable(route = "First_page") {
            Apple_first(navController,vm)
        }
        composable(route = "ListMenuApple") {
            ProductScaffold(vm, navController)
        }
        composable("product_detail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: ""
            ProductDetailScreen(productId = productId, vm, navController = navController)
        }
        composable(route = "About_us") {
            AboutUsPage(navController,vm)
        }
        composable(route = "cart") {
            FavoriteFoodScreen(navController,vm)
        }


    }
}