package com.example.pract_14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView l;
    String arr[] = {"Android", "PHP", "Python", "Management", "Capstone Project", "Emerging Trends"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l = findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, arr);
        l.setAdapter(adapter);
    }
}