package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val mail = findViewById<EditText>(R.id.email)

        val toGameMenu = findViewById<Button>(R.id.loginButton)
        toGameMenu.setOnClickListener {

            if(mail.text.toString().isEmpty()){
                Toast.makeText(this,
                    "Please enter your name", Toast.LENGTH_SHORT).show()
            }else{
                val intent2 = Intent(this, QuestionAct::class.java)
                intent2.putExtra(Constants.USER_NAME, mail.text.toString())
                startActivity(intent2)
                finish()
            }
        }
    }
}