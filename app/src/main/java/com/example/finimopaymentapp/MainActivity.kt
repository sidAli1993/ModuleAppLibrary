 package com.example.finimopaymentapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finimopaymentlib.models.builderobjects.initiliazesessions.AuthRequest
import com.example.intentboxlib.IntentMain
import com.google.gson.Gson

 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val authRequest= AuthRequest.Builder("myoriginization","123","1212121212","abcmodel").build()
//        val bundle=Bundle().apply {
//           putString("val",Gson().toJson(authRequest))
//        }
        IntentMain(this,authRequest)


    }

}