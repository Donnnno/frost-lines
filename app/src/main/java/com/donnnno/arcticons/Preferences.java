package com.donnnno.arcticons;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.preference.PreferenceManager;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Preferences
{
    private SharedPreferences _prefs;

    public Theme getCurrentTheme() {
        return Theme.fromInteger(_prefs.getInt("pref_current_theme", Theme.SYSTEM.ordinal()));
    }

    public void setCurrentTheme(Theme theme) {
        _prefs.edit().putInt("pref_current_theme", theme.ordinal()).apply();
    }
}
