package com.example.trabalho03

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

lateinit var btnLogin:Button
lateinit var tela_cadastro:TextView
lateinit var tela_teste:TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin = findViewById(R.id.bt_entrar2)

        tela_cadastro = findViewById(R.id.tela_cadastro)
        tela_teste = findViewById(R.id.alunoVlt)

        supportActionBar?.hide();

        btnLogin.setOnClickListener(){
            val intent = Intent(this, Tela3::class.java)
            startActivity(intent)
        }

        tela_teste.setOnClickListener(){
            val intent = Intent(this, TesteUltimo::class.java)
            startActivity(intent)
        }


        tela_cadastro.setOnClickListener(){
            val intent = Intent(this, Tela2::class.java)
            startActivity(intent)
        }

    }
}