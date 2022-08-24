package br.com.listadecomprasdb.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.listadecomprasdb.dao.ProdutoDao
import br.com.listadecomprasdb.model.Produto

@Database(entities = [Produto::class], version = 1)
abstract class ProdutoDatabase : RoomDatabase() {
    abstract fun getProdutoDao(): ProdutoDao

    companion object {
        private var DB: ProdutoDatabase? = null

        fun getDatabase(context: Context): ProdutoDatabase {
            return DB ?: synchronized(this) {
                val newDB = Room.databaseBuilder(
                    context.applicationContext,
                    ProdutoDatabase::class.java,
                    "produto_db"
                )
                    .allowMainThreadQueries()//não faça isso em PRD
                    .build()
                DB = newDB
                newDB
            }
        }
    }
}