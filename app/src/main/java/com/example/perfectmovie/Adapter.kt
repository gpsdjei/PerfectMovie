package com.example.perfectmovie

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.perfectmovie.interfaces.Api
import com.example.perfectmovie.models.Model
import com.squareup.picasso.Picasso

class Adapter(
        private val context: Context?,
        private val images: ArrayList<Model>
) : RecyclerView.Adapter<Adapter.ImageViewHolder>() {
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title = view.findViewById<TextView>(R.id._title)
        val imageView = view.findViewById<ImageView>(R.id._image)
        fun bindView(data: Model) {
            title.text = data.title.toString()
            Picasso.get().load("${Api.imageUrl}" + data.title?.get(0)?.urlToImage).into(imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(
                LayoutInflater.from(context).inflate(R.layout.items, parent, false)
        )


    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position])
    }
}