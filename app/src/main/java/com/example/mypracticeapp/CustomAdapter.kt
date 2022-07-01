package com.example.mypracticeapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val mList : ArrayList<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    inner class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        val imageView: ImageView = ItemView.findViewById(R.id.imageview);
        val textView : TextView = ItemView.findViewById(R.id.textView);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent, false);
        return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        val item = mList[position];

        holder.imageView.setImageResource(item.image);
        holder.textView.text =  item.text
    }

    override fun getItemCount(): Int {
        return mList.size;
    }
}