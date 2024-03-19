package br.com.fiap.startupfiap.service

import br.com.fiap.startupfiap.model.Adress
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface AdressService {
    @GET("{cep}/json/")
    fun getAdressbyCep(@Path("cep")cep:String): Call<Adress>

    @GET("{uf}/{cidade}/{rua}/json/")
    fun getAdressbyUfCidade(
        @Path("uf")uf: String,
        @Path("cidade")cidade:String,
        @Path("rua")rua: String
    ): List<Call<Adress>>
}