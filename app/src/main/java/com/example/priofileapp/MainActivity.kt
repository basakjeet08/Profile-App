package com.example.priofileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var editUserName : EditText
    private lateinit var editName : EditText
    private lateinit var editDOB : EditText
    private lateinit var editAge : EditText
    private lateinit var editGender : EditText
    private lateinit var editPhNo : EditText
    private lateinit var editmail : EditText
    private lateinit var editRegion : EditText
    private lateinit var btnSubmit : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editUserName = findViewById(R.id.edt_usrname)
        editName = findViewById(R.id.edt_name)
        editDOB = findViewById(R.id.edt_DOB)
        editAge = findViewById(R.id.edt_Age)
        editGender = findViewById(R.id.edt_Gender)
        editPhNo= findViewById(R.id.edt_phNo)
        editmail = findViewById(R.id.edt_mail)
        editRegion = findViewById(R.id.edt_Region)
        btnSubmit = findViewById(R.id.button)

        btnSubmit.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java)
                .putExtra("username",editUserName.text.toString())
                .putExtra("Name",editUserName.text.toString())
                .putExtra("DOB",editUserName.text.toString())
                .putExtra("Age",editUserName.text.toString())
                .putExtra("Gender",editUserName.text.toString())
                .putExtra("Phno",editUserName.text.toString())
                .putExtra("Email",editUserName.text.toString())
                .putExtra("Region",editUserName.text.toString()))


        }

    }
}