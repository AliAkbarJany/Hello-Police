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

public class DhakaDiv extends AppCompatActivity {

    TextView textMarque;

    GridView dhakaGridView;

    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka_div);

        textMarque = findViewById(R.id.textMarque);
        textMarque.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textMarque.setSelected(true);

        dhakaGridView = findViewById(R.id.dhakaGridView);
//========================= Function/Method (Call)======================
        dhakaDisTable();

        MyDhaka myDhaka = new MyDhaka();
        dhakaGridView.setAdapter(myDhaka);

    }
//=================Custom Adapter==========================
    private class MyDhaka extends BaseAdapter{

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

//================== District table=============================
    private  void dhakaDisTable(){

        hashMap = new HashMap<>();
        hashMap.put("districtName","Narsingdi");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Gazipur");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Shariatpur");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Narayanganj");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Tangail");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Kishoreganj");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Manikganj");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Dhaka");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Rajbari");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Madaripur");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Gopalganj");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Faridpur");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Munshiganj");
        arrayList.add(hashMap);

    }
}