package com.mahfuznow.instagram.ui.main.adapter.story

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate
import com.mahfuznow.instagram.data.model.UsersData
import com.mahfuznow.instagram.databinding.ItemStoryUserBinding
import com.mahfuznow.instagram.ui.main.view.HomeFragmentDirections

class StoryUserDelegate constructor(
    private val users: ArrayList<UsersData.Data>
) : AdapterDelegate<ArrayList<Any>>() {
    override fun isForViewType(items: ArrayList<Any>, position: Int): Boolean = items[position] is UsersData.Data

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        StoryUserViewHolder(
            ItemStoryUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(items: ArrayList<Any>, position: Int, holder: RecyclerView.ViewHolder, payloads: MutableList<Any>) {
        val item = items[position]
        item as UsersData.Data
        holder as StoryUserViewHolder

        holder.binding.user = item

        holder.binding.root.setOnClickListener {
            it.findNavController().navigate(HomeFragmentDirections.actionHomeToViewStoryFragment(users.toTypedArray(),position))
        }
    }

    class StoryUserViewHolder(val binding: ItemStoryUserBinding) : RecyclerView.ViewHolder(binding.root)
}