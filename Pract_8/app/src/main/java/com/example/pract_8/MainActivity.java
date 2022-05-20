package com.example.pract_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    //Declaring the variable
    AutoCompleteTextView autoCompleteTextView;

    //Creating the array to suggest words
    String[] arr = {"Apple", "Onion", "Gorilla", "Penguin", "Donkey"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating adapter class
        autoCompleteTextView = findViewById(R.id.autotv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, arr);

        //Setting adapter to autocomplete text view
        autoCompleteTextView.setThreshold(2);
        autoCompleteTextView.setAdapter(adapter);
    }
}