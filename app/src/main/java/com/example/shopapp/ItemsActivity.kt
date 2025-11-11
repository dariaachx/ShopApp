package com.example.shopapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1, "Tulips", "Tulips", "25 flowers", "-----", 1500))
        items.add(Item(2, "Lilies", "Lilies", "25 flowers", "------", 2000))
        items.add(Item(3, "Roses", "Roses", "25 flowers", "-----", 2500))
        }
    }
