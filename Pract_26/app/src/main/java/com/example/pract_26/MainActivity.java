package com.example.pract_26;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nm, msg;
    Button button;
    //This is related to db and async
    DatabaseHandler dbh;
    Async asy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nm = findViewById(R.id.name);
        msg = findViewById(R.id.msg);
        button = findViewById(R.id.btn);

        //Related to DB and async
        dbh = new DatabaseHandler(this);
        asy = new Async(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
    }

    public void saveData() {

        //Invoking function in Async.java
        asy.execute(nm.getText().toString(), msg.getText().toString());
        finish();
    }
}