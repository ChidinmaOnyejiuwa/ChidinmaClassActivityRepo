package com.example.chidinma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        var button: Button = this.findViewById(R.id.AlreadyHAaccount)

        button.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)

            this.startActivity(intent)
        }
    }
}