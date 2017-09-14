package me.rohanjahagirdar.loginpreferences;

import android.app.Application;
import android.content.SharedPreferences;

/**
 * Created by Rohan on 9/13/2017.
 */

public class LoginPreferences {

    private SharedPreferences prefs;
    String PREFS_NAME = "";

    public LoginPreferences (Application app, String prefs_name) {
        PREFS_NAME = prefs_name;
        prefs = app.getSharedPreferences(PREFS_NAME, 0);
    }

    public void encryptPassword() {

    }
}
