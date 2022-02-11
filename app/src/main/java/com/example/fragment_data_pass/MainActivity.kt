package com.example.fragment_data_pass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.resources.TextAppearanceFontCallback

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fM: FragmentManager = supportFragmentManager
        val ft: FragmentTransaction = fM.beginTransaction()
        val myFragment = MyFragment()

        button = findViewById(R.id.btnSendData)
        editText = findViewById(R.id.editText)

       button.setOnClickListener {

           val bundle = Bundle()
           bundle.putString("message", editText.text.toString())
           myFragment.arguments = bundle
           ft.add(R.id.frameLayout, myFragment).commit()

       }

    }
}