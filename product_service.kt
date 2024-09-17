package com.example.myapplication2.Apple_products


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

//const val BASE_URL = "http://10.0.2.2/aubweekend1/read.php?api_key=preksa" (original URL)
const val BASE_URL = "http://10.0.2.2:80"

interface ProductService{
    @GET("Apple_project/read1.php")
    suspend fun getProduct(
//        @Query("language") language: String = "en-US",
//        @Query("page") page: Int = 1,
        @Query("api_key") apiKey: String = "preksa"
    ):ProductModel

    companion object {
        var service : ProductService? = null
        fun getProduct(): ProductService {
            if(service == null){
                service = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(ProductService::class.java)
            }
            return service!!
        }
    }
}