package com.example.cambiarventanas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var btnCambiarPantalla: Button
    lateinit var entrada: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCambiarPantalla = findViewById<Button>(R.id.boton)
        entrada = findViewById(R.id.texto)

        btnCambiarPantalla.setOnClickListener {
            var etext = entrada.text.toString()
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("usuario", etext)
            startActivity(intent)
        }


    }
}