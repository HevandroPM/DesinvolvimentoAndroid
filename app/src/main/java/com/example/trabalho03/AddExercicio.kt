package com.example.trabalho03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log;

lateinit var btnAdicionar: Button
lateinit var btnCancel: Button

class AddExercicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_exercicio)

        btnAdicionar = findViewById(R.id.btn_confirmaCadastro)
        btnCancel = findViewById(R.id.btn_retorno)

        btnAdicionar.setOnClickListener(){
            println("Exercicio Adicionado");
        }

        btnCancel.setOnClickListener(){
            val intent = Intent(this, mainInstrutor::class.java)
            startActivity(intent)
        }
    }
}