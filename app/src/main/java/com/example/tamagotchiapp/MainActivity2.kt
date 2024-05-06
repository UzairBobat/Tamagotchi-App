package com.example.tamagotchiapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

// Name: Uzair Bobat
// Student Number: ST10441225
// YouTube Video Link: https://www.youtube.com/watch?v=pN7u-TflBS0

class GameActivity : AppCompatActivity() {

    //This command initialises the variables
    private lateinit var petImageView: ImageView
    private lateinit var healthTextView: TextView
    private lateinit var hungerTextView: TextView
    private lateinit var cleanlinessTextView: TextView

    private var health = 100
    private var hunger = 0
    private var cleanliness = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //This declares the variables
        petImageView = findViewById(R.id.petImageView)
        healthTextView = findViewById(R.id.healthTextView)
        hungerTextView = findViewById(R.id.hungerTextView)
        cleanlinessTextView = findViewById(R.id.cleanlinessTextView)
    }

    fun onFeedClicked(view: android.view.View) {
        petImageView.setImageResource(R.drawable.dogeating)
        // The values will change based on the commands initialised
        health += 10
        if (health > 100) health = 100
        hunger -= 20
        if (hunger < 0) hunger = 0
        updateStatus()
        Toast.makeText(this, "Feeding the pet!", Toast.LENGTH_SHORT).show()
    }

    fun onCleanClicked(view: android.view.View) {
        petImageView.setImageResource(R.drawable.dogbathing)
        // The values will change based on the commands initialised
        health += 20
        if (health > 100) health = 100
        cleanliness += 20
        if (cleanliness > 100) cleanliness = 100
        updateStatus()
        Toast.makeText(this, "Cleaning the pet!", Toast.LENGTH_SHORT).show()
    }

    fun onPlayClicked(view: android.view.View) {
        petImageView.setImageResource(R.drawable.dogplaying)
        // The values will change based on the commands initialised
        hunger += 20
        if (hunger > 100) hunger = 100
        cleanliness -= 20
        if (cleanliness < 0) cleanliness = 0
        updateStatus()
        Toast.makeText(this, "Playing with the pet!", Toast.LENGTH_SHORT).show()
    }

    private fun updateStatus() {
        healthTextView.text = "Health: $health%"
        hungerTextView.text = "Hunger: $hunger%"
        cleanlinessTextView.text = "Cleanliness: $cleanliness%"
    }
}


// Refrences:

//GeeksforGeeks .2019. A computer science portal for geeks. [online] GeeksforGeeks. Available at: https://www.geeksforgeeks.org/.[ Accessed 1 May 2024 ]
//Android Studio. 2013. Android Studio. Version 2023.2.1. [App]. Available at: https://developer.android.com/studio . [ Accessed on 1 May 2024.]
//GitHub .2008. GitHub. [online] GitHub. Available at: https://github.com/. [ Accessed 1 May 2024]
//www.youtube.com. .2005. Android Studio : How to Add a Background Image to Activity. [online] Available at: https://www.youtube.com/watch?v=7OvsWwbvYsM.[ Accessed 1 May 2024]
//ColorHunt .2019. Color Palettes for Designers and Artists. [online]. Available at: https://colorhunt.co/.[ Accessed 1 May 2024]
//Canva .2013. Text To Image. [online] Canva. Available at: https://www.canva.com/ai-image-generator/.[ Accessed 1 May 2024]
//Sololearn .2008.Learn to code. [online] Sololearn. Available at: https://www.sololearn.com/en/.[ Accessed 1 May 2024]