package com.example.timedialogpickerbyfragmentexample

import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.text.format.DateFormat
import androidx.fragment.app.DialogFragment import java.util.*

//그래서 DialogFragment를 사용하는구나..
class TimePickerFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c : Calendar = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)
        return TimePickerDialog(activity, activity as TimePickerDialog.OnTimeSetListener, hour, minute, DateFormat.is24HourFormat(activity))
    }
}