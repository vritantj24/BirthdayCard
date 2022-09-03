package com.example.birthdaycard

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view : View) {

        val name=name_input.editableText.toString().trim()
        val intent= Intent(this,GreetingActivity::class.java)
        intent.putExtra(GreetingActivity.NAME_EXTRA,name)
        startActivity(intent)
    }

}