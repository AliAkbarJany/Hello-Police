package com.rafsan.hellopolice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphCardView;

public class SylhetDiv extends AppCompatActivity {

    TextView textMarque,callNumber1,callNumber2,callNumber3;

    ImageView callButton1,callButton2,callButton3;

    GridView sylhetGridView;
    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet_div);

        //=========Marque Text=============
        textMarque = findViewById(R.id.textMarque);
        textMarque.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textMarque.setSelected(true);
        //====================================


        //==============================================
        //==============================================
        callNumber1 = findViewById(R.id.callNumber1);
        callNumber2 = findViewById(R.id.callNumber2);
        callNumber3 = findViewById(R.id.callNumber3);

        callButton1 = findViewById(R.id.callButton1);
        callButton2 = findViewById(R.id.callButton2);
        callButton3 = findViewById(R.id.callButton3);

        callButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = callNumber1.getText().toString();
                Intent myIntent = new Intent(Intent.ACTION_CALL);
                myIntent.setData(Uri.parse("tel:"+number));
                startActivity(myIntent);
            }
        });
        callButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = callNumber2.getText().toString();
                startActivity(new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+number)));
            }
        });

        callButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = callNumber3.getText().toString();
                startActivity(new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+number)));
            }
        });
        //==============================================
        //==============================================

        sylhetGridView = findViewById(R.id.sylhetGridView);

        sylhetDisTable();

        MySylhet mySylhet = new MySylhet();
        sylhetGridView.setAdapter(mySylhet);

    }

    private class MySylhet extends BaseAdapter{

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = getLayoutInflater();
            View myView = layoutInflater.inflate(R.layout.districts_list,parent,false);

            TextView textDistrict = myView.findViewById(R.id.textDistrict);
            NeumorphCardView disCardView = myView.findViewById(R.id.disCardView);

            HashMap<String,String> hashMap1 = arrayList.get(position);

            String districtName = hashMap1.get("districtName");
            textDistrict.setText(districtName);

            String policeCall = hashMap1.get("policeCall");

            disCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (districtName.contains("Sylhet")){
                        PoliceInformationDetail.POLICE_Number = policeCall;

                        startActivity(new Intent(SylhetDiv.this, PoliceInformationDetail.class));
                    }
                    else if (districtName.contains("Moulvibazar")) {
                        PoliceInformationDetail.POLICE_Number = policeCall;

                        startActivity(new Intent(SylhetDiv.this, PoliceInformationDetail.class));
                    }
                    else if (districtName.contains("Habiganj")) {
                        PoliceInformationDetail.POLICE_Number = policeCall;

                        startActivity(new Intent(SylhetDiv.this, PoliceInformationDetail.class));
                    }
                }
            });

            return myView;
        }
    }

    private void sylhetDisTable(){
        hashMap = new HashMap<>();
        hashMap.put("districtName","Sylhet");
        hashMap.put("policeCall","০১৩২০-০৬৯৯৯৯");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Moulvibazar");
        hashMap.put("policeCall","০১৩২০-১২০৬৯৮");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Habiganj");
        hashMap.put("policeCall","Habiganj");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Sunamganj");
        hashMap.put("policeCall","Sunamganj");
        arrayList.add(hashMap);

    }
}