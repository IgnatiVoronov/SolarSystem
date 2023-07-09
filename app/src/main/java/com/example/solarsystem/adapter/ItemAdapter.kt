package com.example.solarsystem.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.solarsystem.databinding.ListItemBinding
import com.example.solarsystem.model.InformationModel

class ItemAdapter(
    private val context: Context,
    private val dataset: List<InformationModel>,
    val itemClickListener: (InformationModel) -> Unit
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        /*fun bindItem(item:InformationModel){
            with(binding) {
                itemTitle.text = item.title
                itemDescription.text = item.description
                itemImage.setImageResource(item.image)
            }
        }*/

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = dataset[position]
        holder.binding.itemTitle.text = context.resources.getString(currentItem.title)
        holder.binding.itemDescription.text = context.resources.getString(currentItem.description)
        holder.binding.itemImage.setImageResource(currentItem.image)

        /*holder.bindItem(currentItem)*/

        holder.binding.root.setOnClickListener {
            itemClickListener(currentItem)
        }
    }
}