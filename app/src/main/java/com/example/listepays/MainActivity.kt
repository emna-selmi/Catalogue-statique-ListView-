package com.example.listepays

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listViewProduits)

        val produits = listOf(
            Produit("Téléphone", R.drawable.telephone),
            Produit("Casque Bluetooth", R.drawable.casque),
            Produit("Montre", R.drawable.montre),
            Produit("Chargeur USB", R.drawable.cable)
        )

        listView.adapter = ProduitAdapter(this, produits)

        listView.setOnItemClickListener { _, _, position, _ ->
            val item = produits[position].nom

            if (item == "Téléphone") {
                startActivity(Intent(this, TelephonesActivity::class.java))
            } else {
                Toast.makeText(this, "Produit sélectionné : $item", Toast.LENGTH_SHORT).show()
            }
        }
        }
    }
