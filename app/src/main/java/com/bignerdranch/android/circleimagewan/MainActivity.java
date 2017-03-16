package com.bignerdranch.android.circleimagewan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private CircleImageViewWan circleImageViewWan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleImageViewWan=(CircleImageViewWan)findViewById(R.id.circle);
    }
}
