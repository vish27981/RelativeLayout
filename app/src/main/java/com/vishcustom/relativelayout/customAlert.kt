package com.vishcustom.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import cn.pedant.SweetAlert.SweetAlertDialog

class customAlert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_alert)

        val btn1=findViewById<Button>(R.id.btn1)
        val btn2=findViewById<Button>(R.id.btn2)
        val btn3=findViewById<Button>(R.id.btn3)

        btn1.setOnClickListener{
            SweetAlertDialog(this,SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Success SweetAlert")
                .setContentText("You are a good Person")
                .show()
        }
        btn2.setOnClickListener{
            SweetAlertDialog(this,SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Error SweetAlert")
                .setContentText("You have some bad habits too")
                .show()

        }
        btn3.setOnClickListener{
            SweetAlertDialog(this,SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Warning  SweetAlert")
                .setContentText("You should think once while making friends")
                .show()
        }
    }
}




