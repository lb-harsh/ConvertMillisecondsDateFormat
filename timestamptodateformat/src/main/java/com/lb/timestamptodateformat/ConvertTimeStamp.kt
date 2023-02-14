package com.lb.timestamptodateformat

import java.util.*

object ConvertTimeStamp {
    fun Long.timestampToDateFormat(/*timestampInLong: Long, */toDateFormat: String): String{
        if(this == null) return ""
        //Get instance of calendar
        val calendar = Calendar.getInstance(Locale.getDefault())
        //get current date from ts
        calendar.timeInMillis = this
        //return formatted date
        return android.text.format.DateFormat.format(toDateFormat, calendar).toString()
    }
}