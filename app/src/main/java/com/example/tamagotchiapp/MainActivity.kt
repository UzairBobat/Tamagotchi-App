package com.example.tamagotchiapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //By using the command we initiating the code to go to the next screen
        val startBtn = findViewById<Button>(R.id.startBtn)
        startBtn.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))

        }
    }
}
