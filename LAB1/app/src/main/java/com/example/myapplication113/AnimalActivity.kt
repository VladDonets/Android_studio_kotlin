package com.example.myapplication113

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
class AnimalActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animal_details)

        val name = intent.getStringExtra("name")
        val fullDescription = intent.getStringExtra("fullDescription")
        val image = intent.getIntExtra("image", -1)

        val tvAnimalName : TextView = findViewById(R.id.animalName)
        val tvAnimalDescription : TextView = findViewById(R.id.animalDescription)
        val ivAnimalImage : ImageView = findViewById(R.id.animalImage)

        if (name != null && fullDescription != null && image != -1) {
            tvAnimalName.text = name
            tvAnimalDescription.text = fullDescription
            ivAnimalImage.setImageResource(image)
        }
    }
}