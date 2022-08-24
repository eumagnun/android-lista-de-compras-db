package br.com.listadecomprasdb.database

import br.com.listadecomprasdb.model.Produto

class FakeDataBase {

    companion object app{
        var database = mutableListOf<Produto>()

    }
}