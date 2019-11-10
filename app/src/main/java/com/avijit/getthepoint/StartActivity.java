package com.avijit.getthepoint;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {
    public final int SPLASH_TIME=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        splash();

    }
    public void splash()
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(splashIntent);
                finish();
            }
        },SPLASH_TIME);
    }
}
