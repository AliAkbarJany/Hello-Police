package com.rafsan.hellopolice;

import androidx.appcompat.app.AppCompatActivity;

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

public class RangpurDiv extends AppCompatActivity {

    GridView rangpurGridView;
    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur_div);

        rangpurGridView = findViewById(R.id.rangpurGridView);

        rangpurDisTable();

        MyRangpur myRangpur = new MyRangpur();
        rangpurGridView.setAdapter(myRangpur);

    }

    private  class MyRangpur extends BaseAdapter{

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

            return myView;
        }
    }

    private void rangpurDisTable(){
        hashMap = new HashMap<>();
        hashMap.put("districtName","Panchagarh");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Dinajpur");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Lalmonirhat");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Nilphamari");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Gaibandha");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Thakurgaon");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Rangpur");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Kurigram");
        arrayList.add(hashMap);
    }
}