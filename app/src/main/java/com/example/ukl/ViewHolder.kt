package com.example.ukl

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.template1, parent, false)){

    private var imgView: ImageView? = null
    private var txtView1: TextView? = null
    private var txtView2: TextView? = null
    private var txtView3: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.product_image)
        txtView1 = itemView.findViewById(R.id.txt_nama)
        txtView2 = itemView.findViewById(R.id.txt_harga)
        txtView3 = itemView.findViewById(R.id.txt_game)
    }

    fun bind(data: Item){
        imgView?.setImageResource(data.photo)
        txtView1?.text = data.name
        txtView2?.text = data.harga
        txtView3?.text = data.game
    }
}