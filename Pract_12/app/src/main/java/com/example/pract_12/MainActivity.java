package com.example.pract_12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton s;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.radioGroup);
        b = findViewById(R.id.submit);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getCheckedRadioButtonId gets you the id of the checked box in radio box
                s = findViewById(rg.getCheckedRadioButtonId());
                Toast.makeText(MainActivity.this, s.getText()+" selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}