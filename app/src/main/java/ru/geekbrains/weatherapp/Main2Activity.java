package ru.geekbrains.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String text = getIntent().getExtras().getString("city");
        TextView textView = (TextView) findViewById(R.id.city);
        textView.setText(text);
        boolean checkAir = getIntent().getExtras().getBoolean("air");
        TextView airTemp = (TextView) findViewById(R.id.temp_air);
        String testTemp = "+24C";
        if (checkAir) {
            airTemp.setText(testTemp);
        }
    }
}
