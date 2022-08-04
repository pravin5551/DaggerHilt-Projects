package com.example.nobrokerdaggerhilt.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nobrokerdaggerhilt.R
import com.example.nobrokerdaggerhilt.interfaces.ClickListener
import com.example.nobrokerdaggerhilt.room.ListEntity
import com.example.nobrokerdaggerhilt.viewHolder.ListHolder


//adapter for recyclerview
class ListAdapter(
    private var responseList: List<ListEntity>,
    private var clickListner: ClickListener
):RecyclerView.Adapter<ListHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ListHolder(view,clickListner)
    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        val dataModel = responseList[position]
        holder.setData(dataModel)
    }

    override fun getItemCount(): Int {
        return responseList.size
    }

    fun updateList(itemList:List<ListEntity>){
        responseList = itemList
        notifyDataSetChanged()
    }


}