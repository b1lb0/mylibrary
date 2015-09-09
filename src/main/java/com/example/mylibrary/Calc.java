package com.example.mylibrary;

import android.util.Log;

/**
 * Created by tobia on 09/09/15.
 */
public class Calc {
    public Calc() {
        Log.d(getClass().getSimpleName(), "Init Calc lib ok");
    }

    public float Sum (Object a, Object b) {
        return (float)a + (float)b;
    }
}
