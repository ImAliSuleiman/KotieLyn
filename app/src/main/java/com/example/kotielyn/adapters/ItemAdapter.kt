package com.example.kotielyn.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotielyn.R
import kotlinx.android.synthetic.main.item_list_home.view.*

class ItemAdapter(private val items: ArrayList<String>, private val context: Context) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    var onItemClick: ((String) -> Unit)? = null

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textName: TextView = itemView.textName

        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(items[adapterPosition]);
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView: View =
            LayoutInflater.from(context).inflate(R.layout.item_list_home, parent, false)

        return ViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position];
        // holder?.textName?.setText(item)
        holder.textName.text = item
    }


    override fun getItemCount(): Int {
        return items.size
    }

//    class ItemLister(val clickListener: (itemId: Long) -> Unit) {
//        fun onClick(item: String, id: Long) = clickListener(id)
//    }
}