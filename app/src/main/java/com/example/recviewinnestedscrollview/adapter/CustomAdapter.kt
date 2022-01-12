package com.example.recviewinnestedscrollview.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recviewinnestedscrollview.R
import com.example.recviewinnestedscrollview.modul.Member
import java.util.zip.Inflater

class CustomAdapter(val member: List<Member>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_item_layout,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val memeber = member[position]

          if (holder is CustomViewHolder)
           holder.itop.text = memeber.name
    }

    override fun getItemCount(): Int {
       return member.size
    }
    class CustomViewHolder(view: View):RecyclerView.ViewHolder(view){
    val itop = view.findViewById<TextView>(R.id.itop)
   }
}