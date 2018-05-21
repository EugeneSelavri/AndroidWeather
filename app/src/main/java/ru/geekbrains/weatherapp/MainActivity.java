package ru.geekbrains.weatherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txt = (EditText) findViewById(R.id.enter_city);
                CheckBox air = (CheckBox) findViewById(R.id.air_t);
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                if (air.isChecked()) {
                    intent.putExtra("air", true);
                }
                intent.putExtra("city", txt.getText().toString());
                startActivity(intent);
            }
        });

    }
}
