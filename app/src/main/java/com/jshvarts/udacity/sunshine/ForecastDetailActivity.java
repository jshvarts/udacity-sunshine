package com.jshvarts.udacity.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ForecastDetailActivity extends AppCompatActivity {
    public static final String EXTRA_DETAIL = "detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast_detail);
    }
}
