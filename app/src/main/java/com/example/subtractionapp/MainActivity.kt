package com.example.subtractionapp

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

    fun subevent(view: View) {
        var getnum1=findViewById<EditText>(R.id.num1)
        var getnum2=findViewById<EditText>(R.id.num2)
        var res=getnum1.text.toString().toInt()-getnum2.text.toString().toInt()

        Toast.makeText(this,res.toString(),Toast.LENGTH_LONG).show()
    }
}