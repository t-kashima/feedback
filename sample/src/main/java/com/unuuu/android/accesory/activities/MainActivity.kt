package com.unuuu.android.accesory.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.unuuu.andorid.accesory.R
import com.unuuu.android.accessory.Accesory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView : TextView = findViewById(R.id.activity_main_text) as TextView
        textView.setOnClickListener({ startActivity(Intent(this, SecondActivity::class.java)) })

        Accesory.setOnClickListener { startActivity(Intent(this, SecondActivity::class.java)) }
    }

    override fun onResume() {
        super.onResume()
        Accesory.show()
    }
}
