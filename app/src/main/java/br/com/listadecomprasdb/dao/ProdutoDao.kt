package br.com.listadecomprasdb.dao

import br.com.listadecomprasdb.model.Produto

class ProdutoDao {


    fun salvar(produto: Produto){
        FakeDataBase.database.add(produto)
    }

    fun consultar():List<Produto>{
        return FakeDataBase.database
    }
}