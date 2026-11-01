package com.example.listepays

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

data class Produit(val nom: String, val image: Int)

class ProduitAdapter(context: Context, private val items: List<Produit>) :
    ArrayAdapter<Produit>(context, 0, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView
            ?: LayoutInflater.from(context).inflate(R.layout.item_produit, parent, false)

        val item = items[position]
        view.findViewById<ImageView>(R.id.imgProduit).setImageResource(item.image)
        view.findViewById<TextView>(R.id.txtNom).text = item.nom
        return view
    }
}
