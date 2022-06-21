package com.example.intentboxlib

import android.content.Context
import android.os.Bundle
import android.util.Log
import com.example.finimopaymentlib.models.builderobjects.initiliazesessions.AuthRequest
import com.google.gson.Gson

class IntentMain(context: Context,authRequest: AuthRequest) {

    init {
        Log.e("TAG", "${authRequest.organizationName} , ${authRequest.organizationID} ")

    }
}