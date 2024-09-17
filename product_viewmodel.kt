package com.example.myapplication2.Apple_products

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication2.models.FoodModel
import kotlinx.coroutines.launch


class ProductViewModels : ViewModel() {
    private val _records = mutableStateListOf<Records>()
    var errorMessage by mutableStateOf("")
    var isLoading by mutableStateOf(false)
    val records: List<Records> get() = _records

    private val apiService = ProductService.getProduct()

    fun getResultList() {
        viewModelScope.launch {
            isLoading = true
            try {
                _records.clear()
                _records.addAll(apiService.getProduct().records) // Adjust based on your actual API response structure
            } catch (e: Exception) {
                errorMessage = e.message.orEmpty()
            } finally {
                isLoading = false
            }
        }
    }
    ///


    val favoriteList: MutableState<MutableList<Records>>
            = mutableStateOf(mutableListOf())

    fun addToFavorite(element: Records){
        val newList = favoriteList.value.toMutableList()
        newList.add(element)
        favoriteList.value = newList
    }

    fun removeFromFavorite(element: Records){
        val newList = favoriteList.value.toMutableList()
        newList.remove(element)
        favoriteList.value = newList
    }

    fun isInFavorite(element : Records) = favoriteList.value.contains(element)

    fun numOfFavorite() = favoriteList.value.size

}
