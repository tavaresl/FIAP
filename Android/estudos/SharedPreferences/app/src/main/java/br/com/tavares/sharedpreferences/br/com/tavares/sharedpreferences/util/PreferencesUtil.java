package br.com.tavares.sharedpreferences.br.com.tavares.sharedpreferences.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Lucas on 11/04/2017.
 */

public class PreferencesUtil {

    private SharedPreferences sharedPreferences;

    public PreferencesUtil(Context context, String preferenceName) {
        sharedPreferences = context.getSharedPreferences(preferenceName, context.MODE_PRIVATE);
    }

    public String get(String key) {
        if (TextUtils.isEmpty(key)) {
            throw new IllegalArgumentException("Key must not me empty");
        }

        return sharedPreferences.getString(key, null);
    }

    public Map<String, String> get(List<String> keys) {
        Map<String, String> preferences = new HashMap<>();

        for (String key : keys) {
            preferences.put(key, sharedPreferences.getString(key, null));
        }

        return preferences;
    }

    public Map<String, String> get(String[] keys) {
        Map<String, String> preferences = new HashMap<>();

        for (String key : keys) {
            preferences.put(key, sharedPreferences.getString(key, null));
        }

        return preferences;
    }

    public Map<String, String> getAllEntries() {
        Map<String, ?> stored = sharedPreferences.getAll();
        Map<String, String> entries = new HashMap();

        for (Map.Entry<String, ?> entry : stored.entrySet()) {
            String key = entry.getKey();
            String val = (String) entry.getValue();

            entries.put(key, val);
        }

        return entries;
    }

    public boolean put(String key, String val) {
        if (TextUtils.isEmpty(key) || TextUtils.isEmpty(val)) {
            throw new IllegalArgumentException("Key and value must not be empty");
        }

        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(key, val);
        return editor.commit();
    }

    public boolean put(Map<String, String> preferences) {
        if (preferences.size() == 0) {
            return false;
        }

        SharedPreferences.Editor editor = sharedPreferences.edit();

        for (Map.Entry<String, String> entry : preferences.entrySet()) {
            if (TextUtils.isEmpty(entry.getKey()) || TextUtils.isEmpty(entry.getValue())) {
                throw new IllegalArgumentException("Preferences entry must not have an empty key " +
                        "neither an empty value");
            }

            editor.putString(entry.getKey(), entry.getValue());
        }

        return editor.commit();
    }


    public boolean hasKey(String key) {
        if (TextUtils.isEmpty(key)) {
            throw new IllegalArgumentException("Key must not be empty");
        }

        String val = sharedPreferences.getString(key, null);

        return val != null;
    }
}
