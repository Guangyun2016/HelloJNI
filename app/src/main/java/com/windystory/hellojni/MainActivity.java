package com.windystory.hellojni;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
    static {
        System.loadLibrary("hello-jni");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JNI jni = new JNI();
        Toast.makeText(MainActivity.this, jni.Hello(), Toast.LENGTH_SHORT).show();
    }

}
