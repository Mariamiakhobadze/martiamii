package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationMenuView

class MainActivity : AppCompatActivity() {
    private lateinit var bottom_nav_menu : BottomNavigationMenuView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_nav_menu = findViewById(R.id.buttom_nav_menu)

        val controller = findNavController()

    }

    private fun findNavController(): Any {
        TODO("Not yet implemented")
    }
}