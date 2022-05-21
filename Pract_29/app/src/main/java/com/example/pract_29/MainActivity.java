package com.example.pract_29;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ph, msg;
    Button b, ib;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ph = findViewById(R.id.phoneno);
        msg = findViewById(R.id.message);
        b = findViewById(R.id.send);
        ib = findViewById(R.id.isend);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ph.getText().toString().length() < 1 || msg.getText().toString().length() < 1) {
                    Toast.makeText(MainActivity.this, "Please Enter Phone no and message", Toast.LENGTH_SHORT).show();
                } else {
                    //Send message as message manager
                    SmsManager smgr = SmsManager.getDefault();
                    smgr.sendTextMessage(ph.getText().toString(), null, msg.getText().toString(), null, null);
                    Toast.makeText(MainActivity.this, "Message Sent", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ph.getText().toString().length() < 1 || msg.getText().toString().length() < 1) {
                    Toast.makeText(MainActivity.this, "Please Enter Phone no and message", Toast.LENGTH_SHORT).show();
                } else {
                    //Send message as intent
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.putExtra("phone_no", ph.getText().toString());
                    intent.putExtra("message", msg.getText().toString());
                    intent.setType("vnd.android-dir/sms");
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Message Sent", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}