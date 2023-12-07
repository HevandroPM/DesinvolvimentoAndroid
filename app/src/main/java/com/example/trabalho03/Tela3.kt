package com.example.trabalho03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

lateinit var btnVoltar:Button
lateinit var view1:View
lateinit var view2:View

class Tela3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        btnVoltar = findViewById(R.id.btn_voltar)
        view1 = findViewById(R.id.view11_i)
        view2 = findViewById(R.id.view12_i)

        supportActionBar?.hide();

        btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        view1.setOnClickListener {
            val intent = Intent(this, Tela4::class.java)
            startActivity(intent)
        }

        view2.setOnClickListener {
            val intent = Intent(this, Tela4::class.java)
            startActivity(intent)
        }

    }
}