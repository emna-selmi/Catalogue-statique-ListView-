package com.example.listepays

import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TelephonesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telephones)

        val listView = findViewById<ListView>(R.id.listViewTelephones)
        val btnRetour = findViewById<Button>(R.id.btnRetour)

        val telephones = listOf(
            Produit("iPhone 15", R.drawable.iphone15),
            Produit("Samsung Galaxy S24", R.drawable.samsung_s24),
            Produit("Xiaomi Redmi Note 13", R.drawable.xiaomi_redmi),
            Produit("Google Pixel 8", R.drawable.pixel8)
        )

        listView.adapter = ProduitAdapter(this, telephones)

        listView.setOnItemClickListener { _, _, position, _ ->
            val item = telephones[position].nom
            Toast.makeText(this, "Téléphone sélectionné : $item", Toast.LENGTH_SHORT).show()
        }

        btnRetour.setOnClickListener {
            finish()
        }
    }
}