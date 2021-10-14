package com.akshayashokcode.pokedex.data.remote.responses

import com.google.gson.annotations.SerializedName

data class Other(
    val dream_world: DreamWorld,
    @SerializedName("official-artwork")
    val OfficialArtwork: OfficialArtwork
)