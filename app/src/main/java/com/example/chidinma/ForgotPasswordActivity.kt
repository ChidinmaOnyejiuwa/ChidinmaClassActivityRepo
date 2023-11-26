package com.example.chidinma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        var reset : Button =findViewById(R.id.ResetPassword)
        val email: EditText = findViewById(R.id.Emailaddress)
        val nmaEmail : String = email.text.toString()
        reset.setOnClickListener{
            Snackbar.make(findViewById
                (R.id.identity), " An Email Has Been Sent to $nmaEmail",
                Snackbar.LENGTH_LONG).show()
        }
    }
}