package br.com.listadecomprasdb.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.com.listadecomprasdb.database.FakeDataBase
import br.com.listadecomprasdb.model.Produto

@Dao
interface ProdutoDao {


    @Insert
    fun salvar(produto: Produto)

    @Query("SELECT * FROM Produto")
    fun consultar():List<Produto>
}