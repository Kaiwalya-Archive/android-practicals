package com.example.pract_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button i, e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = findViewById(R.id.imp);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Main Implicit intent code
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kaiwalyakoparkar.github.io/"));
//                intent.setData(Uri.parse("https://kaiwalyakoparkar.github.io/"));
                startActivity(intent);
            }
        });

        e = findViewById(R.id.exp);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Main Explicit intent code
                //Don't forget to add Activity 2 in AndroidManifest.xml
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });
    }
}