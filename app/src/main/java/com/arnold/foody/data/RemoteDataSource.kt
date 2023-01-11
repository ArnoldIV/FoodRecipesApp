package com.arnold.foody.data

import com.arnold.foody.data.network.FoodRepiceApi
import com.arnold.foody.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor (
    private val foodRepiceApi: FoodRepiceApi
        ) {

    suspend fun getRecipes(queries : Map<String, String>): Response<FoodRecipe>{
       return foodRepiceApi.getRecipes(queries)
    }

    suspend fun searchRecipes(searchQuery: Map<String, String>):Response<FoodRecipe>{
        return foodRepiceApi.searchRecipes(searchQuery)
    }

}