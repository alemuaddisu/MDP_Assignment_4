package com.miu.aalemu.walmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shopping_category.*

class ShoppingCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_category)

        val intent = getIntent()
        textViewUserName.text = "Welcome " + intent.getStringExtra("userName")
    }

    fun imageClick(view: View){
        startActivity(Intent(this, ElectronicsCategory::class.java))
//        Toast.makeText(this, "You have chosen the ${view.contentDescription.toString()} category of shopping", Toast.LENGTH_LONG).show()
    }
}