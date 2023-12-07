package com.example.trabalho03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

lateinit var btn_add:Button
lateinit var btn_vlt:Button
lateinit var view22: View
lateinit var view23: View


class mainInstrutor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_instrutor)

        btn_add = findViewById(R.id.btn_add)
        btn_vlt = findViewById(R.id.btn_voltar)
        view22 = findViewById(R.id.view11_i)
        view23 = findViewById(R.id.view12_i)

        btn_add.setOnClickListener(){
            val intent = Intent(this, AddExercicio::class.java)
            startActivity(intent)
        }

        btn_vlt.setOnClickListener(){
            val intent = Intent(this, TesteUltimo::class.java)
            startActivity(intent)
        }

        view22.setOnClickListener {
            val intent = Intent(this, Tela4::class.java)
            startActivity(intent)
        }

        view23.setOnClickListener {
            val intent = Intent(this, Tela4::class.java)
            startActivity(intent)
        }
    }
}