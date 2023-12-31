package com.example.chidinma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var joinNowButton: Button = this.findViewById(R.id.joinNowButton)

        joinNowButton.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)

            this.startActivity(intent)
        }
    }
}