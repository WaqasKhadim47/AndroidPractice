package com.example.mypracticeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LoginScreen : AppCompatActivity(), View.OnClickListener {
    lateinit var login: Button
    lateinit var forGotBtn : TextView
    lateinit var signup: TextView
    lateinit var facebookBtn : Button
    lateinit var googleBtn : Button
    lateinit var appleBtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        login = findViewById(R.id.login)
        signup = findViewById(R.id.signup)
        forGotBtn = findViewById(R.id.forgotPassword)
        facebookBtn = findViewById(R.id.fbBtn)
        googleBtn = findViewById(R.id.googleBtn)
        appleBtn = findViewById(R.id.appleBtn)

        login.setOnClickListener(this);
        forGotBtn.setOnClickListener(this)
        signup.setOnClickListener(this)
        facebookBtn.setOnClickListener(this)
        googleBtn.setOnClickListener(this)
        appleBtn.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.login -> {
                println("Click =====> Login Button clicked")            }
            R.id.forgotPassword -> {
                println("Click =====> Forgot Password Button clicked") }
            R.id.signup -> {
                println("Click =====> Signup Button clicked") }
            R.id.googleBtn -> {
                println("Click =====> Google Button clicked") }
            R.id.fbBtn -> {
                println("Click =====> Facebook Button clicked") }

            R.id.appleBtn -> {
                println("Click =====> Apple Button clicked")
            }
            }


        }


}