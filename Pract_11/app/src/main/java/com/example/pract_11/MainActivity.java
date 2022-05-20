package com.example.pract_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox e, f, ve;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e = findViewById(R.id.eggs);
        f = findViewById(R.id.fruits);
        ve = findViewById(R.id.veges);
        b = findViewById(R.id.btn);

        b.setOnClickListener(new View.OnClickListener() {

            String s = "Things taken: \n";

            @Override
            public void onClick(View v) {
                if (e.isChecked()) {
                    s += "Eggs taken \n";
                }
                if (f.isChecked()) {
                    s += "Fruits taken \n";
                }
                if (ve.isChecked()) {
                    s += "Vegetables taken \n";
                }

                Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
                s = "Things taken: \n";
            }
        });
    }
}