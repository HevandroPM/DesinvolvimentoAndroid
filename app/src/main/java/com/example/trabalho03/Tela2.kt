package com.example.trabalho03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var btnCadastrar:Button
lateinit var btnCancelar:Button

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        btnCadastrar = findViewById(R.id.t2_btn_cadastrar)
        btnCancelar = findViewById(R.id.btn_cancelar)

        supportActionBar?.hide();

        btnCadastrar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnCancelar.setOnClickListener {
            finish()
        }
    }
}