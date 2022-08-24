package br.com.listadecomprasdb.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Produto(

    @PrimaryKey(autoGenerate = true)
    var id:Long=0,
    val nome:String,
    val marca:String,
    val quantidade:Int
)