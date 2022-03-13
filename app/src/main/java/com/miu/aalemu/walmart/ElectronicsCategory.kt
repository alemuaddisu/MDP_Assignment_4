package com.miu.aalemu.walmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_category.*
import java.util.*
import kotlin.collections.ArrayList

class ElectronicsCategory : AppCompatActivity(){//}, CategoryAdapter.Callback {

    var products:ArrayList<Product> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        createInitialProducts()

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = CategoryAdapter(this,products)
        recyclerView.adapter = adapter

    }

    private  fun createInitialProducts(){
        products.add(Product("RGA Voyager 7\" 16GB Android Tablet","35.00","Black",R.drawable.e1,555948101L,getString(R.string.description1)))
        products.add(Product("HP Flyer Red 15.6\" Laptop","299","Black & Red",R.drawable.e2,2L,getString(R.string.description2)))
        products.add(Product("VIZIO 70\" Class 4K","1298.00","Black",R.drawable.e3,3L,getString(R.string.description3)))
        products.add(Product("Epson WorkForce WF-2750","69.00","Black",R.drawable.e4,4L,getString(R.string.description4)))
    }
//
//    override fun onItemClicked(product: Product?) {
//        val intent = Intent(this, DetailActivity::class.java)
//        intent.putExtra("product", product)
//        startActivity(intent)
//    }

}