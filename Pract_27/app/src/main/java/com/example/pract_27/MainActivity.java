package com.example.pract_27;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    EditText un, pwd;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textview);
        un = findViewById(R.id.username);
        pwd = findViewById(R.id.password);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(un.getText().toString().equals("admin") && pwd.getText().toString().equals("admin")) {
                    txt.setText("Login Successful");
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed. Please check your credentials", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}