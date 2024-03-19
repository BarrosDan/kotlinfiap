package br.com.fiap.startupfiap.datebase.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.startupfiap.model.Adress

@Dao
interface AdressDao {

    @Insert
    fun insert(adress: Adress):String

    @Update
    fun atualizar(adress:Adress): String

    @Delete
    fun excluir (adress:Adress): String

    @Query("SELECT * FROM tbl_adress ORDER BY id ASC")
    fun listar(): List<Adress>
}