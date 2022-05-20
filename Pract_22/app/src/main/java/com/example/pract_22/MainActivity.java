package com.example.pract_22;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView t;
    SensorManager sMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = findViewById(R.id.list);
        String s = "";

        //Main Sensor Code
        sMgr = (SensorManager) this.getSystemService(SENSOR_SERVICE);
        List<Sensor> li = sMgr.getSensorList(Sensor.TYPE_ALL);
        for(Sensor sen : li) {
            //Takes the array format of sensor infor and adds the name to the string
            s+= sen.getName();
            s+="\n";
        }

        t.setText(s);
    }
}