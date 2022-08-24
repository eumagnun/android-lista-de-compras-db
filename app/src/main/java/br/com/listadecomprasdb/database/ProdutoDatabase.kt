package br.com.listadecomprasdb.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.listadecomprasdb.dao.ProdutoDao
import br.com.listadecomprasdb.model.Produto

@Database(entities = [Produto::class], version = 1)//versão está relacionada a estrutura do banco
abstract class ProdutoDatabase : RoomDatabase() {
    abstract fun produtoDao(): ProdutoDao

}