package br.com.fiap.startupfiap.datebase.repository

import android.content.Context
import br.com.fiap.startupfiap.datebase.dao.AdressDb
import br.com.fiap.startupfiap.model.Adress

class AdressRepository(context: Context) {

    private  val db = AdressDb.getDatabase(context).adressDao()

        fun insert(adress: Adress):String{
            return db.insert(adress)
        }

        fun atualizar(adress: Adress):String{
            return db.atualizar(adress)
        }

        fun excluir(adress: Adress):String{
            return db.excluir(adress)
        }

        fun listar(adress: Adress):List<Adress>{
            return db.listar()
        }

}