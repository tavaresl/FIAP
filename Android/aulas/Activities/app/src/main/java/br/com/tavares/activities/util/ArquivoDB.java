package br.com.tavares.activities.util;

import android.content.Context;
import android.content.SharedPreferences;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lucasrocha on 08/03/17.
 */

public class ArquivoDB {

    private SharedPreferences preferences;

    public void gravarChaves(Context context, String prefName, HashMap<String, String> map) {
        preferences = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        SharedPreferences.Editor e = preferences.edit();

        for (Map.Entry<String, String> key : map.entrySet()) {
            e.putString(key.getKey(), key.getValue());
        }

        e.commit();
    }

    public String retornarValor(Context context, String prefName, String key) {
        preferences = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        String valor = preferences.getString(key, "");

        return valor;
    }
}
