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

public class RangpurDiv extends AppCompatActivity {

    TextView textMarque,callNumber1,callNumber2,callNumber3;

    ImageView callButton1,callButton2,callButton3;

    GridView rangpurGridView;
   ArrayList<HashMap<String,String>>arrayList = new ArrayList<>();
   HashMap<String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur_div);

        textMarque = findViewById(R.id.textMarque);
        textMarque.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textMarque.setSelected(true);

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

            String policeCall = hashMap1.get("policeCall");
            String history = hashMap1.get("history");
            String policeStationName = hashMap1.get("policeStationName");

            disCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (districtName.contains("Rangpur")){

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(RangpurDiv.this, PoliceInformationDetail.class));
                    }
                    else if (districtName.contains("Panchagarh")) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(RangpurDiv.this, PoliceInformationDetail.class));
                    }
                    else if (districtName.contains("Dinajpur")) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(RangpurDiv.this, PoliceInformationDetail.class));
                    }
                    else if ( districtName.contains("Lalmonirhat") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(RangpurDiv.this, PoliceInformationDetail.class));

                    }else if ( districtName.contains("Nilphamari") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;

                        startActivity(new Intent(RangpurDiv.this, PoliceInformationDetail.class));

                    }else if ( districtName.contains("Gaibandha") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(RangpurDiv.this, PoliceInformationDetail.class));

                    }else if ( districtName.contains("Thakurgaon") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(RangpurDiv.this, PoliceInformationDetail.class));

                    }else if ( districtName.contains("Kurigram") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(RangpurDiv.this, PoliceInformationDetail.class));

                    }
                }
            });

            return myView;
        }
    }

    private  void rangpurDisTable(){
        hashMap = new HashMap<>();
        hashMap.put("districtName","Rangpur");
        hashMap.put("policeCall","01320131381");
        hashMap.put("policeStationName","Rangpur Police Station");
        hashMap.put("history","রংপুর জেলার পটভূমি\n" +
                "নামকরণের ক্ষেত্রে লোকমুখে প্রচলিত আছে যে পূর্বের ‘রঙ্গপুর’ থেকেই কালক্রমে এই নামটি এসেছে। ইতিহাস থেকে জানা যায় যে উপমহাদেশে ইংরেজরা নীলের চাষ শুরু করে। এই অঞ্চলে মাটি উর্বর হবার কারণে এখানে প্রচুর নীলের চাষ হত। সেই নীলকে স্থানীয় লোকজন রঙ্গ নামেই জানত। কালের বিবর্তনে সেই রঙ্গ থেকে রঙ্গপুর এবং তা থেকেই আজকের রংপুর। অপর একটি প্রচলিত ধারণা থেকে জানা যায় যে রংপুর জেলার পূর্বনাম রঙ্গপুর।\n" +
                "প্রাগ জ্যোতিস্বর নরের পুত্র ভগদত্তের রঙ্গমহল এর নামকরণ থেকে এই রঙ্গপুর নামটি আসে। রংপুর জেলার অপর নাম জঙ্গপুর । ম্যালেরিয়া রোগের প্রাদুর্ভাব থাকায় কেউ কেউ এই জেলাকে যমপুর বলেও ডাকত। তবে রংপুর জেলা সুদুর অতীত থেকে আন্দোলন প্রতিরোধের মূল ঘাটি ছিল। তাই জঙ্গপুর নামকেই রংপুরের আদি নাম হিসেবে ধরা হয়। জঙ্গ অর্থ যুদ্ধ, পুর অর্থ নগর বা শহর। গ্রাম থেকে আগত মানুষ প্রায়ই ইংরেজদের অত্যাচারে নিহত হত বা ম্যালেরিয়ায় মারা যেত। তাই সাধারণ মানুষ শহরে আসতে ভয় পেত। সুদুর অতীতে রংপুর জেলা যে রণভূমি ছিল তা সন্দেহাতীত ভাবেই বলা যায়। ত্রিশের দশকের শেষ ভাগে এ জেলায় কৃষক আন্দোলন যে ভাবে বিকাশ লাভ করে ছিল তার কারণে রংপুরকে লাল রংপুর হিসেবে আখ্যায়িত করা হয়েছিল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Panchagarh");
        hashMap.put("policeCall","01713-373999");
        hashMap.put("policeStationName","Panchagarh Police Station");
        hashMap.put("history","জেলার পটভূমি\n" +
                "বহু আর্বতন ও বিবর্তনের মধ্যদিয়ে পঞ্চগড় জেলার অগ্রযাত্রা শুরু হয়েছে এবং এখনো তা অব্যাহত রয়েছে। পঞ্চগড় নামকরনেও রয়েছে এক ঐতিহ্যপূর্ণ ইতিহাস। পঞ্চগড় নামকরণ সমন্ধে কেহ কেহ মনে করেন যে, এ অঞ্চলটি অতি প্রাচীনকালে ‘পুন্ডুনগর রাজ্যের অর্ন্তগত ‘পঞ্চনগরী’ নামে একটি অঞ্চল ছিল। কালক্রমে পঞ্চনগরী ‘পঞ্চগড়’ নামে আত্মপ্রকাশ করে। ‘পঞ্চ’ (পাঁচ) গড়ের সমাহার ‘পঞ্চগড়’ নামটির অপভ্রাংশ ‘পঞ্চগড়’ দীর্ঘকাল এই জনপদে প্রচলিত ছিল। কিন্তু এই অঞ্চলের নাম যে, পঞ্চগড়ই ছিল সে ব্যাপারে কোন সন্দেহ থাকতে পারে না। বস্ত্ততঃ ভারতীয় উপমহাদেশে ‘পঞ্চ’ শব্দটি বিভিন্ন স্থানের নামের সাথে যুক্ত হয়েছে। যেমন- পঞ্চনদ, পঞ্চবটি, পঞ্চনগরী পঞ্চগৌড় ইত্যাদি। সুতরাং পঞ্চগৌড়ের একটি অংশ হিসেবে প্রাকৃত ভাষার বৈশিষ্ট্য অনুযায়ী পঞ্চগড়ের নামকরনের সম্ভাবনা থকে যায়। অর্থ্যাৎ পঞ্চগৌড় > পঞ্চগোড়>পঞ্চগড়। অবশ্য বহুল প্রচলিত মত এই যে, এই অঞ্চলের পাঁচটি গড়ের সুস্পষ্ট অবস্থানের কারণেই পঞ্চগড় নামটির উৎপত্তি। গড়গুলো হচ্ছে, ভিতরগড়, মীরগড়, হোসেনগড়, রাজনগড় ও দেবেনগড়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Dinajpur");
        hashMap.put("policeCall","01713-373963");
        hashMap.put("policeStationName","Dinajpur Police Station");
        hashMap.put("history","জেলার পটভূমি\n" +
                "সাহিত্য ও সংস্কৃতির ঐতিহ্যমন্ডিত দিনাজপুরের ইতিহাস অত্যন্ত প্রাচীন ও সমৃদ্ধ। বিশেষজ্ঞদের মতে, ভারতের ছোট নাগপুর, বিন্ধ্যা পর্বত প্রভৃতি লাখ লাখ বছরের প্রাচীন স্থানগুলোর মৃত্তিকার সমগোত্রীয় দিনাজপুরের মাটি। বহুকাল পূর্বে হিমালয় পর্বতের ভগ্নীরূপে জন্ম নেয়া বরেন্দ্র ভূমির হৃদয়-স্থানীয় স্থান দিনাজপুর। লোকশ্রুতি অনুযায়ী জনৈক দিনাজ অথবা দিনারাজ দিনাজপুর রাজপরিবারের প্রতিষ্ঠাতা। তাঁর নামানুসারেই রাজবাড়ীতে অবস্থিত মৌজার নাম হয় দিনাজপুর। পরবর্তীতে ব্রিটিশ শাসকরা ঘোড়াঘাট সরকার বাতিল করে নতুন জেলা গঠন করে এবং রাজার সম্মানে জেলার নামকরণ করে দিনাজপুর।\n" +
                "\n" +
                " \n" +
                "\n" +
                "বাংলাদেশ ইষ্ট ইন্ডিয়া কোম্পানীর শাসনের সূচনায় সৃষ্ট আদি জেলা শহরগুলির অন্যতম দিনাজপুর। ইংরেজ সেনারা পলাশী যুদ্ধের আট বছর পর ১৭৬৫ খ্রিস্টাব্দে এ এলাকা জয় করে। ফলে নবাবী শাসনের অবসানের সঙ্গে পতন হয় সাবেক রাজধানী ঘোড়াঘাট নগরের। তারপর থেকে গড়ে উঠতে শুরু করে দিনাজপুর শহর।\n" +
                "\n" +
                "দিনাজপুর গেজেটিয়ারের মতে ১৭৮৩ খ্রিস্টাব্দে জেলা শাসনের জন্য দিনাজপুরে স্বতন্ত্র স্থায়ী কালেক্টরেট স্থাপিত হয়। তার পূর্ব পর্যন্ত দিনাজপুর-রংপুর যুক্ত কালেক্টরেট ছিল। রাজসেরেস্তা থেকে নথিপত্র প্রত্যাহার করে জিলা স্কুলের পুরাতন ভবনটিতে (সম্প্রতি ভেঙ্গে ফেলা হয়েছে) কালেক্টর অফিস স্থাপিত হয়। জেলা স্কুল হওয়ার পূর্বে ভবনটি রাজকাচারী ছিল। তখন কালেক্টর ছিলেন মি. ম্যারিওয়েট; রাজা ছিলেন রাজবংশের নাবলক উত্তরাধিকারী রাধানাথ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Lalmonirhat");
        hashMap.put("policeCall","01713-373947");
        hashMap.put("policeStationName","Lalmonirhat Police Station");
        hashMap.put("history","জেলার পটভূমি\n" +
                "১৯৮৪ খ্রিষ্টাব্দের ১লা ফেব্রুয়ারি বাংলাদেশ সরকারের তৎকালীন সমাজ কল্যাণ ও মহিলা বিষয়ক উপদেষ্টা (মন্ত্রী) ডঃ শাফিয়া খাতুন কর্তৃক উদ্বোধনের মধ্য দিয়ে লালমনিরহাট মহকুমা ‘জেলা’ হিসেবে আত্মপ্রকাশ করে। পরে ১৯৮৪ খ্রিষ্টাব্দের ১৮ মার্চ লালমনিরহাট সদর থানা ‘উপজেলা’ হিসেবে ঘোষিত হয়। ফলে লালমনিরহাট জেলার অধীনে উপজেলার সংখ্যা দাড়ায় - ৫টি; পাটগ্রাম, হাতীবান্ধা, কালীগঞ্জ, আদিতমারী এবং লালমনিরহাট সদর। এসময় লালমনিরহাট সদর থানার ছিনাই, রাজারহাট এবং ঘড়িয়ালডাঙ্গা ইউনিয়ন পাশ্ববর্তী কুড়িগ্রাম জেলার সাথে যুক্ত হলে নবগঠিত লালমনিরহাট জেলায় ইউনিয়নের সংখ্যা দাড়ায় ৪১টি এবং পৌরসভার সংখ্যা ১টি। তাছাড়া লালমনিরহাট সদর উপজেলার আয়তন দাড়ায় ১০৪ বর্গমাইল।\n" +
                "\n" +
                "১৯৮৫ খ্রিষ্টাব্দের পর থেকে দহগ্রাম ও আঙ্গরপোতা ছিটমহল পাটগ্রাম উপজেলার একটি স্বতন্ত্র ইউনিয়ন হিসেবে পরিগণিত হয় এবং ১৯৮৯ খ্রিষ্টাব্দের ১৯ আগস্ট এখানে ইউনিয়ন পরিষদের শুভ উদ্বোধন ঘটে, ফলে লালমনিরহাট জেলায় ইউনিয়ন সংখ্যা দাড়ায় ৪২টি। বর্তমানে লালমনিরহাট জেলায় পৌরসভা ২টি, উপজেলা ৫টি ও ইউনিয়ন ৪৫টি।\n" +
                "\n" +
                "ডায়াবেটিক সমিতি, লালমনিরহাট এর সাবেক কার্যালয়ের স্থলে ছিল জেলা প্রশাসকের প্রথম কার্যালয়। ১৯৮৬ খ্রিষ্টাব্দের শেষের দিকে লালমনিরহাট জেলা প্রশাসক কার্যালয় স্থানান্তরিত হয় বর্তমান মজিদা খাতুন সরকারি মহিলা কলেজের স্থলে। ১৯৮৮ খ্রিষ্টাব্দের জুন মাসের মাঝামাঝি সময়ে আবার তা স্থানান্তরিত হয়ে বর্তমান স্থানে চলে আসে।\n" +
                "\n" +
                "১৯৯০ খ্রিষ্টাব্দের ১৭ জানুয়ারি বিদ্যমান জেলা প্রশাসকের কার্যালয় তথা কালেক্টরেট ভবনের উদ্বোধন করেন তৎকালীন প্রেসিডেন্ট লে. জে. এইচ. এম. এরশাদ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Nilphamari");
        hashMap.put("policeCall","01713-373909");
        hashMap.put("policeStationName","Nilphamari Police Station");
        hashMap.put("history","জেলার পটভূমি\n" +
                "দুই শতাধিক বছর পূর্বে এ অঞ্চলে নীল চাষের খামার স্থাপন করে ইংরেজ নীলকরেরা। এ অঞ্চলের উর্বর ভূমি নীল চাষের অনুকূল হওয়ায় দেশের অন্যান্য এলাকার তুলনায় নীলফামারীতে বেশি সংখ্যায় নীলকুঠি ও নীল খামার গড়ে ওঠে। ঊণবিংশ শতাব্দীর শুরুতেই দুরাকুটি, ডিমলা, কিশোরগঞ্জ, টেঙ্গনমারী প্রভৃতি স্থানে নীলকুঠি স্থাপিত হয়।\n" +
                "\n" +
                "সে সময় বৃহত্তর রংপুর অঞ্চলের মধ্যে নীলফামারীতেই বেশি পরিমাণে শস্য উৎপাদিত হতো এখানকার উর্বর মাটির গুণে। সে কারণেই নীলকরদের ব্যাপক আগমন ঘটে এতদঅঞ্চলে। গড়ে ওঠে অসংখ্য নীল খামার। বর্তমান নীলফামারী শহরের তিন কিলোমিটার উত্তরে পুরাতন রেল স্টেশনের কাছেই ছিল একটি বড় নীলকুঠি। \n" +
                "\n" +
                "ধারণা করা হয়, স্থানীয় কৃষকদের মুখে ‘নীল খামার’ রূপান্তরিত হয় ‘নীল খামারী’তে। আর এই নীলখামারীর অপভ্রংশ হিসেবে উদ্ভব হয় নীলফামারী নামের।\n" +
                "\n" +
                "নীলফামারী একটি প্রাচীন জনপদ। ঐতিহাসিক বিভিন্ন নিদর্শন ও প্রাচীন গ্রন্থাদি থেকে এ অঞ্চলে আদিম জনবসতির অস্তিত্বের কথা জানা যায়। খ্রিস্টপূর্ব নবম শতকে খননকৃত বিরাট রাজার দীঘি অপভ্রংশে বিন্নাদীঘি নীলফামারীর প্রাচীন ইতিহাসের কথা স্মরণ করিয়ে দেয়। এছাড়াও বিলুপ্তপ্রায় ধর্মপালের গড়, হরিশচন্দ্রের পাঠ, ভীমের মায়ের চুলা, ময়নামতির দূর্গ এ জেলার ঐতিহাসিক নিদর্শন।\n" +
                "\n" +
                "হিমালয়ের পাদদেশে অবস্থিত নীলফামারী জেলা হিমালয় পর্বত বাহিত পলল দিয়ে গঠিত। করতোয়া, আত্রাই ও তিস্তা নদের পলিমাটি এ অঞ্চলের মৃত্তিকা গঠন ও ভূমির উর্বরতা বৃদ্ধি করেছে।নীলফামারীর এ ভূ-পৃষ্ঠকে পাদদেশীয় পাললিক সমভূমি বলা হয়। বিভিন্ন প্রাকৃতিক বিবর্তনে নীলফামারীর নদীপথ বারংবার গতিপথ পরিবর্তন করে ক্রমশঃ উর্বর সমভূমি অঞ্চলে পরিণত হয়েছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Gaibandha");
        hashMap.put("policeCall","01713-373892");
        hashMap.put("policeStationName","Gaibandha Police Station");
        hashMap.put("history","জেলার পটভূমি\n" +
                "বৌদ্ধ, হিন্দু, মোঘল, পাঠান আমলসহ ইংরেজ শাসনামলের স্মৃতি বিজড়িত আমাদের এই গাইবান্ধা জেলা। বিভিন্ন শাসনামলে নানা সংগ্রাম-বিদ্রোহ এ অঞ্চলে সংঘটিত হয়েছে। গাইবান্ধা আদিতে কেমন ছিল সে বিষটি প্রথমে আলোচনা করা দরকার। বিভিন্ন সুত্র থেকে প্রাপ্ত তথ্য  এব্যাপারে বেশ কিছু ধারনা দেয়। গাইবান্ধা জেলার মুল ভুখন্ড নদীর তলদেশে ছিল এবং কালক্রমে যা নদীবাহিত পলিতে ভরাট হয় এবং এতদঞ্চলে সংঘঠিত একটি শক্তিশালী ভুমিকম্পের ফলে নদী তলদেশের উত্থান ঘটে এবং স্থলভূমিতে পরিণত হয়। তিস্তা, ব্রহ্মপুত্র ও যমুনা নদী বাহিত পলি মাটি দিয়েই গড়ে উঠেছে আজকের গাইবান্ধা।\n" +
                "\n" +
                "গাইবান্ধা নামকরণ প্রসংগঃ জেলা শহরের বর্তমান অবস্থানের গাইবান্ধা নামকরণ ঠিক কবে নাগান হয়েছে তার সঠিক তথ্য এখনও পাওয়া যায় নি।  তবে রংপূরের কালেকক্টর ইজি, গ্লেজিয়ার ১৮৭৩ সালে যে রিপোর্ট প্রণয়ন করেছিলেন সেই রিপোর্ট গাইবান্ধা নামটি ইংরাজীতে লেখা হয়েছে এণঊইঅঘউঅ এবং সেই এণঊইঅঘউঅ  এর অবস্থান হিসেউেল্লেখ করা হয়েছে ঘাঘট পাড়ের কথা। এই ঘাটটই যে ঘাঘট নদী সেটা বলা যায়। রংপুরের গ্লেজিয়ার সাহেবের পূর্বে কালেকটর ছিলেন জেমস রেনেল। তার প্রণীত রেনেল জার্নালস থেকে জানা যায় ১৭৯৩ সালে উত্তর বঙ্গে  পুনভাব, ধরলা, তিস্তা, মানস এবং ঘাঘট খাল নৌ পরিবহনে সহায়ক ছিল। লেখা হয়েছে ঘাঘট খালে জানুয়ারী মাসেই বিরাট বিরাট নৌকা চলাচল করতো। জেমস রেনেল এবং ইজি গ্লেজিয়ার দুজন কালেক্টরের রিপোর্টেই অবশ্য ঘাঘটকে খাল হিসাবে উল্লেখ করা হয়েছে। সেদিক থেকে বোঝা যায় ঘাঘট নদী ১৭৯৩ সালেও সে সময়ের নদী গুলোর  চাইতে ছোট আকৃতির ছিল বলেই ঘাঘটকে খাল হিসাবে উল্লেখ করা হয়েছে। আবার এই তথ্য থেকে আরেকটা বিষয় বলা যায় যে, ১৭৯৩ সালেও মানস নদী ছিল। ঘাঘট নদীর মতই। অপর যে বিষয়টি এই দুটি তথ্য থেকে অবহিত হওয়া যায়, তা ১৭৯৩ সালে গাইবান্ধা নামটি উল্লেখযোগ্য ছিল না। ১৮৭৩ সালে ইজি গ্লেজিয়ার তার রিপোর্টে গাইবান্ধা নামটি উল্লেখ করেন । সম্ভবতঃ ১৭৯৩ সালের আগে ঘাঘট নদীর তীরবতী এই স্থানটি একটি পতিত ভূখভ এবং গোচারণ ভূমি হিসাবে ব্যবহৃত হতো। জনবসতি ছিল না বলেই রংপুরের কালেক্টদের রিপোর্টে গাইবান্ধা নামটি ১৮৭৩ সালের আগে উল্লিখিত হয়নি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Thakurgaon");
        hashMap.put("policeCall","01769-691251");
        hashMap.put("policeStationName","Thakurgaon Police Station");
        hashMap.put("history","জেলার পটভূমি\n" +
                "১৮০০ সালে বৃটিশ শাসনামলে টাঙ্গন, শুক, কুলিক, পাথরাজ ও ঢেপা বিধৌত এই জনপদের একটি ঠাকুর পরিবারের উদ্যোগে বর্তমান পৌরসভা এলাকার কাছাকাছি কোনো একটি স্থানে থানা স্থাপিত হয়। তাদের নাম অনুসারে থানাটির নাম হয় ঠাকুরগাঁও থানা। মতান্তরে ঠাকুর-অর্থাৎ ব্রাহ্মণদের সংখ্যাধিক্যের কারণে স্থানটির নাম ঠাকুরগাঁও হয়েছে। ১৮৬০ সালে এটি মহকুমা হিসেবে ঘোষিত হয়। এর অধীনে ছয়টি থানা ছিলো যথা-সদর, বালিয়াডাঙ্গী, পীরগঞ্জ, রাণীশংকৈল, হরিপুর ও আটোয়ারী। ১৯৪৭ সালে ভারতের জলপাইগুড়ি জেলার ৩টি থানা ও কোচবিহারের ১টি থানা (আটোয়ারী ছাড়া পঞ্চগড় জেলার বাকি ৪টি থানা) নিয়ে ১০টি থানার মহকুমা হিসেবে ঠাকুরগাঁও নতুনভাবে যাত্রা শুরু করে। কিন্তু ১৯৮১ সালে আটোয়ারী, পঞ্চগড়, বোদা, দেবীগঞ্জ ও তেতুলিয়া নিয়ে পঞ্চগড় আলাদা মহকুমা হলে ঠাকুরগাঁও এর ভৌগলিক সীমানা ৫টি থানা এলাকায় সংকুচিত হয়ে যায়। থানাগুলি হচ্ছে-ঠাকুরগাঁও সদর, বালিয়াডাঙ্গী, পীরগঞ্জ, রাণীশংকৈল ও হরিপুর। ১৯৮৪ সালের ১ লা ফেব্রুয়ারি এই ৫টি থানা নিয়ে ঠাকুরগাঁও জেলা যাত্রা শুরু করে।\n" +
                "\n" +
                "ছোট জেলা হলেও ঠাকুরগাঁও একটি প্রাচীন ঐতিহ্যসমৃদ্ধ জনপদ। এখানে যেমন আদিবাসী জনগোষ্ঠীর মানুষ হাজার বছর ধরে তাদের ভাষা ও সংস্কৃতিকে ধরে রেখেছে, তেমনিভাবে বৌদ্ধ, হিন্দু, মুসলমান শাসনামলের পরিবর্তনের ছোঁয়ায় পালাবদলের প্রক্রিয়া চলছে এখানে। জেলার অতি প্রাচীন পুকুরগুলি এবং গড়গুলির অস্তিত্ব সুপ্রাচীন সভ্যতার নিদর্শন তুলে ধরে। এই জেলার মানুষ বৃহত্তর দিনাজপুর জেলার অন্যান্য জনপদের সভ্যতা ও সংস্কৃতির সাথে যোগসূত্র স্থাপন করে সকল সামাজিক ও রাজনৈতিক আন্দোলনে অংশগ্রহণ করেছে। ১৯৭১ এর স্বাধীনতা লাভের পর বরেন্দ্রভূমির অন্যান্য জেলার মতই ঠাকুরগাঁও জেলার মানুষ ক্রমান্বয়ে উন্নততর যোগাযোগ ব্যবস্থা এবং উন্নয়নের অন্যান্য সুফল লাভে সক্ষম হচ্ছে এবং ধীরে ধীরে এগিয়ে যাচ্ছে অর্থনৈতিক সমৃদ্ধির পথে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Kurigram");
        hashMap.put("policeCall","01713-373926");
        hashMap.put("policeStationName","Kurigram Police Station");
        hashMap.put("history","কুড়িগ্রাম জেলার পটভূমি\n" +
                "উত্তর জনপদের একটি জেলা কুড়িগ্রাম। এ জনপদের ইতিহাস আছে, ঐতিহ্য আছে, আছে স্বকীয়তা, আছে বৈশিষ্ট্য। একদিনে এর ইতিহাস গড়ে ওঠেনি, একযুগে গড়ে ওঠেনি এর ঐতিহ্য। সুদীর্ঘ যুগের চড়াই উৎরাই, ভাঙ্গা-গড়া, জয়-পরাজয়, আন্দোলন-সংগ্রামের ভেতর দিয়ে গড়ে উঠেছে এ জনপদ, এর মানুষ, এর জীবনধারা, এর বৈশিষ্ট্য। কীর্তিনাশা ধরলা, তিস্তা, ব্রহ্মপুত্র, দুধকুমার, ফুলকুমার এজনপদের যেমন অনেক কিছু গ্রাস করেছে, অন্যদিকে দেশী-বিদেশী নিষ্ঠুরশাসন-শোষণের যাতাকলে নিষ্পেষিত, বিপর্যস্ত হয়েছে এ অঞ্চলের মানুষ। আশ্চর্য, তবুও মানুষ থেমে থাকেনি, এগিয়ে গেছে প্রতিনিয়ত লড়াই করে। উত্তর জনপদেরবিচিত্র এ অঞ্চল, বৈচিত্রময় তার ইতিহাস।\n" +
                "\n" +
                " \n" +
                "\n" +
                "অতি প্রাচীন এ জনপদ; প্রাগৈতিহাসিক আদিম সভ্যতার লীলাভূমি। এ অঞ্চলের ব্রহ্মপুত্র-তিস্তা উপত্যকায় আদিম মানুষের প্রথম ঘটেছিল আবির্ভাব।নিগ্রো-অষ্ট্রিক দ্রাবিড়-মঙ্গোলীয় জনগোষ্ঠীর মিলিত রক্তধারায় গড়ে উঠেছেএখানকার প্রাচীন সভ্যতা-যা অনার্য সভ্যতা বলে সর্বজন স্বীকৃত। এ অঞ্চলের মানুষের চেহারায়, আকৃতিতে, রক্তে, ভাষায়, আচার-আচরণে প্রাগৈতিহাসিক জনগোষ্ঠীর ছাপই শুধু বিদ্যমান নয়, অনেক বৈশিষ্ট্য আজো অপরিবর্তিত রয়ে গেছে। বিচিত্র এ জনপদ। কখনো গৌড়বর্ধনে কখনো প্রাগজ্যোতিষপুরে এ অঞ্চল ছিল অন্তর্ভুক্ত। গৌড়বর্ধন আজকের মহাস্থানগড়, প্রাগজোতিষপুর কামরূপের প্রাচীন নাম, আজকের আসাম। এ দুটি রাজ্য ছিল অনার্য অধ্যুষিত অঞ্চল। রাজ্যের রাজারা ছিলেন অনার্য। তারা দীর্ঘকাল ধরে আর্যদের সঙ্গে লড়াই করেছেন। স্বাধীনতাকে অক্ষুন্ন রেখেছেন। দীর্ঘকাল ধরে অনার্য, কোল, ভিল, গারো, কোচ, মেচ, হাজং, কিরাত, কুকি, ভুটিয়া, নাগা, তিববতী, কাছার, অহোম ঐক্যবদ্ধভাবে আর্যদের বিরুদ্ধে সংগ্রামকরেছে, সমুন্নত রেখেছে তাদের স্বকীয়তা। ব্রহ্মপুত্র উপত্যকায় আর্যরা সহজেপ্রবেশ করতে পারেনি। তাই এ অঞ্চলে আর্য সভ্যতার কোন চিহ্ন নেই, পাওয়া যায়নিকোন পরিচয়। ব্রাহ্ম্য-ধর্ম এ অঞ্চলে সমাদৃত হয়নি। শংখচক্র গদাধরী কৃষ্ণ এখানে ঠাঁই পায়নি; পেয়েছে বংশীধারী কানু।");
        arrayList.add(hashMap);


    }


}