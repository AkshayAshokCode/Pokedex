package com.akshayashokcode.pokedex.data.remote.responses

import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white")
    val BlackWhite: BlackWhite
)