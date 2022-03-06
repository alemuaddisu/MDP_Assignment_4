package com.miu.aalemu.walmart

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.editTextTextEmailAddress
import kotlinx.android.synthetic.main.activity_register.editTextTextPassword

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        create_account.setOnClickListener{
            val firstName = editTextTextFirstName.text.toString().trim()
            val lastName = editTextLastName.text.toString().trim();
            val email = editTextTextEmailAddress.text.toString().trim();
            val password = editTextTextPassword.text.toString().trim();

            if(firstName == "" || lastName == "" || email == "" || password == "")
                alert("Please fill all the necessary fields !!");
            else{
                var user = User(firstName,lastName,email,password);
                var result_intent = Intent()
                //result_intent.data = Uri.parse(user.toString())
                result_intent.putExtra("user",user)
                setResult(Activity.RESULT_OK,result_intent)
                finish()
            }

        }
    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_CANCELED)
        finish()
    }


    private fun alert(message:String){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

}