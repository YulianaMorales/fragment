package com.example.fragment

import OnFragmentActionsListener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), OnFragmentActionsListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClickFragmentButton() {
        TODO("Not yet implemented")
    }
}