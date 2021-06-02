package com.example.uiapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.uiapp.databinding.ItemLayoutBinding

class MyAdapter(private val dataList: List<Data> ): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       return MyViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_layout, parent, false))

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemLayoutBinding.product = dataList[position]


    }

    override fun getItemCount(): Int {
        return dataList.size
    }


    class MyViewHolder(val itemLayoutBinding: ItemLayoutBinding): RecyclerView.ViewHolder(itemLayoutBinding.root)

    }


