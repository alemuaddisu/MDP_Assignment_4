package com.miu.aalemu.walmart

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent = getIntent()
        if(intent.hasExtra("product")){
            var product = intent.getSerializableExtra("product") as Product
            titleView.text = product.title
            colorView.text = "color : " + product.color
            walmartNumberView.text = "Walmart # : " + product.itemId.toString()
            descriptionView.text = product.desc
            imageView.setBackgroundResource(product.image)

        }
}
}