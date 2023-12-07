package com.example.trabalho03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

lateinit var btnLogin2:Button
lateinit var tela_cadastro2:TextView
lateinit var tela_alnvlt:TextView

class TesteUltimo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste_ultimo)

        btnLogin2 = findViewById(R.id.bt_entrar2)

        tela_cadastro2 = findViewById(R.id.tela_cadastro)

        tela_alnvlt = findViewById(R.id.alunoVlt)

        tela_alnvlt.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        tela_cadastro2.setOnClickListener(){
            val intent = Intent(this, Tela2::class.java)
            startActivity(intent)
        }

        btnLogin2.setOnClickListener(){
            val intent = Intent(this, mainInstrutor::class.java)
            startActivity(intent)
        }
    }
}