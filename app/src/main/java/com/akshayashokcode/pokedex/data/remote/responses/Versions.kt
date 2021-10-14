package com.akshayashokcode.pokedex.data.remote.responses

import com.google.gson.annotations.SerializedName

data class Versions(
    @SerializedName("generation-i")
    val GenerationI: GenerationI,
    @SerializedName("generation-ii")
    val GenerationIi: GenerationIi,
    @SerializedName("generation-iii")
    val GenerationIii: GenerationIii,
    @SerializedName("generation-iv")
    val GenerationIv: GenerationIv,
    @SerializedName("generation-v")
    val GenerationV: GenerationV,
    @SerializedName("generation-vi")
    val GenerationVi: GenerationVi,
    @SerializedName("generation-vii")
    val GenerationVii: GenerationVii,
    @SerializedName("generation-viii")
    val GenerationViii: GenerationViii
)