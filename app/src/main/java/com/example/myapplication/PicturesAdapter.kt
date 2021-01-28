package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PicturesAdapter(private val pictures: List<Pictures>) : RecyclerView.Adapter<PicturesAdapter.PictureViewHolder>() {

    class PictureViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)




    }

    override fun getItemCount(): Int = pictures.size



    override fun onBindViewHolder(holder: PictureViewHolder, position: Int) {

        val p = pictures[position]


        holder.textView.text = p.title

        Glide.with(holder.imageView.context)
            .load(p?.url)
            .placeholder(R.drawable.ic_launcher_foreground)
            .centerCrop()
            .into(holder.imageView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PictureViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.picture_item, parent, false)

        return PictureViewHolder(view)

    }

}