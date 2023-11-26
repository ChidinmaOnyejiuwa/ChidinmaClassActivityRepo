package com.example.chidinma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var buttonC: Button = this.findViewById(R.id.CreateAccount)

        buttonC.setOnClickListener{
            val intent = Intent(this, CreateNewAccountActivity::class.java)

            this.startActivity(intent)

 }

        var forgotbutton: Button = this.findViewById(R.id.forgotten)

        forgotbutton.setOnClickListener{
            val intent = Intent(this, ForgotPasswordActivity::class.java)

            this.startActivity(intent)
        }
        val loginbt: Button = this.findViewById(R.id.joinButton)

        loginbt.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)

            this.startActivity(intent)
    }
        var Login : Button = findViewById(R.id.joinButton)
        val userEdit : EditText = findViewById(R.id.Username)
        var passwordEdit : EditText = findViewById(R.id.Password)

        Login.setOnClickListener{
            val nmausername : String = userEdit.text.toString()
            val nmapassword : String = passwordEdit.text.toString()

            var messagetoShow = " ";

            if(nmausername.isEmpty() and nmapassword.isEmpty()){
             messagetoShow = "You need to put your username"
                 }else if (nmausername.isEmpty()){
            messagetoShow = "please input  your username"
            }else if (nmapassword.isEmpty()){
                messagetoShow = "please input your password"
            //dont forget to declare and run it again before the 11:59 mark
            }else{
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)

                Snackbar.make(findViewById
                    (R.id.identity), " An Email Has Been Sent to",
                    Snackbar.LENGTH_LONG).show()
                  }
                // think i am missing something but don't know yet
                //Sir anthony incase you see this please my messsages are not showing
                //i got the ept but i dont know why the messages are not showing on thw screen
                    }

   }
         }