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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphCardView;

public class RajshahiDiv extends AppCompatActivity {

    TextView textMarque;

    GridView rajshahiGridView;

    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi_div);

        textMarque = findViewById(R.id.textMarque);
        textMarque.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textMarque.setSelected(true);

        rajshahiGridView = findViewById(R.id.rajshahiGridView);

        rajshahiDisTable();

        MyRajshahi myRajshahi =new MyRajshahi();
        rajshahiGridView.setAdapter(myRajshahi);

    }

    private class MyRajshahi extends BaseAdapter{

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

    private void rajshahiDisTable(){

        hashMap = new HashMap<>();
        hashMap.put("districtName","Sirajganj");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Pabna");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Bogura");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Rajshahi");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Natore");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Joypurhat");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Chapainawabganj");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Naogaon");
        arrayList.add(hashMap);

    }
}