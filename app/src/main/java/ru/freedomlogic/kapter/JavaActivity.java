package ru.freedomlogic.kapter;

import com.example.MyKotlinAnnotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

@MyKotlinAnnotation
public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
