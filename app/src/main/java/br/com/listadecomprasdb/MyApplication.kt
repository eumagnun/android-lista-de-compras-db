package br.com.listadecomprasdb

import android.app.Application
import br.com.listadecomprasdb.database.ProdutoDatabase

class MyApplication: Application() {

    companion object app{
        var database: ProdutoDatabase?=null
    }

    override fun onCreate() {
        super.onCreate()
        database = ProdutoDatabase.getDatabase(this)
    }
}