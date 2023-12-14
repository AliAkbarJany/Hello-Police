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

public class KhulnaDiv extends AppCompatActivity {

    GridView khulnaGridView;

    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna_div);
        khulnaGridView = findViewById(R.id.khulnaGridView);

        khulnaDisTable();

        MyKhulna myKhulna = new MyKhulna();
        khulnaGridView.setAdapter(myKhulna);

    }

    private  class MyKhulna extends BaseAdapter{

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

    private  void khulnaDisTable(){

        hashMap = new HashMap<>();
        hashMap.put("districtName","Jashore");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Satkhira");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Meherpur");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Narail");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Chuadanga");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Kushtia");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Magura");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Khulna");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Bagerhat");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Jhenaidah");
        arrayList.add(hashMap);

    }
}