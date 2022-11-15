package com.example.cambiarventanas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    lateinit var textoprofile: TextView
    lateinit var botonHome : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        textoprofile = findViewById(R.id.textoprofile)
        botonHome = findViewById(R.id.home)

        val bundle: Bundle? = intent.extras
        val myUser : String ? = bundle?.getString("usuario")

        textoprofile.text = myUser.toString()


        botonHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }



    }
}