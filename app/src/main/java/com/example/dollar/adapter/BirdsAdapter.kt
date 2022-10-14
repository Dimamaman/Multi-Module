package com.example.dollar.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dollar.R
import com.example.dollar.data.Birds
import com.example.dollar.databinding.BirdsItemBinding
import com.example.dollar.fragments.MainFragmentDirections

class BirdsAdapter: RecyclerView.Adapter<BirdsAdapter.VH>() {
    var model: List<Birds> = listOf()
    @SuppressLint("NotifyDataSetChanged")
    set(value) {
        field = value
        notifyDataSetChanged()
    }
    inner class VH(val binding: BirdsItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.birds_item,parent,false)
        val binding = BirdsItemBinding.bind(view)
        return VH(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: VH, position: Int) {
        val player = model[position]
        holder.binding.birdsName.text = player.name
        holder.binding.birdsOrder.text = "Number: ${player.number}"
        holder.binding.birdsFamily.text = "Team: ${player.team}"

        Glide.with(holder.itemView.context).load(player.image).into(holder.binding.birdsImage)

        holder.itemView.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToDetailFragment(player)
            holder.itemView.findNavController().navigate(action)
        }

    }

    override fun getItemCount(): Int = model.size
}