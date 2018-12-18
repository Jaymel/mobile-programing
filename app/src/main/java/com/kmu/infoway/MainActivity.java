package com.kmu.infoway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void routeClick(View v) {
        Intent intent = new Intent(getApplicationContext(), routeActivity.class);
        startActivity(intent);
    }
    public void toiletClick(View v) {
        Intent intent = new Intent(getApplicationContext(), toiletActivity.class);
        startActivity(intent);
    }
    public void lockerClick(View v) {
        Intent intent = new Intent(getApplicationContext(), lockerActivity.class);
        startActivity(intent);
    }
}
