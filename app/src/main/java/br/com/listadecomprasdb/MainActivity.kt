package br.com.listadecomprasdb

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.listadecomprasdb.dao.FakeDataBase
import br.com.listadecomprasdb.model.Produto

class MainActivity : AppCompatActivity() {

    lateinit var etProduto: EditText;
    lateinit var etMarca: EditText;
    lateinit var etQuantidade: EditText;
    lateinit var btSalvar: Button;
    lateinit var tvListaCompras: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etProduto = findViewById(R.id.etProduto)
        etMarca = findViewById(R.id.etMarca)
        etQuantidade = findViewById(R.id.etQuantidade)
        btSalvar = findViewById(R.id.btSalvar)
        tvListaCompras = findViewById(R.id.tvListaCompras)

        btSalvar.setOnClickListener {
            FakeDataBase.database.add(
                Produto(
                    1,
                    etProduto.text.toString(),
                    etMarca.text.toString(),
                    etQuantidade.text.toString().toInt()
                )
            )

            atualizarLista(FakeDataBase.database)
            limparCampos()
        }
    }

    private fun atualizarLista(listaProdutos: List<Produto>) {
        var saida = "Produto, Marca, Quantidade\n"
        listaProdutos.forEach { prod ->
            saida += "${prod.nome},${prod.marca}, ${prod.quantidade}\n"
        }
        tvListaCompras.text = saida
    }

    private fun limparCampos(){
        etProduto.text.clear()
        etMarca.text.clear()
        etQuantidade.text.clear()
    }

}