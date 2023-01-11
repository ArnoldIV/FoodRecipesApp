package com.arnold.foody.data.network

import com.arnold.foody.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRepiceApi {

    @GET("/recipes/complexSearch")
   suspend fun getRecipes(
        @QueryMap queries: Map<String, String>
    ): Response<FoodRecipe>

   @GET("/recipes/complexSearch")
   suspend fun searchRecipes(
       @QueryMap searchQuery: Map<String, String>
   ):Response<FoodRecipe>

}