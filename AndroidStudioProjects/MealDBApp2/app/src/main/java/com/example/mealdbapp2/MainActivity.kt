package com.example.mealdbapp2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = android.widget.ListView(this)
        val values = arrayOf("a", "b", "c", "d", "e", "f")

        val adapter = ArrayAdapter<String>(this, android.R.layout.activity_ListView, values)

       listView.adapter = adapter
    }

}

