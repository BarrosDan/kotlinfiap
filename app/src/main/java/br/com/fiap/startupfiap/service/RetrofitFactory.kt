package br.com.fiap.startupfiap.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitFactory {
    private val URL = "https://viacep.com.br/ws/"

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create()).build()

    fun getAdressService():AdressService{
        return retrofitFactory.create(AdressService::class.java)
    }

}