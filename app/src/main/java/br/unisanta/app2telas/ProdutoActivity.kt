package br.unisanta.app2telas

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProdutoActivity : AppCompatActivity(R.layout.activity_produto) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val txtProduto = findViewById<TextView>(R.id.txtProduto)
        val fabVolta = findViewById<FloatingActionButton>(R.id.fabVolta)

        val produto = intent.getStringExtra("produto")
        txtProduto.text = "Produto Cadastrado: $produto"

        fabVolta.setOnClickListener() {
            finish()
        }
    }
}