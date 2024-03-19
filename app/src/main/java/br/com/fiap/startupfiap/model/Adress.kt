package br.com.fiap.startupfiap.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "tbl_adress")
data class Adress(
@PrimaryKey(autoGenerate = true) val id: Long = 0,
    val cep: String = "",
   @SerializedName("logradouro") val rua: String = "",
    @SerializedName("localidade") val cidade: String = "",
    val bairro: String = "",
    val uf: String = ""

    )