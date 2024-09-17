package com.example.myapplication2
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.myapplication2.Apple_products.ProductViewModels
import com.example.myapplication2.Apple_products.link_Page


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            AsyncApp()



        }
    }
}


// Apple_shop Project
@Composable
fun AsyncApp() {
    val vm = ProductViewModels()
    link_Page()


}

