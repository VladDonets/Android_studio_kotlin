package com.example.myapplication113

import Animal
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import layout.AnimalAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animalsList = listOf(
            Animal("Кіт", "Опис кота", getString(R.string.cat_full_description) ,  R.drawable.cat_image),
            Animal("Кіт", "Опис кота", getString(R.string.cat_full_description) ,  R.drawable.cat_image),
            Animal("Кіт", "Опис кота", getString(R.string.cat_full_description) ,  R.drawable.cat_image),
            Animal("Кіт", "Опис кота", getString(R.string.cat_full_description) ,  R.drawable.cat_image),

        )

        val recyclerView: RecyclerView = findViewById(R.id.rvAnimals)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AnimalAdapter(animalsList)
    }
}