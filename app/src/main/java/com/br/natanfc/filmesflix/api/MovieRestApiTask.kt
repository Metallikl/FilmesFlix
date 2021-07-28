package com.br.natanfc.filmesflix.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MovieRestApiTask {

    companion object{
        const val BASE_URL = "https://raw.githubusercontent.com/"
    }

    private fun moviewProdiver(): Retrofit =
                     Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

    fun retrofitApi() : MovieApi = moviewProdiver().create(MovieApi::class.java)
}