package com.example.birthday_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun ClickMe(vive:View){
        val name = findViewById<EditText>(R.id.nameInput).editableText.toString()
        Toast.makeText(this,"Name is $name ",Toast.LENGTH_LONG).show()

        val  intent= Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}