package com.lb.convertmillisecondsdateformat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.lb.timestamptodateformat.ConvertTimeStamp
import com.lb.timestamptodateformat.ConvertTimeStamp.timestampToDateFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val convertedDate = ConvertTimeStamp().timestampToDateFormat(System.currentTimeMillis(), "dd/MM/yyyy")
        val convertedDate = System.currentTimeMillis().timestampToDateFormat(/*System.currentTimeMillis(), */"MMM dd,yyyy")
        Log.d("CheckConvertedDate", "$convertedDate")
    }
}