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

public class SylhetDiv extends AppCompatActivity {

    TextView textMarque,callNumber1,callNumber2,callNumber3;

    ImageView callButton1,callButton2,callButton3;

    GridView sylhetGridView;
    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet_div);

        //=========Marque Text=============
        textMarque = findViewById(R.id.textMarque);
        textMarque.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textMarque.setSelected(true);
        //====================================


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

        sylhetGridView = findViewById(R.id.sylhetGridView);

        sylhetDisTable();

        MySylhet mySylhet = new MySylhet();
        sylhetGridView.setAdapter(mySylhet);

    }

    private class MySylhet extends BaseAdapter{

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
                    if (districtName.contains("Sylhet")){

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(SylhetDiv.this, PoliceInformationDetail.class));
                    }
                    else if (districtName.contains("Moulvibazar")) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(SylhetDiv.this, PoliceInformationDetail.class));
                    }
                    else if (districtName.contains("Habiganj")) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(SylhetDiv.this, PoliceInformationDetail.class));
                    }
                    else if ( districtName.contains("Sunamganj") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(SylhetDiv.this, PoliceInformationDetail.class));

                    }
                }
            });

            return myView;
        }
    }

    private void sylhetDisTable(){
        hashMap = new HashMap<>();
        hashMap.put("districtName","Sylhet");
        hashMap.put("policeCall","01713374375");
        hashMap.put("policeStationName","Sylhet Police Station");
        hashMap.put("history","মহান সাধক হযরত শাহজালাল (র.) ও হযরত শাহপরাণ (র.)সহ ৩৬০ আউলিয়ার পুণ্যভূমি সিলেট একটি প্রাচীন জনপদ। চীনা পরিব্রাজক হিউয়েন সাঙ এর ৬৪০ খ্রিষ্টাব্দের ভ্রমণ বিবরণী থেকে এ জেলা সম্পর্কে তথ্য পাওয়া যায়। দশম শতাব্দীতে মহারাজা শ্রীচন্দ্র কর্তৃক উৎকীর্ণ পশ্চিমভাগ তাম্রলিপি থেকে জানা যায় যে, তিনি এ জেলা জয় করেছিলেন। ঐতিহাসিকদের ধারণা সিলেট বা শ্রীহট্ট বহু আগে থেকেই একটি উল্লেখযোগ্য বাণিজ্যকেন্দ্র হিসেবে পরিচিত ছিল। ১৪ শতকে ইয়েমেনের সাধক পুরুষ হযরত শাহজালাল (র.) সিলেট জয় করেন এবং ইসলাম প্রচার শুরু করেন। তাছাড়া মুঘলদের সাথে যুদ্ধ, নানকার বিদ্রোহ, ভাষা আন্দোলন সর্বোপরি মুক্তিযুদ্ধে এ জেলার অবদান অপরিসীম।\n" +
                "\n" +
                "বিখ্যাত মুসলিম পরিব্রাজক আল-বিরম্ননী তাঁর ‘কিতাবুল হিন্দ’ নামক গ্রন্থে সিলেটকে সিলাহট নামে উল্লেখ করেন। বহু প্রাচীনকাল থেকেই এ জেলা শ্রীহট্ট নামে পরিচিত ছিল, হিন্দু পৌরাণিক অনুসারে ‘শ্রী’ অর্থ ‘প্রাচুর্য বা ‘সৌন্দর্য’ এবং হট্ট অর্থ ‘হাত’। যেখানে শ্রী এর হট্ট পাওয়া গিয়েছিল তাই শ্রীহস্থ, যা কালের বিবর্তনে শ্রীহট্ট নাম ধারণ করেছে। আরো একটি শ্রুতি, পাথরকে শীলা বলা হয় এবং পাথরের প্রাচুর্য্যের কারণে এ এলাকাকে সিলেট বলা হয়। সিলেট শব্দের অনুসর্গ সিল মানে শীল এবং উপসর্গ হেট মানে হাট অর্থাৎ বাজার। প্রাচীনকাল হতে এ জেলা পাথর (শীল) ও হাটের (ব্যবসা ও বানিজ্যের) প্রাধান্য ছিল বলে ‘শীল’ ও ‘হাট’ শব্দদ্বয় মিলে সিলেট শব্দের উৎপত্তি হয়েছে বলে অনেকে মনে করেন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Moulvibazar");
        hashMap.put("policeCall","01713374439");
        hashMap.put("policeStationName","Moulvibazar Police Station");
        hashMap.put("history","বাংলাদেশের উত্তর-পূর্বাংশে অবস্থিত অপরূপ প্রাকৃতিক সৌন্দর্যের আধার মৌলভীবাজার জেলা। এ জেলার আয়তন ২৭৯৯ বর্গ কিলোমিটার। এর উত্তরে সিলেট জেলা, দক্ষিণে ভারতের ত্রিপুরা রাজ্য, পূর্বে ভারতের আসাম ও ত্রিপুরা রাজ্য এবং পশ্চিমে হবিগঞ্জ জেলা।" +
                "নামকরণ: কথিত আছে যে, সৈয়দ শাহ্  মোস্তফা (র:) এর ভাতুষ্পুত্র হযরত ইয়াছিন (র:)এর উত্তর পুরুষ মৌলভী সৈয়দ কুদরত উল্লাহ মনু নদীর তীরে ১৮১০খ্রিষ্টাব্দে যে বাজার প্রতিষ্ঠা করেছিলেন, সেই বাজারটি কালক্রমে প্রসিদ্ধিলাভ করে। ১৮৮২ খ্রিষ্টাব্দে ১ এপ্রিল মৌলভী সৈয়দ কুদরত উল্লাহ কর্তৃক প্রতিষ্ঠিত বাজারটিকে কেন্দ্র করে ২৬টি পরগনা নিয়ে দক্ষিণ শ্রীহট্ট মহকুমা প্রতিষ্ঠা করা হয়। ১৯৬০ খ্রিষ্টাব্দে দক্ষিণ শ্রীহট্ট বা সাউথ সিলেট নামের বদলে এ মহকুমার নাম মৌলভীবাজার রাখা হয়। ১৯৮৪ সালের ২২ ফেব্রুয়ারি মৌলভীবাজার মহকুমাটি জেলায় উন্নীত হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Habiganj");
        hashMap.put("policeCall","01320117698");
        hashMap.put("policeStationName","Habiganj Police Station");
        hashMap.put("history","সুফি সাধক হযরত শাহজালাল (রঃ) এর অনুসারী সৈয়দ নাছির উদ্দিন (রঃ) এর পূণ্যস্মৃতি বিজড়িত খোয়াই, করাঙ্গী সুতাং, বিজনা, রত্না প্রভৃতি নদী বিধৌত হবিগঞ্জ একটি ঐতিহাসিক জনপদের নাম । ঐতিহাসিক সুলতানসী হাবেলীর প্রতিষ্ঠাতা সৈয়দ সুলতানের অধঃস্তন পুরুষ সৈয়দ হেদায়েত উল্লাহর পুত্র সৈয়দ হবিব উল্লাহ খোয়াই নদীর তীরে একটি গঞ্জ বা বাজার প্রতিষ্ঠা করেন । তাঁর নামানুসারে হবিবগঞ্জ থেকে কালক্রমে তা হবিগঞ্জে পরিণত হয় । ইংরেজ শাসনামলে ১৮৬৭ সালে হবিগঞ্জকে মহকুমা ঘোষণা করা হয় এবং ১৮৭৮ সালে হবিগঞ্জ মহকুমা গঠনকরা হয় । আসাম প্রাদেশিক সরকারের ২৭৩ নং নোটিফিকেশনের মাধ্যমে ১৮৯৩সালের ০৭ এপ্রিল হবিগঞ্জ থানা গঠিত হয়। পরবর্তীতে ১৯৬০ সালে  সার্কেল  অফিসার  (উন্নয়ন)  এর  অফিস  স্থাপিত  হয়  এবং  সর্বশেষ  ১৯৮৪ সালের ০১ মার্চ ( ১৭ ফাল্গুন ১৩৯০ বাংলা) জেলায় উন্নীত হয় । ২৬৩৬.৫৮ বর্গ কিলোমিটার আয়তনের এ জেলার উত্তরে সুনামগঞ্জ জেলা, দক্ষিনে ভারতের ত্রিপুরা রাজ্য, পূর্বে মৌলভীবাজার ও সিলেট জেলা এবং পশ্চিমে ব্রাহ্মনবাড়িয়া ও কিশোরগঞ্জ জেলা। একটি পাতা দুটি কুঁড়ির চির সবুজ চা বাগান, দিগন্ত বিস্তৃত হাওড় এবং জীববৈচিত্রে ভরপুর ঘন বনাঞ্চল এই জনপদকে একটি আলাদা স্বত্বায় দাঁড় করিয়েছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Sunamganj");
        hashMap.put("policeCall","01713374418");
        hashMap.put("policeStationName","Sunamganj Police Station");
        hashMap.put("history","নামকরণ: ‘সুনামদি’ নামক জনৈক মোগল সিপাহীর নামানুসারে সুনামগঞ্জের নামকরণ করা হয়েছিল বলে জানা যায়। ‘সুনামদি’ (সুনাম উদ্দিনের আঞ্চলিক রূপ) নামক উক্ত মোগল সৈন্যের কোন এক যুদ্ধে বীরোচিত কৃতিত্বের জন্য সম্রাট কর্তৃক সুনামদিকে এখানে কিছু ভূমি পুরস্কার হিসাবে দান করা হয়। তাঁর দানস্বরূপ প্রাপ্ত ভূমিতে তাঁরই নামে সুনামগঞ্জ বাজারটি স্থাপিত হয়েছিল। এভাবে সুনামগঞ্জ নামের ও স্থানের উৎপত্তি হয়েছিল বলে মনে করা হয়ে থাকে।");
        arrayList.add(hashMap);

    }
}