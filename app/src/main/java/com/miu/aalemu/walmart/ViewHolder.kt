package com.miu.aalemu.walmart

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
    var currentPosition = 0
    open fun onBind(position: Int) {
        currentPosition = position
    }
}