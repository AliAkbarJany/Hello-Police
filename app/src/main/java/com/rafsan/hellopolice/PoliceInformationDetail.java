package com.rafsan.hellopolice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PoliceInformationDetail extends AppCompatActivity {

    TextView textPoliceNum,textHistory,textPoliceStationName;

    ImageView callButton;

//    ImageButton callButtonPolice;
//    Button button;

    public static String POLICE_Number = "";
    public static String HISTORY = "";
    public static String POLICE_STATION_NAME = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_information_detail);

//        callButtonPolice = findViewById(R.id.callButtonPolice);

        callButton = findViewById(R.id.callButton);

//        button = findViewById(R.id.button);

        textPoliceNum = findViewById(R.id.textPoliceNum);
        textHistory = findViewById(R.id.textHistory);
        textPoliceStationName = findViewById(R.id.textPoliceStationName);

        textPoliceNum.setText(POLICE_Number);
        textHistory.setText(HISTORY);
        textPoliceStationName.setText(POLICE_STATION_NAME);

//        callButtonPolice.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:"+POLICE_Number));
//                startActivity(intent);
//            }
//        });

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+POLICE_Number));
                startActivity(intent);
            }
        });

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:"+POLICE_Number));
//                startActivity(intent);
//
//            }
//        });


    }
}