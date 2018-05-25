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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("air", hasAir());
                bundle.putBoolean("water", hasWater());
                bundle.putBoolean("pressure", hasPressure());
                bundle.putBoolean("wind", hasSpeedOfWind());
                bundle.putBoolean("wet", hasWet());
                bundle.putString("city", whatCity().getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

    private boolean hasAir() {
        CheckBox air = (CheckBox) findViewById(R.id.air_t);
        return air.isChecked();
    }

    private boolean hasWater() {
        CheckBox water = (CheckBox) findViewById(R.id.water_t);
        return water.isChecked();
    }

    private boolean hasPressure() {
        CheckBox pressure = (CheckBox) findViewById(R.id.pressure);
        return pressure.isChecked();
    }

    private boolean hasSpeedOfWind() {
        CheckBox wind = (CheckBox) findViewById(R.id.wind);
        return wind.isChecked();
    }

    private boolean hasWet() {
        CheckBox wet = (CheckBox) findViewById(R.id.wet);
        return wet.isChecked();
    }

    private EditText whatCity() {
        EditText txt = (EditText) findViewById(R.id.enter_city);
        return txt;
    }
}
