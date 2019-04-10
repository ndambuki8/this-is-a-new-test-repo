package com.example.ch10hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textHello.text = "1"

        button.setOnLongClickListener {

            Snackbar.make(root_layout, "Click me am a snack", Snackbar.LENGTH_LONG).show()
            true
        }

    }
    fun addNumber(v: View) {
        val currVal = textHello.text.toString().toInt()
        val nextVal = currVal + 1
        textHello.text = nextVal.toString()
    }

}
