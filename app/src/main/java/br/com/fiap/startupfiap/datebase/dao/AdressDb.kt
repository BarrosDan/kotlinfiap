package br.com.fiap.startupfiap.datebase.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.fiap.startupfiap.model.Adress


@Database(entities = [Adress::class], version = 1)
 abstract class AdressDb: RoomDatabase() {
    abstract fun adressDao(): AdressDao

    companion object {

        private lateinit var instance: AdressDb

        fun getDatabase(context: Context): AdressDb {
            if (!Companion::instance.isInitialized) {
                instance = Room
                    .databaseBuilder(
                        context,
                        AdressDb::class.java,
                        "adress_db"
                    )
                    .allowMainThreadQueries()
                    .build()
            }
            return instance
        }
    }
}





