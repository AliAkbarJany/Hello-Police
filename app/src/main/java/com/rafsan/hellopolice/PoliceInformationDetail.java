package com.rafsan.hellopolice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PoliceInformationDetail extends AppCompatActivity {

    TextView textPoliceNum;

    public static String POLICE_Number = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_information_detail);

        textPoliceNum = findViewById(R.id.textPoliceNum);

        textPoliceNum.setText(POLICE_Number);

    }
}