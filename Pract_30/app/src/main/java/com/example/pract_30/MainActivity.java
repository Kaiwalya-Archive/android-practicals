package com.example.pract_30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText rec, sub, msg;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec = findViewById(R.id.remail);
        sub = findViewById(R.id.subject);
        msg = findViewById(R.id.message);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, rec.getText().toString());
                intent.putExtra(Intent.EXTRA_SUBJECT, sub.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, sub.getText().toString());
                startActivity(Intent.createChooser(intent, "Email Sent"));
                Toast.makeText(MainActivity.this, "Email sent", Toast.LENGTH_SHORT).show();
            }
        });
    }
}