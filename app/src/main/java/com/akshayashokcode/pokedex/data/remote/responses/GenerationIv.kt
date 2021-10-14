package com.akshayashokcode.pokedex.data.remote.responses

import com.google.gson.annotations.SerializedName

data class GenerationIv(
    @SerializedName("diamond-pearl")
    val DiamondPearl: DiamondPearl,
    @SerializedName("heartgold-soulsilver")
    val HeartgoldSoulsilver: HeartgoldSoulsilver,
    val platinum: Platinum
)