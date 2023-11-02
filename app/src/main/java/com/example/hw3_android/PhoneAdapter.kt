package com.example.hw3_android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PhoneAdapter(private val phoneList : ArrayList<Phone>):RecyclerView.Adapter<PhoneAdapter.FoodViewHolder>(){

    class FoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val phoneImage : ImageView = itemView.findViewById(R.id.im_phone)
        val phoneName : TextView = itemView.findViewById(R.id.tx_phone)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(R.layout.phone_item, parent, false)
        return FoodViewHolder(viewLayout)
    }

    override fun getItemCount() = phoneList.size

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val currentFood = phoneList[position]
        holder.phoneImage.setImageResource(currentFood.phoneImage)
        holder.phoneName.text = currentFood.phoneName
    }
}