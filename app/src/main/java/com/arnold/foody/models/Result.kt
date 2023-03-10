package com.arnold.foody.models


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("aggregateLikes")
    val aggregateLikes: Int,
    @SerializedName("cheap")
    val cheap: Boolean,
    //
    @SerializedName("cookingMinutes")
    val cookingMinutes: Int,
    //
    @SerializedName("dairyFree")
    val dairyFree: Boolean,
    @SerializedName("extendedIngredients")
    val extendedIngredients: List<ExtendedIngredient>,
    @SerializedName("glutenFree")
    val glutenFree: Boolean,
    //
    @SerializedName("healthScore")
    val healthScore: Int,
    //
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    //
    @SerializedName("license")
    val license: String,
    @SerializedName("likes")
    val likes: Int,
    //
    //
    @SerializedName("preparationMinutes")
    val preparationMinutes: Int,
    //
    @SerializedName("readyInMinutes")
    val readyInMinutes: Int,
    //
    @SerializedName("spoonacularSourceUrl")
    val spoonacularSourceUrl: String,
    //
    @SerializedName("summary")
    val summary: String,
    @SerializedName("title")
    val title: String,
    //
    @SerializedName("usedIngredients")
    val usedIngredients: List<Any>,
    //
    @SerializedName("vegan")
    val vegan: Boolean,
    @SerializedName("vegetarian")
    val vegetarian: Boolean,
    @SerializedName("veryHealthy")
    val veryHealthy: Boolean,
    //
    @SerializedName("veryPopular")
    val veryPopular: Boolean
    //
)