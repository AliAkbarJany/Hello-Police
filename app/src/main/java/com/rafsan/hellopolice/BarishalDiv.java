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

public class BarishalDiv extends AppCompatActivity {

    TextView textMarque;

    GridView barishalGridView;

    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barishal_div);

        textMarque = findViewById(R.id.textMarque);
        textMarque.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textMarque.setSelected(true);

        barishalGridView = findViewById(R.id.barishalGridView);

        barishalDisTable();

        MyBarishal myBarishal = new MyBarishal();
        barishalGridView.setAdapter(myBarishal);

    }

    private class MyBarishal extends BaseAdapter{

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

    private  void barishalDisTable(){

        hashMap = new HashMap<>();
        hashMap.put("districtName","Jhalakathi");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Patuakhali");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Pirojpur");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Barishal");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Bhola");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Barguna");
        arrayList.add(hashMap);


    }



}