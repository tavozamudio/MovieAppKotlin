package com.example.movie_app.core

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseConcatHolder<T>(itemView: View): RecyclerView.ViewHolder(itemView) {
    abstract  fun bind(adapter: T)
}