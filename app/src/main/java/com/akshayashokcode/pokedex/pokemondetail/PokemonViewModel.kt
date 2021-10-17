package com.akshayashokcode.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.akshayashokcode.pokedex.data.remote.responses.Pokemon
import com.akshayashokcode.pokedex.repository.PokemonRepository
import com.akshayashokcode.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val repository: PokemonRepository
):ViewModel() {
    suspend fun getPokemonInfo(pokemonName:String):Resource<Pokemon>{
        return repository.getPokemonInfo(pokemonName)
    }
}