package com.rafsan.hellopolice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphCardView;

public class ChattogramDiv extends AppCompatActivity {

    TextView textMarque;

    GridView chattogramGridView;

    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chattogram_div);

        textMarque = findViewById(R.id.textMarque);
        textMarque.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textMarque.setSelected(true);

        chattogramGridView = findViewById(R.id.chattogramGridView);

        chattogramDisTable();

        MyChattogram myChattogram = new MyChattogram();
        chattogramGridView.setAdapter(myChattogram);

    }

    private  class MyChattogram extends BaseAdapter{

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

    private void chattogramDisTable(){
        hashMap = new HashMap<>();
        hashMap.put("districtName","Cumilla");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Feni");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Brahmanbaria");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Rangamati");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Noakhali");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Chandpur");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Lakshmipur");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Chattogram");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Coxsbazar");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Khagrachhari");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Bandarban");
        arrayList.add(hashMap);
    }
}