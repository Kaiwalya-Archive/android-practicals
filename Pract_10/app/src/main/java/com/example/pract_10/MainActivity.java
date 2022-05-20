package com.example.pract_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.pass);
        login = findViewById(R.id.btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().length() < 1) {
                    Toast.makeText(MainActivity.this, "Please enter email before login", Toast.LENGTH_SHORT).show();
                } else if(password.getText().length() < 1) {
                    Toast.makeText(MainActivity.this, "Please enter password before login", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login successful for "+email.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}