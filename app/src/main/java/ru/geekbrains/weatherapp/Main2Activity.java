package ru.geekbrains.weatherapp;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        try {
            String text = getIntent().getExtras().getString("city");
            TextView textView = (TextView) findViewById(R.id.city);
            textView.setText(text);

            Intent intent = getIntent();

            setValue(R.id.temp_air, intent, "air", "+24C");
            setValue(R.id.temp_water, intent, "water", "+10C");
            setValue(R.id.press_value, intent, "pressure", "763мм рт.ст.");
            setValue(R.id.speed_of_wind, intent, "wind", "3 м/с, СЗ");
            setValue(R.id.value_wet, intent, "wet", "48%");

        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Что-то пошло не так!", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }

    }

    private void setValue(@IdRes int id, Intent intent, String key, String value) {
        boolean hasValue = intent.getExtras().getBoolean(key);
        TextView view = (TextView) findViewById(id);
        if (hasValue) {
            view.setText(value);
        }
    }

}
