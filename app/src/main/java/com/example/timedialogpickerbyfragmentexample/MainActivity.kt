package com.example.timedialogpickerbyfragmentexample

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.TimePicker
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), TimePickerDialog.OnTimeSetListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button).also { it.setOnClickListener {
            val timePicker = TimePickerFragment().also { it.show(supportFragmentManager, "timePicker") }
        } }
    }

    override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {
        val textView = findViewById<TextView>(R.id.textView).also { it.setText("Hour: $p1 Minute: $p2") }
    }
}