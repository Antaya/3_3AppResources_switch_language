package com.example.a3_3appresources_switch_language;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private Spinner languagesSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        languagesSpinner = findViewById(R.id.language);
    }

    public void onClick(View v) {
        String selected = languagesSpinner.getSelectedItem().toString();

        if (selected.equals("Английский")) {
            Locale locale = new Locale("en");
            Configuration config = new Configuration();
            config.setLocale(locale);
            getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
            recreate();
        }

        if (selected.equals("Russian")) {
            Locale locale = new Locale("ru");

            Configuration config = new Configuration();
            config.setLocale(locale);
            getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
            recreate();
        }
    }
}
