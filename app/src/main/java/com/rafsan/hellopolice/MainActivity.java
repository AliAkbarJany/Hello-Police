package com.rafsan.hellopolice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bdtopcoder.smart_slider.SliderAdapter;
import com.bdtopcoder.smart_slider.SliderItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import soup.neumorphism.NeumorphCardView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String> hashMap;

    private static final int REQUEST_CALL = 1;

    TextView callNumber;
    ImageView callButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Image slider==========Start===============================

        ViewPager2 viewPager2 = findViewById(R.id.smartSlider);

        List<SliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem(R.drawable.emergency_999,"Emergency Service"));
        sliderItems.add(new SliderItem(R.drawable.gov_info_333,"Government Information"));
        sliderItems.add(new SliderItem(R.drawable.women_child,"Women & Child"));
        sliderItems.add(new SliderItem(R.drawable.fire_service,"Fire Service"));
//        sliderItems.add(new SliderItem("https://atikulislam.xyz/images/hero.jpg","Image from url"));

        viewPager2.setAdapter(new SliderAdapter(sliderItems,viewPager2,4000));

        new SliderAdapter((position, title, view) -> {
            Toast.makeText(this, "Position: "+position+" Title: "+title, Toast.LENGTH_SHORT).show();
        });

        // Image slider==========End===============================

        // Call System=========================================
        callNumber = findViewById(R.id.callNumber);
        callButton = findViewById(R.id.callButton);

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = callNumber.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+number));
                startActivity(intent);
            }
        });

        gridView = findViewById(R.id.gridView);
//========================= Function/Method (Call)======================
        divisionTable();

        MyAdapter myAdapter = new MyAdapter();
        gridView.setAdapter(myAdapter);

    }
//= onCreate method end here=========================



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
                        startActivity(new Intent(MainActivity.this, RangpurDiv.class));
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

//========================================Function/Method=================

//    private void call_button(){
//        String number = callNumber.getText().toString();
//
//        if (number.trim().length()>0){
//            if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
//                ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
//            }
//            else {
//                String dial = "tel :"+number;
//                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
//            }
//        }
//    }



//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if (requestCode == REQUEST_CALL) {
//
//            if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
//                call_button();
//            }
//            else {
//                Toast.makeText(MainActivity.this,"Permission Denied",Toast.LENGTH_LONG).show();
//            }
//
//        }
//    }


}