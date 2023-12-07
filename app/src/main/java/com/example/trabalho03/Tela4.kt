package com.example.trabalho03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var btnVoltar2: Button

class Tela4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela4)
        btnVoltar2 = findViewById(R.id.btn_voltar2)

        supportActionBar?.hide();

        btnVoltar2.setOnClickListener {
            val intent = Intent(this, Tela3::class.java)
            startActivity(intent)
        }
    }
}