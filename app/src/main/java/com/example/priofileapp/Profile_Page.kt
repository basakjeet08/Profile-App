package com.example.priofileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.priofileapp.R

class Profile_Page : AppCompatActivity() {

    private lateinit var textUserName : TextView
    private lateinit var textName : TextView
    private lateinit var textDOB : TextView
    private lateinit var textAge : TextView
    private lateinit var textGender : TextView
    private lateinit var textPhno : TextView
    private lateinit var textemail : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        textUserName = findViewById(R.id.tv_username)
        textName = findViewById(R.id.tv_name)
        textDOB = findViewById(R.id.tv_DOB)
        textAge = findViewById(R.id.tv_Age)
        textGender = findViewById(R.id.tv_Gender)
        textPhno = findViewById(R.id.tv_Phno)
        textemail = findViewById(R.id.tv_email)

        val username = intent.getStringExtra("username")
        val name = intent.getStringExtra("Name")
        val dob = intent.getStringExtra("DOB")
        val age = intent.getStringExtra("Age")
        val gender = intent.getStringExtra("Gender")
        val phno = intent.getStringExtra("Phno")
        val email = intent.getStringExtra("email")

        textUserName.text = username
        textName.text = "Name : "+name
        textDOB.text = "DOB : "+dob
        textAge.text = "Age : "+age
        textGender.text = "Gender : "+gender
        textPhno.text = "Phno : "+phno
        textemail.text = "email : "+email

    }
}