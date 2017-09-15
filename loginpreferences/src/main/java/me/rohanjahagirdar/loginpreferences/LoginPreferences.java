package me.rohanjahagirdar.loginpreferences;

import android.app.Application;
import android.content.SharedPreferences;

import javax.security.auth.login.LoginException;

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

    protected void saveLogin(String email, String password, boolean encrypt) {
        prefs.edit().putString("email", email).putString("password", password).
                putBoolean("encrypt", encrypt).apply();
    }

    protected void saveSession(String sessionId, boolean deleteLogin) {
        if(!deleteLogin)
            prefs.edit().putString("session", sessionId).apply();
        else
            prefs.edit().putString("session", sessionId).remove("email").remove("password").
                    remove("encrypt").apply();
    }

    protected String getEmail() {
        return prefs.getString("email", "");
    }

    protected String getPassword() {
        return prefs.getString("password", "");
    }


}