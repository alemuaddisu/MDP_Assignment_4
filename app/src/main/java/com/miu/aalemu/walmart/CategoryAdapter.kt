package com.miu.aalemu.walmart

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_item.view.*

class CategoryAdapter(val context: Context, val products: ArrayList<Product>) : RecyclerView.Adapter<BaseViewHolder?>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): BaseViewHolder {
        val itemEvents: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.layout_item, viewGroup, false)
        return MyViewHolder(itemEvents)
    }

    override fun onBindViewHolder(baseViewHolder: BaseViewHolder, i: Int) {
        baseViewHolder.onBind(i)
        val product = products[i]
        baseViewHolder.itemView.rootLayout.apply{
            rv_title.text = product.title
            rv_image.setBackgroundResource(product.image)
            secondLayout.apply {
                colorLayout.colorview.text = product.color
                priceLayout.price.text = product.color
            }
        }
        baseViewHolder.itemView.rootLayout.setOnClickListener{
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("product", product)
            context.startActivity(intent)
        }
    }
    


    override fun getItemCount(): Int = products.size



    inner class MyViewHolder(view: View?) : BaseViewHolder(view) {

        @SuppressLint("NotifyDataSetChanged")
        override fun onBind(position: Int) {

        }
    }
}