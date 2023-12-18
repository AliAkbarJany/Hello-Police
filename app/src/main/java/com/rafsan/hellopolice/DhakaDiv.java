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

public class DhakaDiv extends AppCompatActivity {

    TextView textMarque,callNumber1,callNumber2,callNumber3;

    ImageView callButton1,callButton2,callButton3;

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

        String policeCall = hashMap1.get("policeCall");
        String history = hashMap1.get("history");
        String policeStationName = hashMap1.get("policeStationName");

        disCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (districtName.contains("Narsingdi")){

                    PoliceInformationDetail.POLICE_Number = policeCall;
                    PoliceInformationDetail.HISTORY = history;
                    PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                    startActivity(new Intent(DhakaDiv.this, PoliceInformationDetail.class));
                }
                else if (districtName.contains("Gazipur")) {

                    PoliceInformationDetail.POLICE_Number = policeCall;
                    PoliceInformationDetail.HISTORY = history;
                    PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                    startActivity(new Intent(DhakaDiv.this, PoliceInformationDetail.class));
                }
                else if (districtName.contains("Shariatpur")) {

                    PoliceInformationDetail.POLICE_Number = policeCall;
                    PoliceInformationDetail.HISTORY = history;
                    PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                    startActivity(new Intent(DhakaDiv.this, PoliceInformationDetail.class));
                }
                else if ( districtName.contains("Narayanganj") ) {

                    PoliceInformationDetail.POLICE_Number = policeCall;
                    PoliceInformationDetail.HISTORY = history;
                    PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                    startActivity(new Intent(DhakaDiv.this, PoliceInformationDetail.class));
                }else if ( districtName.contains("Tangail") ) {

                    PoliceInformationDetail.POLICE_Number = policeCall;
                    PoliceInformationDetail.HISTORY = history;
                    PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                    startActivity(new Intent(DhakaDiv.this, PoliceInformationDetail.class));
                }else if ( districtName.contains("Kishoreganj") ) {

                    PoliceInformationDetail.POLICE_Number = policeCall;
                    PoliceInformationDetail.HISTORY = history;
                    PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                    startActivity(new Intent(DhakaDiv.this, PoliceInformationDetail.class));
                }else if ( districtName.contains("Manikganj") ) {

                    PoliceInformationDetail.POLICE_Number = policeCall;
                    PoliceInformationDetail.HISTORY = history;
                    PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                    startActivity(new Intent(DhakaDiv.this, PoliceInformationDetail.class));
                }else if ( districtName.contains("Dhaka") ) {

                    PoliceInformationDetail.POLICE_Number = policeCall;
                    PoliceInformationDetail.HISTORY = history;
                    PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                    startActivity(new Intent(DhakaDiv.this, PoliceInformationDetail.class));
                }else if ( districtName.contains("Rajbari") ) {

                    PoliceInformationDetail.POLICE_Number = policeCall;
                    PoliceInformationDetail.HISTORY = history;
                    PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                    startActivity(new Intent(DhakaDiv.this, PoliceInformationDetail.class));
                }else if ( districtName.contains("Madaripur") ) {

                    PoliceInformationDetail.POLICE_Number = policeCall;
                    PoliceInformationDetail.HISTORY = history;
                    PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                    startActivity(new Intent(DhakaDiv.this, PoliceInformationDetail.class));
                }else if ( districtName.contains("Gopalganj") ) {

                    PoliceInformationDetail.POLICE_Number = policeCall;
                    PoliceInformationDetail.HISTORY = history;
                    PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                    startActivity(new Intent(DhakaDiv.this, PoliceInformationDetail.class));
                }else if ( districtName.contains("Faridpur") ) {

                    PoliceInformationDetail.POLICE_Number = policeCall;
                    PoliceInformationDetail.HISTORY = history;
                    PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                    startActivity(new Intent(DhakaDiv.this, PoliceInformationDetail.class));
                }else if ( districtName.contains("Munshiganj") ) {

                    PoliceInformationDetail.POLICE_Number = policeCall;
                    PoliceInformationDetail.HISTORY = history;
                    PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                    startActivity(new Intent(DhakaDiv.this, PoliceInformationDetail.class));
                }
            }
        });

        return myView;
    }
}

//================== District table=============================
    private  void dhakaDisTable(){

        hashMap = new HashMap<>();
        hashMap.put("districtName","Narsingdi");
        hashMap.put("policeCall","Narsingdi");
        hashMap.put("policeStationName","Narsingdi Police Station");
        hashMap.put("history","জেলার পটভূমি\n" +
                "রাজা নরসিংহ পঞ্চদশ শতাব্দীর প্রথমদিকে ব্রহ্মপুত্র নদের পশ্চিম তীরে একটি ছোট নগর প্রতিষ্ঠা করেছিলেন। নরসিংহ নামের সাথে পরবর্তীতে দী যুক্ত হয়ে নরসিংদী নামের উৎপত্তি হয়েছে। জমিদারি আমলে নরসিংদী অঞ্চলটি মহেশ্বরদী পরগনার অন্তর্ভুক্ত ছিল। জমিদারি প্রথা বিলুপ্তির পর নরসিংদী ঢাকা জেলাধীন নারায়নগঞ্জ মহকুমার একটি থানায় পরিনত হয়। ১৯৭৭ সালে নরসিংদীকে ঢাকা জেলাধীন একটি মহকুমায় উন্এনীত করা হয়। ১৯৮৪ সালে সরকারি ঘোষণার প্রেক্ষিতে নরসিংদী জেলা হিসেবে আত্মপ্রকাশ করে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Gazipur");
        hashMap.put("policeCall","Gazipur");
        hashMap.put("policeStationName","Gazipur Police Station");
        hashMap.put("history","জেলার পটভূমি :\n" +
                "ইতিহাস আর ঐতিহ্যের সংশ্লেষে কালোত্তীর্ণ মহিমায় আর বর্ণিল দীপ্তিতে ভাস্বর অপার সম্ভাবনায় ভরপুর গাজীপুর জেলা । ইতিহাস খ্যাত ভাওয়াল পরগণার গহীন বনাঞ্চল আর গৈরিক মৃত্তিকা কোষের টেকটিলায় দৃষ্টিনন্দন ঐতিহাসিক এ জনপদ ১৯৮৪ সালের ১ মার্চ গাজীপুর জেলা হিসেবে আত্মপ্রকাশ করে। এ জেলার উত্তরে ময়মনসিংহ ও কিশোরগঞ্জ জেলা, পূর্বে কিশোরগঞ্জ ও নরসিংদী জেলা, দক্ষিণে ঢাকা ও নারায়নগঞ্জ জেলা এবং পশ্চিমে ঢাকা ও টাঙ্গাইল জেলার অবস্থান। মোগল-বৃটিশ-পাকিস্তান আমলে বিভিন্ন আন্দোলন-সংগ্রামে গাজীপুরের রয়েছে বীরত্বপূর্ণ ভূমিকা। ১৯৭১ সালের ১৯ মার্চ মহান মুক্তিযুদ্ধের সূচনা পর্বে এ গাজীপুরের মাটিতেই সংঘটিত হয় প্রথম সশস্ত্র প্রতিরোধযুদ্ধ। এখানে রয়েছে জাতীয় পর্যায়ের বিভিন্ন প্রতিষ্ঠানের সদর দপ্তরসহ ১৯টি কেপি আই, ৫টি বিশ্ববিদ্যালয় ও দেশের একমাত্র হাইটেক পার্কসহ বহু সংখ্যক সরকারী, স্বায়ত্ব শাসিত, বেসরকারী প্রতিষ্ঠান এবং ক্ষুদ্র/মাঝারী ও ভারী শিল্প কারখানাসহ দেশের তৈরী পোষাক শিল্পের বিরাট অংশ।  ঢাকার সাথে দেশের উত্তরবঙ্গ ও উত্তর পূর্ব অঞ্চলের যোগাযোগের ক্ষেত্রে গাজীপুর গেইটওয়ে হিসেবে বিবেচিত । মুসলিম বিশ্বের দ্বিতীয় বৃহত্তম সমাবেশ বিশ্ব ইজতেমা টংগীর তুরাগ নদীর তীরে অনুষ্ঠিত হয় ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Shariatpur");
        hashMap.put("policeCall","Shariatpur");
        hashMap.put("policeStationName","Shariatpur Police Station");
        hashMap.put("history","জেলার পটভুমি\n" +
                "ইতিহাস সমৃদ্ধ বিক্রমপুরের দক্ষিণাঞ্চল এবং প্রাচীনবরিশালের ইদিলপুর পরগণার কিছু অংশ নিয়ে বর্তমান শরীয়তপুর জেলা গঠিত।বাংলাদেশের মুক্তির সংগ্রামে শরীয়তপুরবাসীর ভূমিকাও উল্লেখযোগ্য। স্বাধীনতাপরবর্তীকালে জেলাটি ফরিদপুরের মাদারীপুর মহকুমার অন্তর্ভূক্ত ছিল। ১৯৭৭সালের ৩ নভেম্বর বিশিষ্ট সমাজ সংস্কারক ও ব্রিটিশ বিরোধী আন্দোলনের নেতাহাজী শরীয়ত উল্লাহর নামানুসারে শরীয়তপুর  নামকরণ করা হয়। ১৯৮৪ সালেশরীয়তপুর জেলায় উন্নীত হয়। জেলা প্রশাসকের কার্যালয়, শরীয়তপুর এর ওয়েবপোর্টালে সকলকে স্বাগতম। এদেশে কম্পিউটারের বা তথ্য প্রযুক্তির প্রচলন খুবএকটা বেশী দিনের নয়। তবে বাঙালী জাতি তথা বাংলাদেশীরা তথ্য প্রযুক্তির সাথেনিজেদের খাপ খাইয়ে নেয়ার চেষ্টা করে যাচ্ছে আন্তরিকভাবে। স্বপ্ন দেখতেশুরু করেছে তথ্য প্রযুক্তি নির্ভর বাংলাদেশ গড়ার। গণতান্ত্রিক সরকার  জনগণের স্বপ্নকে বাস্তবে রূপদানের  লক্ষ্যে ২০২১ সালের জন্য ভিশন নির্ধারণকরেছে ‘ডিজিটাল বাংলাদেশ’। ডিজিটাল বাংলাদেশ প্রকল্পের অংশ হিসেবে শরীয়তপুরজেলার অর্ন্তভুক্তি নিঃসন্দেহে আনন্দের ও তাৎপর্যের। জেলা ওয়েবপোর্টাল-এটি শুধু দেশের মানুষের জন্য সুখকর নয়, বিদেশে অবস্থানকারীদেরজন্যেও হিতকর। আশা ও বিশ্বাস, শরীয়তপুর জেলা ওয়েব পোর্টাল সৃষ্টির ফলে জনগণউপকৃত হবে। সুশাসন ও ডিজিটাল বাংলাদেশ সৃষ্টির  লক্ষ্যে ডিজিটাল কর্মসূচীএক ধাপ এগিয়ে চলার অনুপ্রেরণা  যোগাবে। শরীয়তপুর জেলা ডিজিটাল পদ্ধতির সাথেএকযোগে কাজ করতে পারলে  শরীয়তপুরবাসীর সাথে আমরাও নিজেদেরকে ডিজিটালবাংলাদেশের অংশ হিসেবে ভাবতে পেরে আনন্দিত হবো। যারা এ কাজটির সাথেসংশ্লিষ্ট থেকে কাজটি সম্পন্ন করতে সহায়তা করেছে তাদেরসহ সকলকে ধন্যবাদ ওকৃতজ্ঞতা জানাচ্ছি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Narayanganj");
        hashMap.put("policeCall","Narayanganj");
        hashMap.put("policeStationName","Narayanganj Police Station");
        hashMap.put("history","জেলার পটভূমি\n" +
                "১৭৬৬ সালে হিন্দু সম্প্রদায়ের নেতা বিকন লাল পান্ডে (বেণুর ঠাকুর বা লক্ষীনারায়ণ ঠাকুর নামে ও পরিচিত) ইস্ট ইন্ডিয়া কোম্পানির নিকট থেকে এ অঞ্চলের মালিকানা গ্রহণ করেন। তিনি প্রভু নারায়ণের সেবার ব্যয়ভার বহনের জন্য একটি দলিলের মাধ্যমে শীতলক্ষা নদীর তীরে অবস্থিত মার্কেটকে দেবোত্তর সম্পত্তি হিসেবে ঘোষণা করেন। তাই পরবর্তীকালে এ স্থানের নাম হয় নারায়ণগঞ্জ। সপ্তদশ ও অষ্টাদশ শতাব্দীর মধ্যভাগ পর্যন্ত নারায়ণগঞ্জ নামের কোনো নগরীর অস্তিত্ব প্রাচীন বাংলার মানচিত্রে পাওয়া যায় না।\n" +
                "\n" +
                "নারায়ণগঞ্জ নামকরণের পূর্বে সোনার গাঁ ছিল প্রাচীন বাংলার রাজধানী। মুসলিম আমলের সোনার গাঁ নামের উদ্ভব প্রাচীন সুবর্ণগ্রামকে কেন্দ্র করেই। বহু অঞ্চলে মুসলিম অধিকার প্রতিষ্ঠিত হওয়ার পর থেকে ঢাকা নগরের অভ্যুদয়ের পূর্ব পর্যন্ত সময়কালে দক্ষিণ-পূর্ববঙ্গের প্রশাসনিককেন্দ্র ছিল সোনার গাঁ। ফিরোজ শাহ চতুর্দশ শতাব্দির প্রায় প্রথমদিকে এই অঞ্চল নিজেদের দখলে নিয়ে তা অন্তর্ভুক্ত করেন লখনৌতি রাজ্যের। এর ফলে ঘটে হিন্দু রাজত্বের অবসান। সোনারগাঁ লখনৌতি রাজ্যের অন্তর্ভুক্ত হওয়ার পর থেকে গিয়াসউদ্দীন বাহাদুর শাহ-এর ক্ষমতালাভের (১৩২২) পূর্ব পর্যন্ত সময়ে সোনারগাঁয়ের গুরুত্ব সাময়িকভাবে কিছুটা কমে গেলেও এটি একটি বন্দর ও টাঁকশাল শহর হিসেবে গুরুত্ব পেতে থাকে। ১৩২৪ খৃস্টাব্দে গিয়াসউদ্দীন তুঘলক বাংলা অধিকার করে সাতগাঁও, লখনৌতি ও সোনারগাঁ- এই তিনটি প্রশাসনিক অংশ বা ইউনিটে বিভক্ত করেন। ১৩৩৮ থেকে ১৩৫২ খৃস্টাব্দ পর্যন্ত সোনারগাঁ ফখরুদ্দিন মোবারক শাহ প্রতিষ্ঠিত স্বাধীন রাজ্যের রাজধানীর মর্যাদা লাভ করে। বাংলার প্রথম স্বাধীন সুলতান ফখরুদ্দিন মোবারক শাহ। তিনি সোনারগাঁয়ের শাসনকর্তা বাহরাম খানের সাহায্যকারী ছিলেন। ১৩৩৮ খৃস্টাব্দে সুলতানের মৃত্যু ঘটলে দিল্লী হতে নতুন শাসনকর্তা নিয়োগে বিলম্ব হলে তিনি বিদ্রোহ ঘোষণা করে সোনার গাঁ অধিকার করেন। শামসুদ্দিন ইলিয়াস শাহ সোনারগাঁ দখল করেন ১৩৫২ খৃস্টাব্দে। সেখান থেকে জারি করা হয় মুদ্রা। সুদুর বাগদাদ নগরী থেকে দিল্লী আধ্যাত্নিক সাধু সম্রাট শাহ ফতেহউল্লাহ্ ধর্ম প্রচারের উদ্দেশ্যে এখানে আসেন। পরবর্তীতে তাঁর মৃত্যুর পরে এখানেই কবরস্থ করা হয়। তার নাম থেকেই বুড়িগঙ্গা নদীর তীরে অবস্থিত সুফী সাধকের স্মৃতি বিজড়িত এক সময় পরগনা নামে পরিচিত এই এলাকার একটি অঞ্চল ফতেহউল্লাহ্ বা ফতুল্লা নামকরণ করা হয়।\n" +
                "\n" +
                "মুসা খানের পতনের পর (১৬১১) সোনার গাঁ মুঘল সুবাহ বাংলার একটি সরকারে পরিণত হয়। সোনারগাঁয়ের অর্থনৈতিক ও রাজনৈতিক গুরুত্বের দ্রুত পতন শুরু হয় ঢাকার মুঘল রাজধানী স্থাপনের (১৬১০) পর থেকেই। সোনারগাঁয়ের একটি অংশে ঊনবিংশ শতাব্দির শেষ থেকে বিংশ শতাব্দির প্রথমদিকে গড়ে উঠেছিল পানাম নগর। নানা স্থাপত্য নিদর্শন থেকে এটা সুস্পষ্ট যে, বর্তমান পানাম নগর ও খাস নগরের মধ্যবর্তী এলাকার বিস্তৃত হিন্দু আমলের রাজধানী শহর মুসলিম আমলে সম্পূর্ণ পরিত্যক্ত হয়নি, সম্ভবত এই স্থানে প্রথমদিকের মুসলিম শাসনকর্তাদের আবাসস্থল ছিল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Tangail");
        hashMap.put("policeCall","Tangail");
        hashMap.put("policeStationName","Tangail Police Station");
        hashMap.put("history","জেলা সৃষ্টির ইতিহাস\n" +
                "টাঙ্গাইল জেলা সৃষ্টির ইতিহাস\n" +
                "\n" +
                "ইতিহাস ও ঐতিহ্য বর্ণনায় প্রতীয়মান হয় টাঙ্গাইল জেলা পাঁচ-সাড়ে পাঁচ হাজার বৎসর পূর্বে কামরূপ রাজ্যের বা প্রাগ জ্যোতিষপুর রাজ্যাংশ ‘ভাটির মুলুক’ এর অন্তর্গত ছিলো। দশম হতে একাদশ শতাব্দীর প্রারম্ব পর্যন্ত ১২০ কাল পাল রাজন্যবর্গ এই অঞ্চল শাসন করেছে। এর পর দ্বাদশ শতাব্দীতে সেন বংশের নৃপতি সেনের আমলে টাঙ্গাইল জেলা সেনদের অধিকারে আসে। ১৩০১ থেকে ১৩২২ খ্রিস্টাব্দে গৌড়ধিপতি সুলতান শাসসুদ্দিন ফিরোজ শাহ দেহলভী এই অঞ্চলে মুসলমান রাজত্বের সূচনা করেন।\n" +
                "\n" +
                "\n" +
                "\n" +
                "বর্তমান টাঙ্গাইল জেলা অতীত যমুনা নদীর বুকে নতুন জেগে ওঠা চর এলাকার সমষ্টি।এখানে ছোট্ট ছোট্ট জনগোষ্ঠী বসবাস শুরু করে যার অধিকাংশই ছিল পাশ্ববর্তী উত্তরবঙ্গের অর্থাৎ যমুনার পশ্চিম পাড়ের অধিবাসী। অতীত কাল থেকেই বহু ভাঙ্গাগড়া ও রাজনৈতিক দখল-বেদখল, চড়াই উৎরাই পেরিয়ে যে এলাকা আজ টাঙ্গাইল জেলা বলে পরিচিত লাভ করেছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Kishoreganj");
        hashMap.put("policeCall","Kishoreganj");
        hashMap.put("policeStationName","Kishoreganj Police Station");
        hashMap.put("history","Kishoreganj");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Manikganj");
        hashMap.put("policeCall","Manikganj");
        hashMap.put("policeStationName","Manikganj Police Station");
        hashMap.put("history","মানিকগঞ্জ জেলার পটভূমি\n" +
                "          সবুজ শস্য-শা্যামল প্রান্তর, রাশিরাশি বৃক্ষরাজি আর দূর দিগন্তে দৃষ্টির সীমানায় আকাশের নীলিমার সখ্যতা নিয়ে গাজীখালি, ধলেশ্বরী, কালীগঙ্গার তীরে গড়ে ওঠা বন্দর মানিকগঞ্জ। এ জেলার নৈসর্গিক দৃশ্যে মন হারিয়ে যায় প্রকৃতির সাথে। ধলেশ্বরীর রূপালী  বেলাভূমিতে ভোরের আকাশের উদীয়মান সূর্যের শ্বাশত রূপ হয় মোহনীয়। এমন অপরূপ রূপের জেলা মানিকগঞ্জ।\n" +
                "\n" +
                "          মানিকগঞ্জ মহকুমা প্রতিষ্ঠিত হয় ১৮৪৫ সালের মে মাসে। মানিকগঞ্জ মহকুমা প্রথমে ফরিদপুর জেলার (১৮১১ সালে সৃষ্ট) অধীন ছিল। প্রশাসনিক জটিলতা নিরসনকল্পে ১৮৫৬ সালে মানিকগঞ্জ মহকুমাকে ফরিদপুর জেলা থেকে ঢাকা জেলায় অর্ন্তভূক্ত করা হয়। মানিকগঞ্জ জেলার উত্তর সীমান্তে টাঙ্গাইল জেলা। পশ্চিম এবং দক্ষিণ সীমান্তে যমুনা ও পদ্মা নদী পাবনা ও ফরিদপুর জেলাকে বিচ্ছিন্ন করেছে। পূর্ব, উত্তরপূর্ব এবং দক্ষিনে রয়েছে যথাক্রমে ধামরাই, সাভার, কেরানীগঞ্জ উপজেলা।\n" +
                "\n" +
                "          মূলতঃ সংস্কৃত ’মানিক্য’ শব্দ থেকে মানিক শব্দটি এসেছে। মানিক হচ্ছে চুনি পদ্মরাগ। গঞ্জ শব্দটি ফরাসী। মানিকগঞ্জ নামের উৎপত্তি সর্ম্পকীয় ইতিহাস আজও রহস্যাবৃত । মানিকগঞ্জ নামে কোন গ্রাম বা মৌজার অস্তিত্ব নেই। ১৮৪৫ সাল মহুকুমা সৃষ্টির আগে কোন ঐতিহাসিক বিবরণে বা সরকারী নথিপত্রে মানিকগঞ্জ এর নাম পাওয়া যায়নি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Dhaka");
        hashMap.put("policeCall","Dhaka");
        hashMap.put("policeStationName","Dhaka Police Station");
        hashMap.put("history","নামকরণ\n" +
                "\n" +
                "বাংলাদেশের রাজধানী ঢাকা মোঘল-পূর্ব যুগে কিছু গুরুত্বধারন করলেও শহরটি ইতিহাসে প্রসিদ্ধি লাভ করে মোঘল যুগে। ঢাকা নামের উৎপত্তি সম্পর্কে স্পষ্ট করে তেমন কিছু জানা যায় না। এ সম্পর্কে প্রচলিত মতগুলোর মধ্যে কয়েকটি নিম্নরূপঃ ক) একসময় এ অঞ্চলে প্রচুর ঢাক গাছ (বুটি ফুডোসা) ছিল; খ) রাজধানী উদ্বোধনের দিনে ইসলাম খানের নির্দেশে এখানে ঢাক অর্থাৎ ড্রাম বাজানো হয়েছিল; গ) ‘ঢাকাভাষা’ নামে একটি প্রাকৃত ভাষা এখানে প্রচলিত ছিল; ঘ) রাজতরঙ্গিণী-তে ঢাক্কা শব্দটি ‘পর্যবেক্ষণ কেন্দ্র’ হিসেবে উল্লেখিত হয়েছে অথবা এলাহাবাদ শিলালিপিতে উল্লেখিত সমুদ্রগুপ্তের পূর্বাঞ্চলীয় রাজ্য ডবাকই হলো ঢাকা। মোঘল পূর্ব যুগের পুরাতাত্বিক নিদর্শন হিসেবে ঢাকা শহরে দু’টি এবং মিরপুরে একটি মসজিদ রয়েছে। এর মধ্যে প্রাচীনতমটির নির্মাণ তারিখ ১৪৫৬ খ্রিষ্টাব্দ (জোয়াও দ্য ব্যারোস ঢাকাকে একটি গুরুত্বপূর্ণ স্থান হিসেবে দেখতে পান এবং ১৫৫০ খ্রিষ্টাব্দে তার অঙ্কিত মানচিত্রে এর অবস্থান নির্দেশ করেন।\n" +
                "\n" +
                "আকবর নামা গ্রন্থে ঢাকা একটি থানা (সামরিক ফাঁড়ি) হিসেবে এবং আইন-ই- আকবরী গ্রন্থে সরকার বাজুহার একটি পরগনা হিসেবে ঢাকা বাজু উল্লিখিত হয়েছে। ১৬১০ খ্রিষ্টাব্দে ইসলাম খান চিশতি সুবাহ বাংলার রাজধানী রাজমহল থেকে ঢাকায় স্থানান্তর করেন এবং সম্রাটের নামানুসারে এর নামকরণ করে জাহাঙ্গীরনগর।\n" +
                "\n" +
                "প্রশাসনিকভাবে জাহাঙ্গীরনগর নামকরণ হলেও সাধারণ মানুষের মুখে ঢাকা নামটিই থেকে যায়। সকল বিদেশী পর্যটক এবং বিদেশী কোম্পানির কর্মকর্তারাও তাদের বিবরণ এবং চিঠিপত্রে ঢাকা নামটি ব্যবহার করেন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Rajbari");
        hashMap.put("policeCall","Rajbari");
        hashMap.put("policeStationName","Rajbari Police Station");
        hashMap.put("history","জেলার পটভূমি\n" +
                "রাজবাড়ী যে কোন রাজার বাড়ীর নামানুসারে নামকরণ করা হয়েছে এ বিষয়ে কোন সন্দেহ নাই। তবে কখন থেকে ও কোন রাজার নামানুসারে রাজবাড়ী নামটি এসেছে তার সুনির্দিষ্ট ঐতিহাসিক কোন তথ্য পাওয়া যায়নি। বাংলার রেল ভ্রমণ পুস্তকের (এল.এন.মিশ্র প্রকাশিত ইস্ট বেঙ্গল রেলওয়ে ক্যালকাটা ১৯৩৫) একশ নয় পৃষ্ঠায় রাজবাড়ী সম্বন্ধে যে তথ্য পাওয়া যায় তাতে দেখা যায় ১৬৬৬ খ্রিস্টাব্দে নবাব শায়েস্তা খান ঢাকায় সুবাদার নিযুক্ত হয়ে আসেন। এই সময় এই অঞ্চলে পর্তুগীজ জলদস্যুদের দমনের জন্যে তিনি সংগ্রাম শাহ্কে নাওয়ারা প্রধান করে পাঠান। তিনি বানিবহতে স্থায়ীভাবে বসবাস করতেন এবং লালগোলা নামক স্থানে দুর্গ নির্মাণ করেন। এই লালগোলা দুর্গই রাজবাড়ীর কয়েক কিলোমিটার উত্তরে বর্তমান লালগোলা গ্রাম। সংগ্রাম শাহ্ ও তার পরিবার পরবর্তীতে বানিবহের নাওয়ারা চৌধুরী হিসাবে পরিচিত হয়ে ওঠেন। এল.এন.মিশ্র উক্ত পুস্তকে উল্লেখ করেন রাজা সংগ্রাম শাহের রাজ কারবার বা রাজকাচারী ও প্রধান নিয়ন্ত্রনকারী অফিস বর্তমান রাজবাড়ী এলাকাকে কাগজে কলমে রাজবাড়ী লিখতেন (লোকমুখে প্রচলিত) । ঐ পুস্তকের শেষের পাতায় রেলওয়ে স্টেশন হিসেবে রাজবাড়ী নামটি লিখিত পাওয়া যায়। উল্লেখ্য রাজবাড়ী রেল স্টেশন ১৮৯০ সালে স্থাপিত। ঐতিহাসিক আনন্দনাথ রায় ফরিদপুরের ইতিহাস পুস্তকে বানিবহের বর্ণনায় লিখেছেন নাওয়ারা চৌধুরীগণ পাঁচথুপি থেকে প্রায় ৩০০ বছর পূর্বে বানিবহ এসে বসবাস শুরু করেন। বানিবহ তখন জনাকীর্ণ স্থান। বিদ্যাবাগিশ পাড়া, আচার্য পাড়া, ভট্টাচার্য পাড়া, শেনহাটিপাড়া, বসুপাড়া, বেনেপাড়া, নুনেপাড়া নিয়ে ছিল বানিবহ এলাকা। নাওয়ারা চৌধুরীগণের বাড়ী স্বদেশীগণের নিকট রাজবাড়ী নামে অভিহিত ছিল।\n" +
                "\n" +
                " \n" +
                "\n" +
                "মতান্তরে রাজা সূর্য কুমারের নামানুসারে রাজবাড়ীর নামকরণ হয়।  রাজা সূর্য কুমারের পিতামহ প্রভুরাম  নবাব সিরাজ-উদ-দৌলার রাজকর্মচারী থাকাকালীন কোন কারণে ইংরেজদের বিরাগভাজন হলে পলাশীর যুদ্ধের পর লক্ষীকোল এসে আত্মগোপন করেন। পরে তার পুত্র দ্বিগেন্দ্র প্রসাদ এ অঞ্চলে জমিদারী গড়ে তোলেন। তারই পুত্র রাজা সুর্য কুমার ১৮৮৫ সালে জনহিতকর কাজের জন্য রাজা উপাধি প্রাপ্ত হন। রাজবাড়ী রেল স্টেশন এর নামকরণ করা হয় ১৮৯০ সালে। বিভিন্ন তথ্য অনুযায়ী জানা যায় রাজবাড়ী রেল স্টেশন এর নামকরণ রাজা সূর্য কুমারের নামানুসারে করার দাবি তোলা হলে বানিবহের জমিদারগণ প্রবল আপত্তি তোলেন। উল্লেখ্য বর্তমানে যে স্থানটিতে রাজবাড়ী রেল স্টেশন অবস্থিত উক্ত জমির মালিকানা ছিল বানিবহের জমিদারদের। তাদের প্রতিবাদের কারনেই স্টেশনের নাম রাজবাড়ীই থেকে যায়। এই সকল বিশ্লেষণ থেকে ধারণা করা হয় রাজবাড়ী নামটি বহু পূর্ব থেকেই প্রচলিত ছিল। এলাকার নাওয়ারা প্রধান, জমিদার, প্রতিপত্তিশালী ব্যক্তিগণ রাজা বলে অভিহিত হতেন। তবে রাজা সূর্য কুমার ও তার পূর্ব পুরুষগণের লক্ষীকোলের বাড়ীটি লোকমুখে রাজার বাড়ী বলে সমাধিক পরিচিত ছিল। এভাবেই আজকের রাজবাড়ী।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Madaripur");
        hashMap.put("policeCall","Madaripur");
        hashMap.put("policeStationName","Madaripur Police Station");
        hashMap.put("history","জেলা প্রশাসনের পটভূমি\n" +
                "মাদারীপুর একটি ইতিহাস সমৃদ্ধ জনপদ। পঞ্চদশ শতাব্দীর সাধক হযরত বদরুদ্দিন শাহ্ মাদার(রঃ) এর নামানুসারে এই জেলার নামকরণ করা হয়। প্রাচীনকাল থেকে নানা ঘাত-প্রতিঘাতের মধ্য দিয়ে বয়ে এসেছে আজকের এই মাদারীপুরের ইতিহাস।\n" +
                "\n" +
                "প্রাচীন কাল থেকে ইংরেজ আমলের পূর্ব পর্যমত্মঃঅতি প্রাচীনকালে মাদারীপুরের নাম ছিল ইদিলপুর। ইদিলপুর চন্দ্রদ্বীপ রাজ্যের একটি উন্নত জনপদ ছিল। তখন এ অঞ্চলের প্রশাসনিক নাম ছিল নাব্যমন্ডল। কোটালীপাড়া ছিল বাংলার সভ্যতার অন্যতম কেন্দ্র। খ্রিস্টীয় চতুর্থ শতকে ইদিলপুর ও কোটালীপাড়া ব্যবসা-বাণিজ্যের জন্য বিখ্যাত ছিল।গ্রিকবীর আলেকজান্ডারের ভারত আক্রমণের সময় ৩২৭ খ্রিস্টপূর্বে কোটালীপাড়া অঞ্চলে গঙ্গাঁরিডি জাতি স্বাধীনভাবে রাজত্ব করত। তারপর এ অঞ্চল (৩২০-৪৯৬ খ্রিঃ) গুপ্তরাজাদের অধীনে ছিল। বাংলার স্বাধীন শাসক শশাঙ্কের মৃত্যুর পর একশত বছর(৬৫০-৭৫০ খ্রিঃ) বাংলার ইতিহাস ‘‘মাৎসায়ন’’ নামে খ্যাত। জোর যার মূল্লক তার চলতে থাকে। ৭৫০ খ্রিস্টাব্দে গোপালকে রাজা নির্বাচিত করা হয়। পাল বংশ ৭৫০-১২২৪ খ্রিস্টাব্দ পর্যমত্ম বাংলা শাসন করে।\n" +
                "\n" +
                "চন্দ্রবংশ দশম ও এগার শতকে স্বাধীনভাবে দক্ষিণ-পূর্ব বঙ্গ রাজত্ব করে। চন্দ্র বংশের শ্রীচন্দ্রের তাম্রশাসন রামপাল ইদিপুর ও কেদারপুরে পাওয়া যায়। মাদারীপুর-শরীয়তপুর চন্দ্ররাজার অধীনে ছিল। সেন বংশ ১০৯৮ হতে ১২২৫ খ্রিস্টাব্দ পর্যমত্ম পূর্ব বাংলা শাসন করে। কোটালীপাড়া ও মদনপাড়ায় বিশ্বরূপ সেন এবং ইদিলপুরে কেশব সেনের তাম্রলিপি পাওয়া যায়। প্রাচীনকালে মাদারীপুরের পূর্বাংশ ইদিলপুর এবং পশ্চিম অংশ কোটালীপাড়া নামে পরিচিত ছিল। সেন রাজাদের পতনের পর চন্দ্রদ্বীপ রাজ্য প্রতিষ্ঠিত হয়। বরিশাল বিভাগ, মাদারীপুর, শরীয়তপুর, গোপালগঞ্জ ও বাগেরহাট জেলা চন্দ্রদ্বীপ রাজ্যের অধীনে ছিল।\n" +
                "\n" +
                "চতুর্দশ শতকে ফরিদপুর সুলতানদের শাসনাধীনে চলে যায়। ১২০৩ থেকে ১৫৭৫ সাল পর্যমত্ম সুলতানগণ বাংলা শাসন করে। কিন্তু পূর্ববঙ্গে প্রায় একশ বছর সেন রাজত্ব চলে। সুলতান রুকনউদ্দীন বরবক শাহ (১৪৫৯-১৪৭৪ খ্রিঃ) প্রথম ফরিদপুর-চন্দ্রদ্বীপ দখল করেন। সুলতান জালাল উদ্দিন ফতেহ শাহ (১৪৮১-১৪৮৫ খ্রিঃ) ফরিদপুর ও চন্দ্রদ্বীপের একাংশ দখল করে ফতেহাবাদ পরগনা গঠন করেন। ফরিদপুর মাদারীপুরের প্রথম ঐতিহাসিক নাম ফতেহাবাদ। সুলতান হুসেন শাহ (১৪৯৩-১৫১৯ খ্রিঃ) ফতেহাবাদের জনপ্রিয় শাসক ছিল। ১৫৩৮ হতে ১৫৬৩ সাল পর্যমত্ম শেরশাহ ও তার বংশধরগণ বাংলা শাসন করেন। ১৫৬৪ সাল হতে ১৫৭৬ সাল পর্যমত্ম কররানি বংশ বাংলার রাজত্ব করে তারপর ১৫৭৬ সাল হতে ১৬১১ সাল পর্যমত্ম বারভূঁইয়ার অধীনে ছিল বাংলা। বারভূঁইয়াদের অন্যতম ছিল ফরিদপুরের চাঁদ রায়, কেদার রায় এবং বাকলার রামচন্দ্র রায়। মোগল ও নবাবী শাসন চলে ১৭৬৫ খ্রিস্টাব্দ পর্যমত্ম। তারপর বাংলা ইংরেজদের দখলে চলে যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Gopalganj");
        hashMap.put("policeCall","Gopalganj");
        hashMap.put("policeStationName","Gopalganj Police Station");
        hashMap.put("history","মধুমতির কোল ঘেঁষে গড়ে উঠেছে গোপালগঞ্জ জেলার সভ্যতা-সাংস্কৃতিক অবকাঠামো। প্রাচীনকালে  এ এলাকাটি বঙ্গ অঞ্চলের অন্তর্গত ছিল। সুলতানি ও মোঘল যুগে এ অঞ্চল হিন্দু রাজারা শাসন করতেন। চিরস্থায়ী বন্দোবস্তের (১৭৯৩) সময় গোপালগঞ্জ জেলার মুকসুদপুর উপজেলা ছিল যশোর জেলার অন্তর্গত আর বাকী অংশ ছিল ঢাকা-জালালপুর জেলার অন্তর্ভুক্ত। ১৮০৭ সালে মুকসুদপুর থানা  যশোর থেকে ফরিদপুর জেলার সাথে যুক্ত হয়। ফরিদপুর জেলার একটি পরগনার নাম ছিল জালালপুর। গোপালগঞ্জ সদর ও কোটালীপাড়া জালালপুর পরগনাভুক্ত  ছিল।  ১৮১২ সালে চান্দনা (মধুমতি) নদী যশোর ও ঢাকা-জালালপুর জেলার বিভক্ত রেখা হিসেবে নির্ধারিত হয়। গোপালগঞ্জ-মাদারীপুর এলাকা ছিল বিশাল জলাভূমি। এখানে নৌ-ডাকাতির প্রকোপ ছিল বেশি। এজন্য বাকেরগঞ্জ থেকে বিভাজিত হয়ে ১৮৫৪ সালে মাদারীপুর মহকুমা  প্রতিষ্ঠিত হয়।                      \n" +
                "\n" +
                "১৮৭২ সালে মাদারীপুর মহকুমায় গোপালগঞ্জ নামক একটি থানা গঠিত হয়। ১৮৭৩ সালে মাদারীপুর মহকুমাকে বাকেরগঞ্জ জেলা থেকে ফরিদপুর জেলার সঙ্গে যুক্ত করা হয়। ১৯০৯ সালে মাদারীপুর মহকুমাকে ভেঙ্গে গোপালগঞ্জ মহকুমা গঠন করা হয়। গোপালগঞ্জ এবং কোটালীপাড়া থানার সঙ্গে ফরিদপুর মহকুমার মুকসুদপুর থানাকে নবগঠিত গোপালগঞ্জ মহকুমার অন্তর্ভুক্ত করা হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Faridpur");
        hashMap.put("policeCall","Faridpur");
        hashMap.put("policeStationName","Faridpur Police Station");
        hashMap.put("history","জেলা প্রশাসনের পটভূমি\n" +
                "সুপ্রাচীনকাল থেকেই ফরিদপুরের রয়েছে অনেক কীর্তিময় গৌরব-গাঁথা। ফরিদপুর জেলার প্রতিষ্ঠা ১৭৮৬ সালে। মতান্তরে এ জেলা প্রতিষ্ঠিত হয় ১৮১৫ (বাংলা পিডিয়া)। এর আয়াতন ২০৭২.৭২ বর্গ কিলেমিটার। উত্তরে রাজবাড়ী এবং মানিকগঞ্জ জেলা, পশ্চিমে নড়াইল ও মাগুরা, দক্ষিণে গোপালগঞ্জ জেলা পূর্বে ঢাকা ও মুন্সীগঞ্জ এবং মাদারীপুর জেলা। ফরিদপুর জেলায় মোট পৌরসভা ৫ টি, মহল্লা৯২টি, ইউনিয়ন ৮১টি, গ্রাম ১,৮৫৯টি। মোট উপজেলা ৯টি। সেগুলো হচ্ছেঃ ফরিদপুর সদর, মধুখালী, বোয়ালমারী,আলফাডাঙ্গা, সালথা, নগরকান্দা, ভাঙ্গা, সদরপুর, চরভদ্রাসন।\n" +
                "\n" +
                " \n" +
                "ব্রিটিশ শাসন আমলে সৃষ্ট একটি অন্যতম প্রাচীন জেলার নাম ফরিদপুর। অনেক আউলিয়া-দরবেশ, রাজনীতিক, পূণ্যাত্মার আবাসভূমি হিসেবে এ অঞ্চল অত্যন্ত সুপরিচিত। এ জেলার পূর্বনাম ছিল ‘‘ফতেহাবাদ’’। প্রখ্যাত সাধক এবং দরবেশ খাজা মাইনউদ্দিন চিশতী (রহঃ) এর শিষ্য শাহ ফরিদ(রহঃ) এর নামানুসারে এ জেলার নামকরণ করা হয় ফরিদপুর। ফরিদপুর জেলার প্রতিষ্ঠা সন ১৭৮৬ হলেও তখন এটির নাম ছিল জালালপুর এবং প্রধান কার্যালয় ছিল ঢাকা। ১৮০৭খ্রিঃ ঢাকা জালালপুর হতে বিভক্ত হয়ে এটি ফরিদপুর জেলা নামে অভিহিত হয় এবং হেড কোয়ার্টার স্থাপন করা হয় ফরিদপুর শহরে। গোয়ালন্দ, ফরিদপুর সদর, মাদারীপুর ও গোপালগঞ্জ এই চারটি মহকুমা সমন্বয়ে ফরিদপুর জেলা পূর্ণাঙ্গতাপায়। বৃহত্তর ফরিদপুর জেলা পাঁচটি জেলায় রূপান্তরিত হয়েছে। জেলাগুলো হচ্ছেঃ ফরিদপুর, রাজবাড়ী, গোপালগঞ্জ, মাদারীপুর ও শরীয়তপুর। এ জেলায় হাজী শরীয়তুল্লাহর নেতৃত্বে ফরায়েজী আন্দোলন ব্যাপক প্রসার লাভ করে। এক সময় গড়াই, মধুমতি, বারাসিয়া, চন্দনা, কুমার প্রভৃতি নদীর তীরবর্তী জমিতে নীলচাষ করা হতো। আলফাডাঙ্গা ও মীরগঞ্জে প্রধান কুঠি স্থাপন করা হয়েছিল। এজেলার ৫২টি নীল কুঠি এর অর্মত্মভূক্ত ছিল। প্রধান ম্যানেজার ছিলেন ডানলফ। অন্যান্য জেলার ন্যায় এ জেলায়ও নীল বিদ্রোহ হয়েছে। এতে নেতৃত্ব দেন দুদুমিয়া। এক সময় এ জেলা বিল প্রধান জলা ভূমি এলাকা ছিল এবং পদ্মার প্লাবনে পলিমাটিতে উর্বর হতো। জেলা শহর বর্তমানে কুমার নদীর তীরে অবস্থিত। ফরিদপুর পৌরসভা সৃষ্টি হয় ১৮৬৯ সালে। ২৭টি ওয়ার্ড ৩৫টি মহল্লা নিয়ে জেলা শহর গঠিত।এর আয়তন ২০.২৩ বর্গ কিলোমিটার। প্রাচীন নিদর্শন ও প্রত্ন সম্পদের মধ্যে -গেরদা মস্জিদ (হিঃ ১০১৩), পাতরাইল মস্জিদ ( ১৪৯৩ -১৫১৯ খ্রিঃ), সাতৈরমস্জিদ ( ১৫১৯ খ্রিঃ), বাসুদেব মন্দির, জগদবন্ধুর আঙ্গিনা, ফতেহাবাদ টাকশাল(১৫১৯-১৫৩২ খ্রিঃ), মথুরাপুর দেউল, বাইশরশি জমিদারবাড়ী, জেলা জজ কোর্ট ভবন(১৮৮৯ খ্রিঃ), ভাঙ্গা মুন্সেফ কোর্ট ভবন (১৮৮৯ খ্রিঃ) উল্লেখযোগ্য।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Munshiganj");
        hashMap.put("policeCall","Munshiganj");
        hashMap.put("policeStationName","Munshiganj Police Station");
        hashMap.put("history","জেলা প্রশাসনের পটভূমি\n" +
                "ইস্ট ইন্ডিয়া কোম্পানি দিল্লির বাদশাহ দ্বিতীয় শাহ আলমের কাছ থেকে ১৭৬৫ খ্রিস্টাব্দে বাংলা, বিহার, উড়িষ্যার দেওয়ানী লাভ করেন। এই দেওয়ানীকে প্রথম রাজস্ব প্রশাসন হিসেবে অভিহিত করা যায়। সে সময় মুন্সিগঞ্জ ঢাকা জেলার অংশ ছিলো। ১৭৬৯ খ্রিস্টাব্দে মিঃ মিডেলটন স্বাধীনভাবে রাজস্ব প্রশাসন পরিচালনা করতে থাকেন। তিনি সর্বোচ্চ জমিদারি ডাককারীদের অনুকুলে মহালগুলো লিজ দিয়ে ছিলেন। এদিকে লিজ প্রাপ্ত জমিদারগণ আবার সাব লিজ দিতে থাকলেন। স্বাভাবিকভাবেই রাজস্ব প্রশাসনে বিশৃঙ্খলা দেখা দেয়। ১৭৭৬ থেকে ১৭৮১ খ্রিস্টাব্দ পর্যন্ত প্রাদেশিক কাউন্সিল কাজ করে।\n" +
                "\n" +
                " \n" +
                "\n" +
                "ঢাকা কালেক্টটের আওতায় ১৯৪৭ সালে মুন্সিগঞ্জ মহকুমা সৃস্টি হয়,জনাব কে এস এইচ চৌধুরি ই পি সি এস মুন্সিগঞ্জের প্রথম এস ডি ও ছিলেন। জনাব চৌধুরী ২২-০৮-১৯৪৭ থেকে ১৭-০৭-১৯৪৯ পর্যন্ত এস ডি ও পদে দায়িত্ত পালন করেন। ১৯৮৪ খ্রিস্টাব্দে মুনশিগঞ্জ জেলা ঘোযণা করা হয়।এর আগে জেলার প্রশাসনিক কাজ নিয়ন্ত্রিত হতো ঢাকা থেকে । মুন্সীগঞ্জের  প্রথম জেলা  প্রশাসক জনাব মোঃ শফিকুল ইসলাম তিনি  এ জেলায় ০১-০৩-১৯৮৪ থেকে ১৯-০৬-১৯৮৪ পর্যন্ত জেলা প্রশাসকের দায়িত্ত পালন করেন।");
        arrayList.add(hashMap);

    }
}