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

public class BarishalDiv extends AppCompatActivity {

    TextView textMarque,callNumber1,callNumber2,callNumber3;

    ImageView callButton1,callButton2,callButton3;

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

            String policeCall = hashMap1.get("policeCall");
            String history = hashMap1.get("history");
            String policeStationName = hashMap1.get("policeStationName");

            disCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (districtName.contains("Barishal")){

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(BarishalDiv.this, PoliceInformationDetail.class));
                    }
                    else if (districtName.contains("Jhalakathi")) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(BarishalDiv.this, PoliceInformationDetail.class));
                    }
                    else if (districtName.contains("Patuakhali")) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(BarishalDiv.this, PoliceInformationDetail.class));
                    }
                    else if ( districtName.contains("Pirojpur") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(BarishalDiv.this, PoliceInformationDetail.class));
                    } else if ( districtName.contains("Bhola") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(BarishalDiv.this, PoliceInformationDetail.class));
                    } else if ( districtName.contains("Barguna") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(BarishalDiv.this, PoliceInformationDetail.class));
                    }
                }
            });


            return myView;
        }
    }

    private  void barishalDisTable(){

        hashMap = new HashMap<>();
        hashMap.put("districtName","Jhalakathi");
        hashMap.put("policeCall","01918-832424");
        hashMap.put("policeStationName","Jhalakathi Police Station");
        hashMap.put("history","ঝালকাঠি ভূখন্ডে ঠিক কবে থেকে জনবসতি শুরু হয়েছিল তা নিশ্চিতভাবে বলা না গেলেও নাম দেখে বোঝা যায়-এখানে অতি প্রাচীনকাল হতে কৈবর্ত জেলে সম্প্রদায়ের লোকেরাই প্রথম আবাদ আরম্ভ করেছিল। কৈবর্ত জেলেদের ঝালো বলা হতো এবং তাদের পাড়াকে বলা হতো ঝালোপাড়া। অনেকের ধারণা এ ঝালোপাড়া থেকেই ঝালকাঠি নামের উৎপত্তি। কবি বিজয়গুপ্ত মনসামঙ্গল কাব্যেও জেলে সম্প্রদায়কে ঝালো নামে উল্লেখ করেছেন। মেহেদীপুরের জেলেদের সঙ্গে স্থানীয় লোকদের মনোমালিন্য দেখা দিলে তারা বাসন্ডা ও ধানহাটা খালের উভয় তীরে কাটাবাখারী জঙ্গল কেটে আবাদ করে বসতি স্থাপন করে। ঝালকাঠী বন্দরে পূর্বে অধিকাংশ নাগরিকই ছিল কৈবর্তদাস বা জেলে সম্প্রদায়ের লোক। বর্তমান ঝালকাঠীর পশ্চিম তীরে জেলেরা জঙ্গল সাফ করে বাসস্থান তৈরী করতঃ জেলে+কাঠি=জাল+কাঠি অপভ্রংশে ঝালকাঠি নামকরণ করা হয়েছে। এই জেলে ও জঙ্গলের কাঠি থেকেই উৎপত্তি হয় ঝালকাঠির নাম।\n" +
                "\n" +
                " \n" +
                "\n" +
                "তেমনি চাঁদকাঠি,কৃঞ্চকাঠি,চরকাঠি, বিনয়কাঠি ইত্যাদি। যা বিস্তৃত রয়েছে স্বরুপকাঠী পর্যন্ত। বিশ্বরুপ সেনের একখানি তাম্রলিপিতে ঝালকাঠি ও নৈকাঠির নামোল্লেখ আছে।এ থেকেও ঝালকাঠি নামটি যে জেলেদের কাছ থেকে পাওয়া তার সমর্থন মিলে। ঝালকাঠি জেলার প্রাচীন নাম ছিল মহারাজগঞ্জ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Patuakhali");
        hashMap.put("policeCall","01713374318");
        hashMap.put("policeStationName","Patuakhali Police Station");
        hashMap.put("history","পটুয়াখালী জেলা, প্রাচীন রাজত্ব চন্দ্রদ্বীপ এর অন্তর্ভুক্ত ছিল এবং বাউফল উপজেলার কচুয়া এই রাজত্বের রাজধানী ছিল। প্রাকৃতিক বিপর্যয় এবং ঘন ঘন পর্তুগীজ ও মগদের আক্রমনের কারণে এই রাজধানী পরবর্তীতে বরিশালের মাধবপাশায় স্থানান্তর করা হয়। রাজা টোডরমল, সম্রাট আকবরের মন্ত্রী; ১৫৯৯ সালে কানুনগা জিম্মক খানকে এই এলাকা জরিপ করতে পাঠান। তখন চন্দ্রদ্বীপ এর বন এলাকা চন্দ্রদ্বীপ থেকে পৃথক করে বাজুহাদবা সুরক্ষিত অঞ্চল হিসেবে চিহ্নিত করা হয়েছিল। পরবর্তীতে সেলিমাবাদ, বাজুগ উমেদপুর এবং উরানপুরে তিনটি পরগনাসহ এই অঞ্চল গঠন করা হয়।\n" +
                "\n" +
                "\n" +
                "\n" +
                "আরাকান এর বৌদ্ধ রাখাইনরা অষ্টাদশ শতাব্দীর শেষে বর্মী রাজার নৃশংসতায় পলায়ন করে গলাচিপা উপজেলা, কলাপাড়া উপজেলার কুয়াকাটা ও খেপুপাড়া এবং রাঙ্গাবালী উপজেলার বিভিন্ন দ্বীপে বসবাস শুরু করে। তারপর থেকে এই অঞ্চলে মানুষের বসতি বৃদ্ধি পেতে থাকে।\n" +
                "\n" +
                "\n" +
                "\n" +
                "১৯৭১ সালের ২৬ এপ্রিল পটুয়াখালী শহরে পাক হানাদার বাহিনী প্রথম আক্রমণ করে। ওই দিন শহরের মাতবর বাড়ি, পুরান বাজার ও ডিসি বাসভবন সংলগ্ন এলাকাসহ শহরের বিভিন্ন স্থানে হামলা চালিয়ে শতাধিক মানুষকে নির্মমভাবে হত্যা করা হয়। স্বাধীনতা যুদ্ধে পটুয়াখালী জেলার সদর, গলাচিপা, কলাপাড়া সহ অন্যান্য উপজেলায় অনেকগুলো খন্ড যুদ্ধ হয়। এইসব যুদ্ধে পটুয়াখালী জেলার স্বাধীনতাকামী অনেক সূর্য সন্তান শহীদ হন। রক্তক্ষয়ী সংগ্রাম শেষে, ১৯৭১ সালের ৮ ডিসেম্বর পটুয়াখালী জেলা হানাদার মুক্ত হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Pirojpur");
        hashMap.put("policeCall","01713374337");
        hashMap.put("policeStationName","Pirojpur Police Station");
        hashMap.put("history","‘‘ফিরোজ শাহের আমল থেকে ভাটির দেশের ফিরোজপুর,\n" +
                "\n" +
                "বেনিয়া চক্রের ছোঁয়াচ লেগে পাল্টে হলো পিরোজপুর।’’\n" +
                "\n" +
                "সুন্দরবনের কোলঘেঁষা কালীগঙ্গা, বলেশ্বর, দামোদর, সন্ধ্যা বিধৌত প্রাকৃতিক সবুজের লীলাভূমি পিরোজপুর জেলা। বৈচিত্র্যে ভরপুর পিরোজপুর জেলার উত্তরে গোপালগঞ্জ, উত্তর-পূর্বে বরিশাল ও ঝালকাঠী, দক্ষিণ-পশ্চিমে বাগেরহাট এবং দক্ষিণ-পূর্বে বরগুনা জেলা অবস্থিত। জেলার একদিকে লবণপানি অন্য দিকে মিঠা পানির অবস্থান। ঊনবিংশ শতাব্দীর প্রথম দিক থেকে বাকেরগঞ্জ জেলার বিভিন্ন নদী গর্ভে, মোহনায় ছোট ছোট দ্বীপাঞ্চল সৃষ্টি এবং এর দ্রুত বৃদ্ধি হতে থাকে। দক্ষিণাঞ্চলের সুন্দরবনের জঙ্গল কাটা হলে আবাদযোগ্য ভূমির আয়তনও ক্রমশ বৃদ্ধি পেতে থাকে। এ সময় ভূমি সংক্রান্ত বিরোধ, দক্ষিণাঞ্চলের কৃষক বিদ্রোহ, পিরোজপুরের কালীগঙ্গা, কচাঁ, বলেশ্বর প্রভৃতি নদীতে মগ জলদস্যুদের উপদ্রব, বিশেষত: ঐ সকল নদীতে চুরি, ডাকাতি, লুন্ঠনসহ বিভিন্ন ফৌজদারি অপরাধ বৃদ্ধি পেতে থাকে। ফলে সাধারণ প্রশাসন এবং ভূমি প্রশাসনের সুবিধাজনক অধ্যায় সৃষ্টির উদ্দেশ্যে এবং ফৌজদারি ও দেওয়ানি বিরোধের বিচারকার্য তড়িৎ সম্পাদনের লক্ষ্যে পিরোজপুর মহকুমা স্থাপনের প্রয়োজনীয়তা অনুভূত হয়। বাকেরগঞ্জ তদানীন্তন জেলা ম্যাজিস্ট্রেট এইচ.এ.আর. আলেকজান্ডার ১৮৫৬ সালের ২৪ এপ্রিল পিরোজপুরে মহকুমা স্থাপনের প্রস্তাব দেন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Barishal");
        hashMap.put("policeCall","01713374260");
        hashMap.put("policeStationName","Barishal Police Station");
        hashMap.put("history","‘ধান- নদী -খাল এই তিনে বরিশাল' খ্যাত বরিশাল বিভাগের ঐতিহাসিক গুরুত্ব অপরিসীম। দক্ষিণ-পূর্ব বাংলায় মুসলিম আধিপত্য বিস্তার কালে রাজা দনুজমর্দন কর্তৃক ‘চন্দ্রদ্বীপ' নামে এ স্বাধীন রাজ্যটি প্রতিষ্ঠিত হয়। চতুর্দশ শতাব্দী পর্যন্ত এ অঞ্চল চন্দ্রদ্বীপ নামে প্রসিদ্ধি লাভ করে। এ রাজ্য প্রতিষ্ঠার পূর্বে এ অঞ্চল ‘বাকলা' নামে পরিচিত ছিল। ‘বাকলা' অর্থ শস্য ব্যবসায়ী যা আরবী শব্দ থেকে আগত। জনৈক ড. কানুনগো নামীয় এক ব্যক্তি বাকলা বন্দর নির্মাণ করেন। এ সামুদ্রিক বন্দরে আরব ও পারস্যের বণিকরা বাণিজ্য করতে আসতেন। অতি প্রাচীন বৈদেশিক মানচিত্রে বাকলা-চন্দ্রদ্বীপ নাম বড় অক্ষরে অঙ্কিত দেখা যায়। ১৭৯৬ খ্রিস্টাব্দ পর্যন্ত এ জেলা বাকলা-চন্দ্রদ্বীপ নামে পরিচিত ছিল। ১৭৯৭ খ্রিস্টাব্দে ঢাকা জেলার দক্ষিণাঞ্চল নিয়ে বাকেরগঞ্জ জেলা প্রতিষ্ঠিত হয়। ১৮০১ সালে জেলার সদর দপ্তর বাকেরগঞ্জ জেলাকে বরিশালে (গিরদে বন্দর) স্থানান্তরিত করা হয়। ১৮১২ সালে এ জেলায় ১৫টি থানা ছিল।\n" +
                "\n" +
                "বরিশালের নামকরণ সম্পর্কে অনেক মতভেদ আছে। বড় বড় শালগাছের কারণে (বড়+শাল)= বরিশাল; পর্তুগীজ বেরী ও শেলীর প্রেম কাহিনীর জন্য বরিশাল; বড় বড় লবণের গোলার জন্য বরিশাল ইত্যাদি। গিরদে বন্দরে (গ্রেট বন্দর) ঢাকার নবাবদের বড় বড় লবণের চৌকি ছিল। এ জেলার লবণের বড় বড় চৌকি ও লবণের বড় বড় দানার জন্য ইংরেজ ও পর্তুগীজ বণিকরা এ অঞ্চলকে ‘বরিসল্ট' বলত। এ বরিসল্ট পরিবর্তিত হয়ে বরিশাল হয়েছে বলে অনেকের ধারণা। বরিশালের ঐতিহাসিক গুরুত্ব অনুধাবন করে তদানীন্তন বৃটিশ সরকার ১৯১৩-১৪ খ্রিস্টাব্দে বেঙ্গল ডিস্ট্রিক্ট অ্যাডমিনিস্ট্রেশন রিপোর্টে ফরিদপুর ও খুলনা জেলাসহ বরিশাল বিভাগ প্রতিষ্ঠার সুপারিশ করেন। পরবর্তীতে বিভিন্ন রাজনৈতিক কারণে বাস্তবায়ন সম্ভব হয়নি। অবশেষে ফরিদপুর ও খুলনা জেলা বাদ দিয়ে ১৯৯৩ সালের ১ জানুয়ারি প্রাচীন চন্দ্রদ্বীপ রাজ্য, বৃহত্তর বাকেরগঞ্জ জেলা নিয়ে বরিশাল বিভাগ প্রতিষ্ঠিত হয়।\n" +
                "\n" +
                "সর্বশেষ আদমশুমারি (২০০১) অনুযায়ী বরিশাল বিভাগের বর্তমান জনসংখ্যা ৮১,১২,৪৩৫ জন এবং প্রতি কিলোমিটারে জনসংখ্যার ঘনত্ব ৬৩২। এ অঞ্চল ১৮০০ সাল পর্যন্ত হিন্দু অধ্যুষিত ছিল। পরবর্তীতে বিভিন্ন এলাকা থেকে মুসলমানদের আগমন, ধর্মান্তরিত কিছু মুসলমান এবং হিন্দুদের ব্যাপকহারে দেশ ত্যাগের ফলে মুসলমানদের সংখ্যাধিক্য ঘটে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Bhola");
        hashMap.put("policeCall","01713374300");
        hashMap.put("policeStationName","Bhola Police Station");
        hashMap.put("history","ভোলা জেলার পটভূমি\n" +
                "ভোলা বাংলাদেশের বৃহত্তম প্রাচীন গাঙ্গেয় ব-দ্বীপ। ভোলা, জেলা হিসেবে  স্বীকৃতি পায়  ১৯৮৪ সালে।পূর্বে এটি নোয়াখালী জেলার অধিনে sub division ছিল। নোয়াখালী জেলার অধিনে sub division হিসেবে স্বীকৃতি পেয়েছিল ১৮৪৫ সালে। তখন এর প্রশাসনিক কেন্দ্র ছিল বর্তমান দৌলতখানে। ১৮৬৯ সালে sub division হিসেবে বরিশাল জেলার অধিনে যুক্ত হয় । পরবর্তীতে ১৮৭৬ সালে প্রশাসনিক কেন্দ্র দৌলতখান থেকে ভোলায় স্থানান্তর হয়। বর্তমান ভোলা জেলাতে ৭ টি উপজেলা, ৭০ টি ইউনিয়ন রয়েছে। ভোলার নামকরণের পেছনে স্থানীয়ভাবে একটি কাহিনী প্রচলিত আছে । ভোলা শহরের মধ্য দিয়ে বয়ে যাওয়া বেতুয়া নামক খালটি এখনকার মত অপ্রশস্ত ছিলনা । একসময় এটা পরিচিত ছিল বেতুয়া নদী নামে। খেয়া নৌকার সাহায্যে নদীতে পারাপার চলত। থুব বুড়ো এক মাঝি খেয়া নৌকার নৌকার সাহায্যে লোকজনকে পারাপারের কাজ করতো। তার নাম ছিল ভোলা গাজি পাটনি । আজকের যোগীর ঘোলের কাছেই তার আস্তানা ছিল । এই ভোলা গাজির নামানুসারেই একসময় নামকরণ হয় ভোলা ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Barguna");
        hashMap.put("policeCall","01713374353");
        hashMap.put("policeStationName","Barguna Police Station");
        hashMap.put("history","জেলার পটভূমি\n" +
                "পৃথিবী সৃষ্টির পেছনে যেমন ইতিহাস রয়েছে, এর ক্ষুদ্র ক্ষুদ্র এলাকা সৃষ্টির পেছনেও তেমনি ইতিহাস আছে। বরগুনা জেলা বাংলাদেশের দক্ষিণাংশে সমুদ্রের কোল ঘেষে সুগন্ধা, পায়রা ও হরিণঘাটা নদীর মোহনায় জেগে ওঠা ভূখন্ড। এ জেলার সমগ্র ভূখন্ড একদিন ছিল সুন্দরবন এলাকা। কালের বিবর্তনে মানুষ ক্রমে ক্রমে নানা প্রতিঘাতের মধ্য দিয়ে সুন্দরবন কেটে আবাদ শুরু করে জনপদ তৈরী করতে থাকে এবং তারই ফলশ্রুতিতে ১৯৩৯.৩৯ বর্গ কিলোমিটার এলাকা জুড়ে নয় লক্ষাধিক অধিবাসী অধ্যুষিত ছয়টি উপজেলার সমন্বয়ে আজকের বরগুনা জেলা।\n" +
                "\n" +
                "বরগুনা নামের ইতিহাসের সুনির্দিষ্ট কোন তথ্য না পাওয়া গেলেও জানা যায় যে, উত্তরাঞ্চলের কাঠ ব্যবসায়ীরা এতদ্ঞ্চলে কাঠ নিতে এসে খরস্রোতা খাকদোন নদী অতিক্রম করতে গিয়ে অনুকুল প্রবাহ বা বড় গোনের জন্য এখানে অপেক্ষা করত বলে এ স্থানের নাম বড় গোনা। কারো মতে আবার স্রোতের বিপরীতে গুন(দরি) টেনে নৌকা অতিক্রম করতে হতো বলে এ স্থানের নাম বরগুনা । কেউ কেউ বলেন , বরগুনা নামক কোন প্রতাপশালী রাখাইন অধিবাসীর নামানুসারে বরগুনা । আবার কারো মতে বরগুনা নামক কোন এক বাওয়ালীর নামানুসারে এ স্থানের নামকরণ করা হয় বরগুনা ।");
        arrayList.add(hashMap);

    }



}