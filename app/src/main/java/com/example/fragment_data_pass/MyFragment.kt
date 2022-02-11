package com.example.fragment_data_pass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MyFragment : Fragment() {

    private lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_my, container, false)
        textView = view.findViewById<View>(R.id.textView) as TextView
        val bundle = arguments
        val message = bundle!!.getString("message")
        textView.text = message
        return view

    }
}