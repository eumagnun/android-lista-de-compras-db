package br.com.listadecomprasdb.dao

import br.com.listadecomprasdb.model.Produto

class FakeDataBase {

    companion object app{
        var database = mutableListOf<Produto>()

    }
}