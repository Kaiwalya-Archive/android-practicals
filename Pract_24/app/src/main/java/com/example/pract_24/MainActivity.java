package com.example.pract_24;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    Button on, off;
    ListView t;
    BluetoothAdapter BA;
    Set<BluetoothDevice> pairedDevices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Important Line
        BA = BluetoothAdapter.getDefaultAdapter();

        on = findViewById(R.id.on);
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(BA == null) {
                    Toast.makeText(MainActivity.this, "This device doesn't support bluetooth", Toast.LENGTH_SHORT).show();
                } else {
                    Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    startActivityForResult(turnOn, 0);
                    Toast.makeText(MainActivity.this, "Bluetooth Enabled", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Main code for turning off bluetooth
        off = findViewById(R.id.off);
        off.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                BA.disable();
            }
        });

        //Main code for showing the paired devices (Optional)
        t = findViewById(R.id.list);
        pairedDevices = BA.getBondedDevices();
        ArrayList arrayList = new ArrayList();
        for(BluetoothDevice bt: pairedDevices) {
            arrayList.add(bt.getName());
        }
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        t.setAdapter(adapter);
    }
}