package com.example.chidinma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        var accountButton: Button = this.findViewById(R.id.AlreadyHAaccount)

        accountButton.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)

            this.startActivity(intent)
        }
    }
}