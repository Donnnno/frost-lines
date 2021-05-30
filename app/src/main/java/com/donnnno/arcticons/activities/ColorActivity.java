package com.donnnno.arcticons.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import android.widget.RadioButton;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.donnnno.arcticons.R;

public class ColorActivity extends BaseActivity
{
    RadioButton DayMode, NightMode, FollowSystem;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_modes);
        DayMode = findViewById(R.id.dayMode);
        NightMode = findViewById(R.id.nightMode);
        FollowSystem = findViewById(R.id.followSystem);
    }

    public void onRadioButtonClicked(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        String msg = "";

        switch (view.getId())
        {
            case R.id.dayMode:
                if (checked)
                    msg = "Day mode activated";
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                break;
            case R.id.nightMode:
                if (checked)
                    msg = "Night mode activated";
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                break;
            case R.id.followSystem:
                if (checked)
                    msg = "System mode activated";
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
                break;
        }
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}