package ru.freedomlogic.kapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.MyKotlinAnnotation

@MyKotlinAnnotation
class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
    }
}
