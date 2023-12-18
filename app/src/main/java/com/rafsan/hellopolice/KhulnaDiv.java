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

public class KhulnaDiv extends AppCompatActivity {

    TextView textMarque,callNumber1,callNumber2,callNumber3;

    ImageView callButton1,callButton2,callButton3;

    GridView khulnaGridView;

    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna_div);

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

            String policeCall = hashMap1.get("policeCall");
            String history = hashMap1.get("history");
            String policeStationName = hashMap1.get("policeStationName");

            disCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (districtName.contains("Jashore")){

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(KhulnaDiv.this, PoliceInformationDetail.class));
                    }
                    else if (districtName.contains("Satkhira")) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(KhulnaDiv.this, PoliceInformationDetail.class));
                    }
                    else if (districtName.contains("Meherpur")) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(KhulnaDiv.this, PoliceInformationDetail.class));
                    }
                    else if ( districtName.contains("Narail") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(KhulnaDiv.this, PoliceInformationDetail.class));
                    }  else if ( districtName.contains("Chuadanga") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;

                        startActivity(new Intent(KhulnaDiv.this, PoliceInformationDetail.class));
                    }  else if ( districtName.contains("Kushtia") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(KhulnaDiv.this, PoliceInformationDetail.class));
                    }  else if ( districtName.contains("Magura") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(KhulnaDiv.this, PoliceInformationDetail.class));
                    }  else if ( districtName.contains("Khulna") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(KhulnaDiv.this, PoliceInformationDetail.class));
                    }
                    else if ( districtName.contains("Bagerhat") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(KhulnaDiv.this, PoliceInformationDetail.class));
                    } else if ( districtName.contains("Jhenaidah") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(KhulnaDiv.this, PoliceInformationDetail.class));
                    }
                }
            });

            return myView;
        }
    }

    private  void khulnaDisTable(){

        hashMap = new HashMap<>();
        hashMap.put("districtName","Jashore");
        hashMap.put("policeCall","Jashore");
        hashMap.put("policeStationName","Jashore Police Station");
        hashMap.put("history","বাংলাদেশ নামের ভূখন্ডটি প্রাচীনকালে কয়েকটি ক্ষুদ্র ক্ষুদ্র রাজ্যে বিভক্ত ছিল। ইতিহাসে এসব রাজ্য ভাংগা, পান্ডু, সমতট, তাম্রলিপ্ত, বঙ্গ ইত্যাদি নামে পরিচিত। উক্ত সময়ে যশোর সম্ভবত তাম্রলিপ্ত ও ভাংগা রাজ্যের অন্তর্ভুক্ত ছিল বলে ধারণা করা হয়। পরবর্তীকালে যশোর সহ সন্নিহিত অঞ্চলের রাজনৈতিক, সামাজিক, সাংস্কৃতিক, ভৌগোলিক ও বৈপ্লবিক ইতিহাস বহু উত্থান-পতন আর বিচিত্রতায় পূর্ণ।\n" +
                "\n" +
                "গঙ্গা নদীর পলল অবক্ষেপণে সৃষ্ট যশোর জেলার সবচেয়ে পুরাতন বিবরণ পাওয়া যায় টলেমির মানচিত্রে। মহাভারত, পুরান, বেদ ও আইন-ই-আকবরী গ্রন্থে এ অঞ্চলের উল্লেখ পাওয়া যায়। এ জেলার অতীত ইতিহাস পর্যালোচনা করলে দেখা যায় এক সময় এই অঞ্চল গভীর জঙ্গলে পরিপূর্ণ ছিল। অনার্য জাতিবলে পরিচিত এক শ্রেণীর আদিম মানুষ জংগল পরিস্কার করে সর্ব প্রথম এই অঞ্চলে বসতি স্থাপন করে।\n" +
                "\n" +
                "যশোর জেলার নামকরণ অনুসন্ধানে বিভিন্ন তথ্য পাওয়া যায়। যশোর নামের উৎপত্তি সম্পর্কে বহু কিংবদন্তি কাহিনী প্রচলিত রয়েছে।যেহেতু ঐতিহাসিকগণের মধ্যেও এ জেলার নামকরণ সম্পর্কে মতবিরোধ দেখা যায় সেহেতু এ বিষয়ে কোন একক সিদ্ধান্তে উপনীত হওয়া যায় না। প্রতিষ্ঠাকালের দিক থেকে যশোর বাংলাদেশের সবচেয়ে পুরাতন জেলা। দেশের দক্ষিণাঞ্চলের অন্যতম উল্লেখযোগ্য এ জেলাটির সৃষ্টি হয়েছিল আজ থেকে প্রায় দুইশত বৎসর পূর্বে ১৭৮৬ সালে। পাক-ভারত উপ-মহাদেশে বৃটিশের আগ্রাসী রাজত্ব শুরু হওয়ার ফলে যশোরসহ সমগ্র বঙ্গ ইংরেজ শাসনের অন্তর্ভুক্ত হয়। চিরকালের আপোসহীন সংগ্রামী যশোরকে নিয়ন্ত্রণে রাখতে অপারগ হলে ইংরেজ শাসকগণ তাদের শাসন কাজের সুবিধার জন্য যশোরকে একটি ভূখন্ডে নির্দিষ্ট করে তাকে স্বতন্ত্র জেলায় রূপান্তরিত করে। প্রথম প্রতিষ্ঠিত তৎকালীন যশোর জেলার সীমানা-খুলনা, কুষ্টিয়া, ফরিদপুর এবং আজকের চুরাশিপূর্ব অবিভক্ত যশোরসহ ভারতের পশ্চিম বঙ্গের বিশাল অঞ্চল জুড়ে বিস্তৃত ছিল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Satkhira");
        hashMap.put("policeCall","Satkhira");
        hashMap.put("policeStationName","Satkhira Police Station");
        hashMap.put("history","সাতক্ষীরা জেলার নামকরণ প্রসংগে কয়েকটি মত প্রচলিত। এর মধ্যে প্রধান মতটি হ’ল চিরস্থায়ী বন্দোবস্তের সময় নদীয়ার রাজা কৃষ্ণচন্দ্রের এক কর্মচারী বিষ্ণুরাম চক্রবর্তী নিলামে বুড়ন পরগণা কিনে তার অন্তর্গত সাতঘরিয়া গ্রামে বাড়ী তৈরী করেন। তাঁর পুত্র প্রাণনাথ সাতঘরিয়া অঞ্চলে উন্নয়ন কাজ করে পরিচিত ও প্রতাপান্বিত হন। সাতক্ষীরার মহকুমার প্রকৃত জন্ম হয় ১৮৫২ সালে যশোর জেলার চতুর্থ মহকুমা হিসেবে এবং কলারোয়াতে এর সদর দপ্তর স্থাপিত হয়। প্রথম মহকুমা হিসেবে দায়িত্ব গ্রহণ করেন নবাব আব্দুল লতিফ। ১৮৬১ সালে মহকুমা কার্যালয় সাতঘরিয়া তথা সাতক্ষীরাতে স্থানান্তর করা হয়। ইতিমধ্যেই সাতঘরিয়া ইংরেজ রাজকর্মচারীদের মুখেই সাতক্ষীরা হয়ে গিয়েছিলো। তাই পুরানো সাতঘরিয়াই বর্তমানের সাতক্ষীরা।\n" +
                "\n" +
                "সাতক্ষীরার ইতিহাস :\n" +
                "\n" +
                "বাংলাদেশের মানচিত্রে দক্ষিণ-পশ্চিম কোণে সাতক্ষীরা জেলার অবস্থান। এ জনবসতি প্রাচীনকালে খ্যাত ছিল বুড়ন দ্বীপ নামে। এর পাশে চন্দ্রদ্বীপ, মধুদ্বীপ, সূর্যদ্বীপ, সঙ্গদ্বীপ, জয়দ্বীপ ইত্যাদি দ্বীপ খ্যাত ছোট ছোট ভূখণ্ডের অবস্থান পাওয়া যায় প্রাচীন ইতিহাস ও মানচিত্রে।\n" +
                "\n" +
                "ঠিক কোন সময় থেকে বুড়ন দ্বীপে সমাজবদ্ধভাবে মানুষের বসবাস শুরু হয় তার বিস্তারিত ও সঠিক তথ্য প্রমাণাদি পাওয়া যায় না। রামায়ণ মহাভারতের তথ্যানুযায়ী এ অঞ্চলের সংঘবদ্ধ মনুষ্য বাসতির গোড়াপত্তন প্রায় সাড়ে তিন হাজার বছর পূর্ব থেকে। মহাভারতের তথ্যানুযায়ী মুনি কপিল পাইকগাছার কপিলমনিতে একটি কালিমন্দির প্রতিষ্ঠা করেন এবং সেখানে পূজা দেন। এই মন্দির প্রতিষ্ঠা এবং পূজা দেওয়ার কাজটা তিনি করেছিলেন মহাভারতের যুগে।\n" +
                "\n" +
                "আলেকজান্ডার ভারত আক্রমণ করেছিলেন খ্রিস্টপূর্ব ৩২৭ সনে। তাঁর ভারত আক্রমণের সময় গঙ্গার মোহনায় গঙ্গারিডি নামের একটা স্বাধীন রাষ্ট্রের উল্লেখ পাওয়া যায়। বর্তমান সাতক্ষীরা জেলাটি ছিল এ রাষ্ট্রের অধীন। আলেকজান্ডারের পর মৌর্য ও গুপ্ত যুগে বুড়নদ্বীপ ছিল পুণ্ড্রভুক্তির অন্তর্গত। বুড়নদ্বীপ এ সমেয় পরিচিত ছিল খাড়িমণ্ডল নামে। চন্দ্র বর্মণ খাড়ি অঞ্চল দখল করেনেন চতুর্থ শতকে। এর পর বৌণ্যগুপ্ত (৫০৭-৫২৫) দক্ষিণ-পূর্ব বাংলার স্বাধীন নরপতি হিসেবে রাজ্য শাসন করেন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Meherpur");
        hashMap.put("policeCall","Meherpur");
        hashMap.put("policeStationName","Meherpur Police Station");
        hashMap.put("history","ইতিহাসের স্বর্ণপাতা থেকে অনেক অনেক পূর্বেই হারিয়ে গেছে মেহেরপুর-এর নামকরণ সম্পর্কে যথার্থ তথ্যসমূহ। অনুমান, অনুধাবন অথবা বিশ্লেষণ এই নিয়েই এ বিষয়ে আত্নতৃপ্তি ছাড়া গত্যন্তর নেই । দীর্ঘকাল ধরে এ বিষয়ে ব্যাপক লেখালেখি হয়েছে তবুও বিষয়টি তমাশাচ্ছন্ন রয়ে গেছে।\n" +
                "\n" +
                " \n" +
                "\n" +
                "মেহেরপুর নামকরণ সম্পর্কে এ পর্যন্ত দুটি অনুমানসিদ্ধ তথ্য জানা যায়ঃ-\n" +
                "\n" +
                " \n" +
                "\n" +
                "একটি হচ্ছে ইসলাম প্রচারক দরবেশ মেহের আলী নামীয় জনৈক ব্যক্তির নামের সাথে সামঞ্জস্য রেখে ষোড়শ শতকের অথরা তার কিছুকাল পরে মেহেরপুর নামকরণের সৃষ্টি হয়েছে। এ অঞ্চলে মুসলিম শাসনের সূত্রপাত হতেই ইসলাম ধর্ম প্রচার শুরু হয়েছিল। বৃহত্তর কুষ্টিয়া, যশোর, খুলনা, বারোবাজার, চুয়াডাঙ্গা ও মেহেরপুর সহ প্রভৃতি অঞ্চলে ব্যাপকভাবে ইসলাম প্রচার শুরু করেন হযরত খাঁন জাহান আলী (রাঃ)। পীর খান জাহান আলী গৌড় থেকে ভৈরব নদী পথে মেহেরপুর হয়ে বারোবাজার গিয়ে বাগেরহাট গিয়েছিলেন। তার সাথে সেই সময়ে ৩৬০ জন দরবেশ ও ৬০ হাজার সৈন্য ছিল বলে কথিত আছে। তিনি সমগ্র দক্ষিণাঞ্চরে ইসলামের বিজয় পতাকা উত্তোলন করে জনবসতি ও শাসন ব্যবস্থা প্রতিষ্ঠিত করেন। এ অঞ্চলে ঐ একই সময়েই বেশ কয়েকজন ইসলামের ঝান্ডাবাহক আল্লাহর পরম আশীর্বাদপুষ্ট ব্যক্তিত্বের আগমন ঘটে। শাহ ভালাই, শাহ আলাই ও এনায়েত উল্লাহর নাম উল্লেখযোগ্য। পুণ্য আত্না ইসলামের ঝান্ডাবাহক দরবেশ মেহের আলী শাহ-এর নামের সাথে সঙ্গতি রেখে মেহেরপুর নামকরণ প্রতিষ্ঠিত হয়েছে।যতদূর জানা যায় তাতে মেহের আলী অত্যন্ত প্রভাবশালী খ্যাতিমান আধ্যাত্নিক ব্যক্তি হিসাবে সুপরিচিত ছিলেন। যার ফলে তাঁর নামের প্রাধান্য পেয়ে যায়।\n" +
                "\n" +
                " \n" +
                "\n" +
                "মেহেরপুর নামকরণের উৎপত্তি সম্পর্কে দ্বিতীয় দিকটি এখানে উল্লেখ্য, পূর্ববঙ্গ রেলওয়ের বাংলায় ভ্রমণ গ্রন্থে বিখ্যাত বচনকার মিহির ও তাঁর নিজের পুত্রবধু খনা (খনার বচন বিখ্যাত) ভৈরব নদীর তীরস্থ এ অঞ্চলে বাস করতেন। তার নামানুসারে প্রথমে মিহিরপুর এবং পরবর্তীতে অপভ্রংশে মেহেরপুর নামকরণ হয়েছে বলে অনুমান করা হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Narail");
        hashMap.put("policeCall","Narail");
        hashMap.put("policeStationName","Narail Police Station");
        hashMap.put("history","বিভিন্ন ঐতিহাসিক ও চিন্তাবিদদের  মধ্যে নড়াইলের নামকরণ নিয়ে বিভিন্ন মত প্রচলিত আছে। কিংবদন্তী আছে যে নড়িয়াল ফকিরের আর্শিবাদপুষ্ট নড়ি হতে নড়াইল নামের উৎপত্তি হয়েছে। নবাব আলিবর্দী খাঁ এর শাসনামলে তার এক কর্মচারী মদনগোপাল দত্ত নৌকা যোগে স্বপরিবারে  কিসমত কুড়িগ্রাম আসেন। এখানে তিনি কচুরীর ধাপের উপর ধ্যানরত অবসহায় একজন ফকিরকে দেখতে পান । তিনি নড়িয়াল ফকির। মদনগোপাল দত্ত নত হয়ে তার আর্শিবাদ কামনা করেন। ফকির প্রীত হয়ে তাকে তার হাতের নড়ি (লাঠি) উপহার দেন এবং ঐ এলাকা আবাদ করার নির্দেশ দেন (লাঠিকে সহানীয় ভাষায় নড়ি বলে অভিহিত করা হয়)। ফকিরের আর্শবাদ পুষ্ট হয়ে তিনি কুড়িগ্রামে বসতি সহাপন করেন এবং ধীরে ধীরে ঐ এলাকা ঘনবসতিপূর্ণ হয়। নড়িয়াল ফকিরের আর্শীবাদপুষ্ট তাই নাম হয় নড়িয়াল। পরবর্তীতে লোকমুখে বিকৃত হতে হতে নড়িয়াল থেকে নড়াইল  নামের  উৎপত্তি  হয়েছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Chuadanga");
        hashMap.put("policeCall","Chuadanga");
        hashMap.put("policeStationName","Chuadanga Police Station");
        hashMap.put("history","চুয়াডাঙ্গা জেলার প্রাচীন ইতিহাস প্রায় অজ্ঞাত। গ্রীক ঐতিহাসিকদের বিবরণ ও টলেমির মানচিত্র থেকে অনুমান করা হয় বর্তমান চুয়াডাঙ্গা জেলা সর্বপশ্চিমে ধারার (এবং তা ভগীরতী ও হতে পারে) অব্যবহিত পূর্বদিকেই ছিল। যশোর ও গোপালগঞ্জ জেলায় আনুমানিক চতুর্থ শতাব্দীর যে প্রত্নতাত্ত্বিক নিদর্শন পাওয়া গেছে, তাতে প্রমানিত হয় যে, গঙ্গা - পদ্মার দক্ষিণ তীরের ভূখন্ড বেশ প্রাচীন। সুতরাং এ ধারণাও যুক্তিসঙ্গত যে, বর্তমান চুয়াডাঙ্গা জেলা সেই প্রাচীন ভূখন্ডের অংশ বিশেষ। প্রাপ্ত তাম্রলিপি থেকে জানা যায় যে, কুমিল্লা থেকে সুদূর উড়িষা  পর্যন্ত এ রাজ্যের বিস্তৃতি ছিল। চুয়াডাঙ্গা যে সে রাজ্যের অর্ন্তভুক্ত ছিল তাতে সন্দেহ নেই। তখন এ অঞ্চল সমতট বা বঙ্গ নামে পরিচিত ছিল। ধারনা করা হয় চুয়াডাঙ্গা এক সময় শশাঙ্কের রাজ্যভুক্ত ছিল। বল্লাল সেনের (১১৬০ - ১১৭৮ খ্রি:) আমলে চুয়াডাঙ্গা সেন রাজ্যভুক্ত ছিল। ১২৮১ খ্রিস্টাব্দে দিল্লীর সুলতান গিয়াস উদ্দিন বলবান বাঙলার শাসনকর্তা মুঘীসউদ্দিন তোঘরীকে পরাজিত ও নিহত করে বর্তমান চুয়াডাঙ্গাসহ সমগ্র বাংলাদেশকে তাঁর সাম্রাজ্যভুক্ত করেন। ১৪১৪ সাল পর্যন্ত চুয়াডাঙ্গা জেলা সুলতানী শাসনের অর্ন্তভুক্ত ছিল। পরবর্তীতে শাহ শাসনামল ও হাবশী সুলতানদের শাসনামলে চুয়াডাঙ্গা তাঁদের অধীনে ছিল। ১৫৭৬ সালে দাউদ কররানী মোগল বাহিনীর কাছে পরাজিত ও নিহত হলে বাংলা মোগল শাসনে আসে। ১৬৯৫ সালে মেদেনীপুরের জমিদার শোভা সিংহ এবং জনৈক আফগান সর্দার রহিম খান দক্ষিণ - পশ্চিম বাংলায় মোগল রাজশক্তির বিরুদ্ধে অস্ত্র ধারন করে। তারা চুয়াডাঙ্গা সহ দক্ষিণ - পশ্চিম বাংলা থেকে মোগল সেনাবাহিনী তাড়াতে সক্ষম হল।\n" +
                "\n" +
                "সম্ভবত বন জঙ্গল আকীর্ন চুয়াডাঙ্গা অঞ্চলে বিদ্রোহীদের গোপন আস্তানাও ছিল। ১৭৫৭ সালের ২৩ জুন পলাশীর প্রান্তরে নবাব সিরাজ - উদ - দৌলা কে পরাজিত করে ব্রিটিশ ইস্ট ইন্ডিয়া কোম্পানী বাংলার সর্বময় ক্ষমতার অধিকারী হয়। তৎকালীন নদীয়ারাজ কৃষ্ণ চন্দ্র রায় পলাশীর যুদ্ধে ইংরেজ পক্ষকে সমর্থন করেছিলেন। ১৭৬৫ সালে মোগল সম্রাট দ্বিতীয় শাহ আলমের কাছ থেকে বার্ষিক ২৬ লক্ষ টাকা রাজস্বের বিনিময়ে কোম্পানী বঙ্গদেশের দেওয়ানী শাসন ক্ষমতা লাভ করেন। ১৭৬৯ সালে জ্যাকভ রেইভার নদীয়ার প্রথম সুপারভাইজার হন। ১৭৮৭ সালের ২১ মার্চ নদীয়া জেলা গঠিত হয়। ইষ্ট - ইন্ডিয়া কোম্পানীর আমলে চুয়াডাঙ্গাসহ কুষ্টিয়া অঞ্চল রাজশাহী জেলাভুক্ত ছিল। পরে আইন শৃঙ্খলা রক্ষার্থে ১৮২৮ সালে পাবনা জেলা গঠিত হলে এ অঞ্চল পাবনা জেলাভুক্ত হয়। ১৮৫৮ সালে রানী ভিক্টোরিয়া ব্রিটিশ ভারতের শাসনাভার নিলে কোম্পানী শাসনের অবসান হয়। ১৮৬০ সালে সুদূর মফঃস্বলে যাতে অত্যাচারী নীলকর বা জমিদার প্রজাদের উৎপীড়ন করতে না পারে সে কারনে নদীয়াকে পাঁচটি মহকুমায় বিভক্ত করা হয়। ১৯৭১ সালের স্বাধীনতা যুদ্ধের প্রাক্কালেই মেহেরপুর মহকুমা, কুষ্টিয়া মহকুমা ও চুয়াডাঙ্গা মহকুমা নিয়ে কুষ্টিয়া জেলার মর্যাদা লাভ করে। পরবর্তীতে ১৯৮৪ সালের ১৬ ফেব্রুয়ারী চুয়াডাঙ্গা জেলায় উন্নীত হয়। চুয়াডাঙ্গা সদর, আলমডাঙ্গা, দামুড়হুদা ও জীবননগর এই চারটি উপজেলা নিয়ে চুয়াডাঙ্গা জেলা গঠিত।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Kushtia");
        hashMap.put("policeCall","Kushtia");
        hashMap.put("policeStationName","Kushtia Police Station");
        hashMap.put("history","১৭২৫ সালে কুষ্টিয়া নাটোর জমিদারীর অধীনে ছিল এবং এর পরিচিতি আসে কান্ডানগর পরগণার রাজশাহী ফৌজদারীর সিভিল প্রশাসনের অন্তর্ভূক্তিতে। পরে বৃটিশ ইস্ট ইন্ডিয়া কোম্পানী ১৭৭৬ সালে কুষ্টিয়াকে যশোর জেলার অন্তর্ভূক্ত করে। কিন্তু ১৮২৮ সালে এটি পাবনা জেলার অন্তর্ভূক্ত হয়। ১৮৬১ সালে নীল বিদ্রোহের কারণে কুষ্টিয়া মহকুমা প্রতিষ্ঠা করা হয় এবং ১৮৭১ সালে কুমারখালী ও খোকসা থানা নিয়ে কুষ্টিয়া মহকুমা নদীয়ার অর্ন্তগত হয়। ভারত উপমহাদেশ বিভক্তির পূর্বে কুষ্টিয়া নদীয়া জেলার আওতায় একটি মহকুমা ছিল। ১৯৪৭ সালে কুষ্টিয়া জেলার অভ্যুদয় ঘটে। তখন কুষ্টিয়া জেলা ৩ টি মহকুমা নিয়ে গঠিত ছিল। এগুলো কুষ্টিয়া , চুয়াডাঙ্গা এবং মেহেরপুর। এরপর ১৯৮৪ সালে চুয়াডাঙ্গা ও মেহেরপুর আলাদা জেলা হিসেবে পৃথক হয়ে গেলে কুষ্টিয়া মহকুমার ৬ টি থানা নিয়ে বর্তমান কুষ্টিয়া জেলা গঠিত হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Magura");
        hashMap.put("policeCall","Magura");
        hashMap.put("policeStationName","Magura Police Station");
        hashMap.put("history","নামকরণের ইতিহাস  \n" +
                "\n" +
                "মাগুরার নামকরণ নিয়ে ঐতিহাসিকদের মধ্যে বিভিন্ন মতভেদ লক্ষ্য করা যায়।‘‘ খুলনা  শহরের আদিপর্ব’’ গ্রন্থের লেখক  ঐতিহাসিক আবুল কালাম সামসুদ্দিনের মতে, মরা গাঙ থেকে মাগুরা নামের উৎপত্তি। মরা গাঙ  আঞ্চলিক ভাষায় মরগা বলে  প্রচলিত।  অনেকের মতে ধর্মদাস নামক জনৈক মগ জলদস্যু মাগুরার পার্শ্ববর্তী মধুমতি নদী সংলগ্ন এলাকায়  বসতি স্থাপন করে।  মগদের অত্যাচারে এলাকার লোকজন  অতিষ্ট হয়ে পড়ে এবং তারা বিতাড়িত হয়।  সেই মগ ও মরগা থেকে ‘মাগুরা’ নামের উৎপত্তি। তবে এখনও জনশ্রম্নতি প্রচলিত যে,   মাগুরার খাল বিলে এক কালে প্রচুর মাগুর মাছ পাওয়া যেত। আর সেই মাগুর মাছের  প্রসিদ্ধি থেকে ‘‘মাগুরা’’ নামকরণ হয়েছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Khulna");
        hashMap.put("policeCall","Khulna");
        hashMap.put("policeStationName","Khulna Police Station");
        hashMap.put("history","বৃটিশ ভারত তথা অবিভক্ত বাংলার প্রথম মহকুমা খুলনা -১৯৮৩ সালের প্রশাসনিক পুনর্বিন্যাস - পূর্বকালে আয়তনের হিসেবে ছিল বাংলাদেশের তৃতীয় বৃহত্তম জেলা।লোকসংখ্যায় দশম।এসময় ‘খুলনা জেলা’ বলতে বুঝাতো খুলনা সদর ,বাগেরহাট ও সাতক্ষীরা মহকুমা-র সম্মিলিত ভূভাগকে (অতঃপর প্রায়শ ‘বৃহত্তর খুলনা’ হিশেবে উল্লিখিত), যার মোট আয়তন ছিল ৪,৬৯৭ বর্গমাইল (নদী এলাকাসহ)। তবে প্রশাসনিক পুর্বিন্যাসের কারনে খুলনার পরিমাণফল দাঁড়ায় ৪,৩৯৪ বর্গকিলোমিটার; এবারে হয় দেশের চতুর্থ বৃহত্তম জেলা।\n" +
                "\n" +
                "জেলা গঠনকালের অব্যবহিত পূর্বের বা আরও নির্দিষ্ট করে বললে ১৮৮১ সালের ‘বঙ্গীয় জনগণনা’(Census of Bengal, 1881) অনুযায়ী বৃটিশ শাসনাধীন ‘বঙ্গপ্রদেশ’ বলতে বুঝাতো বাংলা, বিহার, ওড়িশা ও  ছোটনাগপুর এবং কোচবিহার -পার্বত্য ত্রিপুরা প্রভৃতি ৩টি সামন্তরাজ্য মিলিয়ে ১,৫০,৫৮৮ বর্গমাইলব্যাপী (সুন্দরবন ও বড়ো বড়ো নদী এলাকা ব্যতীত) বিস্তৃত ভূভাগকে। এর মধ্যে বর্তমান বাংলাদেশের যেসব জেলা আজকের প্রচলিত নামেই বঙ্গপ্রদেশের অন্তর্ভুক্ত ছিল যথা ’প্রেসিডেন্সি’ বিভাগাধীন যশোর ও খুলনা ( কুষ্টিয়া তখন ছিল নদীয়া জেলাভুক্ত); রাজশাহী বিভাগাধীন দিনাজপুর, রাজশাহী, রংপুর, বগুড়া ও পাবনা; ঢাকা বিভাগাধীন ঢাকা, ফরিদপুর, বাকেরগঞ্জ ও ময়মনসিংহ এবং চট্টগ্রাম বিভাগাধীন চট্টগ্রাম, নোয়াখালী, ত্রিপুরা (কুমিল্লা) ও পার্বত্য চট্টগ্রাম - এই ১৫ টি জেলার মধ্যে আয়তনের দিক দিয়ে খুলনা ছিল দ্বাদশ স্থানীয়। অন্যদিকে দেশবিভাগ তথা ৪৭- পরবর্তীকালে বর্ণিত পনেরো জেলা ও কুষ্টিয়া মিলিয়ে মোট ১৬টি জেলার মধ্যে খুলনা ছিল আয়তনে তৃতীয় এবং লোকসংখ্যার হিসাবে একাদশ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Bagerhat");
        hashMap.put("policeCall","Bagerhat");
        hashMap.put("policeStationName","Bagerhat Police Station");
        hashMap.put("history","বাগেরহাটের নাম কে করে দিয়েছিলেন তা গবেষণা সাপেক্ষ হলেও আজ তা নিরূপন করা দুঃসাধ্য। কারো কারো  মতে বাগেরহাটের নিকটবর্তী সুন্দরবন থাকায় এলাকাটিতে বাঘের উপদ্রব ছিল, এ জন্যে  এ এলাকার নাম হয়ত ‘‘বাঘেরহাট’’ হয়েছিল এবং ক্রমান্বয়ে তা বাগেরহাট-এ রূপান্তরিত হয়েছে। মতান্তরে হযরত খানজাহান(রঃ) এর প্রতিষ্ঠিত ‘‘খলিফাত-ই-আবাদ’’ এর বিখ্যাত ‘‘বাগ’’ অর্থ বাগান, এ অঞ্চলে এতই সমৃদ্ধি লাভ করে যে, তা থেকেই হয়ে দাঁড়িয়েছে বাগের আবাদ তথা ‘‘ বাগেরহাট’’ । তবে সবচেয়ে গ্রহণযোগ্য মতটি হচ্ছে শহরের পাশ দিয়ে প্রবাহিত ভৈরব নদীর উত্তর দিকের হাড়িখালী থেকে বর্তমান নাগের বাজার পর্যমত্ম যে লম্বা বাঁক অবস্থিত, পূর্বে সে বাঁকের পুরাতন বাজার এলাকায় একটি হাট বসত। আর এ হাটের নামে এ স্থানটির নাম হলো বাঁকেরহাট। কালক্রমে বাঁকেরহাট পরিবর্তিত হয়ে দাঁড়িয়েছে বাগেরহাট নামে।\n" +
                "\n" +
                " \n" +
                "\n" +
                "বাংলাদেশের দক্ষিণ-পশ্চিমে বঙ্গোপসাগরের কূল ঘেষে বাগেরহাট জেলার অবস্থান। বাগেরহাট খুব পুরনো ভূখন্ড না হলেও বাগেরহাটের সমৃদ্ধির ইতিহাস উপমহাদেশের বহু প্রাচীন জনপদের সমকালীন ও সমপর্যায়ের। হযরত খানজাহান(রঃ) এর সময় এ অঞ্চলের দীঘি খননকালে বিশেষ করে ‘‘ খাঞ্জেলী দীঘি’’ খননকালে পাওয়া ধ্যানী বুদ্ধমূর্তি থেকে অনুমিত হয় হযরত খানজাহান(রঃ) এর আগমনের বহুপূর্ব হতেই বাগেরহাটে এক বিসত্মৃত জনপদ ছিল। বর্তমানে সেই বুদ্ধমূর্তি বাগেরহাটের শিববাড়ি থেকে স্থানামতরিত হয়ে ঢাকার কমলাপুর বৌদ্ধ বিহারে রক্ষিত আছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Jhenaidah");
        hashMap.put("policeCall","Jhenaidah");
        hashMap.put("policeStationName","Jhenaidah Police Station");
        hashMap.put("history","প্রাচীনকালে বর্তমান ঝিনাইদহের উত্তর পশ্চিম দিকে নবগঙ্গাঁ নদীর ধারে ঝিনুক কুড়ানো শ্রমিকের বসতি গড়ে ওঠে বলে জনশ্রুতি আছে। সে সময় ভারতের পশ্চিমবঙ্গেঁর কোলকাতা থেকে ব্যবসায়ীরা ঝিনুকের মুক্তা সংগ্রহের জন্যে এখানে ঝিনুক কিনতে আসতো। সে সময় ঝিনুক প্রাপ্তির এই স্থানটিকে ঝিনুকদহ বলা হতো। সে সময় ঝিনুক থেকে মুক্তা সংগ্রহের মাধ্যমে এবং ঝিনুক পুড়িয়ে চুন তৈরী করে তা বিক্রি করে মানুষ অর্থ উপার্জন করতো।\n" +
                "\n" +
                "অনেকের মতে ঝিনুককে আঞ্চলিক ভাষায় ঝিনেই, ঝিনাই এবং দহ অর্থ বড় জলাশয় ও ফার্সি ভাষায় দহ বলতে গ্রামকে বুঝানো হতো। সেই অর্থে ঝিনুকদহ বলতে ঝিনুকের জলাশয় অথবা ঝিনুকের গ্রাম বুঝাতো। আর এই ঝিনুক এবং দহ থেকেই ঝিনুকদহ বা ঝিনেইদহ, যা- রূপান্তরিত হয়ে আজকের ঝিনাইদহ নামকরন হয়েছে।\n" +
                "\n" +
                "অন্য কিংবদন্তি থেকে জানাযায়, এক ইংরেজ সাহেব এই এলাকা দিয়ে নৌকাযোগে নবগঙ্গাঁ নদী পর হচ্ছিলেন। অনেক লোকজন তখন নদী থেকে ঝিনুক সংগ্রহের কাজে ব্যস্ত ছিল। উপস্থিত লোকদের কাছে সাহেব তখন এলাকাটির নাম জানতে চান। লোকেরা তার কথা বুঝতে না পেরে ভেবে নেন যে নদী থেকে তারা কি জিনিস তুলছে তার নাম জানতে চাচ্ছেন। এই মনে করে লোকেরা সাহেবকে বলেন ঝিনুক বা ঝিনেই। এতে ইংরেজ সাহেব ধরে নেন জায়গাটির নাম ঝেনি। এই ঝেনি শব্দটি পরে ঝেনিদা হিসেবে ব্যবহৃত হতে থাকে। ঝিনাইদহকে আঞ্চলিক ভাষায় এখনও ঝিনেদা বলা হয়। ঝেনিদা, ঝিনেদা আর ঝিনাইদহ যাই বলা হোক না কেন ঝিনাইদহ নামের উৎপত্তি যে ঝিনুক থেকে তা এ অঞ্চলের মানুষের কাছে অধিকতর গ্রহণযোগ্য।\n" +
                "\n" +
                "ঐতিহ্যবাহী ঝিনাইদহ গ্রন্থে ঝিনাইদহ সম্পর্কে বলা হয়েছে ‘‘বারো আউলিয়ার আর্শীবাদপুষ্টঃ গাজী-কালূ-চম্পাবতীর উপখ্যানধন্য; কে.পি. বসু, গোলাম মোস্তফার স্মৃতি বিজড়িত; বীরশ্রেষ্ঠ হামিদুর রহমান, বিপ্লবী বীর বাঘাযতীনের শৌর্যময়; খেজুর গুড়, কলা-পানের প্রাচুর্যমন্ডিত; পাগলাকানাই, লালন শাহের জম্মস্থান, কপোতাক্ষ, বেগবতী, চিত্রা, নবগঙ্গাঁর ঝিনুকদহ এক কথায় নাম তার ঝিনাইদহ।’’");
        arrayList.add(hashMap);

    }
}