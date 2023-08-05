package com.vishcustom.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {

    val custommenu=com.vishcustom.relativelayout.custommenu()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val showPopUp=findViewById<Button>(R.id.button7)

        showPopUp.setOnClickListener{
            custommenu.customMenu(this,it)
        }
    }
}