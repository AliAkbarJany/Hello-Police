package com.rafsan.hellopolice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphCardView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
//========================= Function/Method (Call)======================
        divisionTable();

        MyAdapter myAdapter = new MyAdapter();
        gridView.setAdapter(myAdapter);

    }


//    ===================== Custom Adapter=======================

    private  class MyAdapter extends BaseAdapter{

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

            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView = layoutInflater.inflate(R.layout.divisions_list,parent,false);

            TextView textDivision = myView.findViewById(R.id.textDivision);
            NeumorphCardView divCardView = myView.findViewById(R.id.divCardView);

            HashMap<String,String> hashMap1 = arrayList.get(position);

            String divName = hashMap1.get("divisionName");
            textDivision.setText(divName);

            divCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (divName.contains("Dhaka")){
                        startActivity(new Intent(MainActivity.this,DhakaDiv.class));
                    }
                    else if (divName.contains("Rajshahi")) {
                        startActivity(new Intent(MainActivity.this, RajshahiDiv.class));
                    }
                    else if (divName.contains("khulna")) {
                        startActivity(new Intent(MainActivity.this,KhulnaDiv.class));
                    }
                    else if (divName.contains("Barishal")) {
                        startActivity(new Intent(MainActivity.this,BarishalDiv.class));
                    }
                    else if (divName.contains("Chattogram")) {
                        startActivity(new Intent(MainActivity.this, ChattogramDiv.class));
                    }
                    else if (divName.contains("Sylhet")) {
                        startActivity(new Intent(MainActivity.this, SylhetDiv.class));
                    }
                    else if (divName.contains("Rangpur")) {
                        startActivity(new Intent(MainActivity.this, RajshahiDiv.class));
                    }
                    else if (divName.contains("Mymensingh")) {
                        startActivity(new Intent(MainActivity.this, Mymensingh.class));
                    }

                }
            });


            return myView;
        }
    }


// ===================== Division Table====================
    private  void divisionTable(){

        hashMap = new HashMap<>();
        hashMap.put("divisionName","Dhaka");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("divisionName","Rajshahi");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("divisionName","khulna");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("divisionName","Barishal");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("divisionName","Chattogram");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("divisionName","Sylhet");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("divisionName","Rangpur");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("divisionName","Mymensingh");
        arrayList.add(hashMap);

    }
}