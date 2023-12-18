package com.rafsan.hellopolice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PoliceInformationDetail extends AppCompatActivity {

    TextView textPoliceNum,textHistory,textPoliceStationName;

    public static String POLICE_Number = "";
    public static String HISTORY = "";
    public static String POLICE_STATION_NAME = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_information_detail);

        textPoliceNum = findViewById(R.id.textPoliceNum);
        textHistory = findViewById(R.id.textHistory);
        textPoliceStationName = findViewById(R.id.textPoliceStationName);

        textPoliceNum.setText(POLICE_Number);
        textHistory.setText(HISTORY);
        textPoliceStationName.setText(POLICE_STATION_NAME);

    }
}