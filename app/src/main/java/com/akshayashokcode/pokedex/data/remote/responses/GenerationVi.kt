package com.akshayashokcode.pokedex.data.remote.responses

import com.google.gson.annotations.SerializedName

data class GenerationVi(
    @SerializedName("omegaruby-alphasapphire")
    val OmegarubyAlphasapphire: OmegarubyAlphasapphire,
    @SerializedName("x-y")
    val xy: XY
)