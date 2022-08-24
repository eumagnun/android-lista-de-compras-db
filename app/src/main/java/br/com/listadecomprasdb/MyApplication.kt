package br.com.listadecomprasdb

import android.app.Application
import androidx.room.Room
import br.com.listadecomprasdb.database.ProdutoDatabase

class MyApplication: Application() {

    companion object app{
        lateinit var database: ProdutoDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            ProdutoDatabase::class.java, "meu-produtodb2"
        )
            .allowMainThreadQueries() //não faça isso em produção
            .build()
    }
}