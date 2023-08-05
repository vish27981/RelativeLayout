package com.vishcustom.relativelayout

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ToastActivity : AppCompatActivity() {
  private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        button=findViewById<Button>(R.id.showToast)

        //button.setOnClickListener {
          //  var obj = c1()
          //  obj.fi(this@ToastActivity)
        }
    }




