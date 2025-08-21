package br.unisanta.app2telas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.unisanta.app2telas.Model.Produto
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val edtNome = findViewById<EditText>(R.id.edtNome)
        val edtPreco = findViewById<EditText>(R.id.edtPreco)
        val btn = findViewById<Button>(R.id.btnCadastrar)
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        var prod:Produto = Produto("",0.0)

        btn.setOnClickListener() {
            val nome = edtNome.text.toString()
            val preco = edtPreco.text.toString().toDouble()
            prod = Produto(nome,preco)
        }

        fab.setOnClickListener() {
            val intent = Intent(this,ProdutoActivity::class.java)
            intent.putExtra("produto",prod.toString())
            startActivity(intent)
        }
    }
}