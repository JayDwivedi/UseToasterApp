package com.mindorks.framework.usetoasterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mindorks.framework.toasterlibrary.ToasterMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToasterMessage.toastMessage(this,"Hi Jay")
    }
}