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

public class Mymensingh extends AppCompatActivity {

    TextView textMarque,callNumber1,callNumber2,callNumber3;

    ImageView callButton1,callButton2,callButton3;

    GridView mymensinghGridView;

    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensingh);

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

        mymensinghGridView = findViewById(R.id.mymensinghGridView);

        mymensinghDisTable();

        MyMymensingh myMymensingh = new MyMymensingh();
        mymensinghGridView.setAdapter(myMymensingh);



    }

    private class MyMymensingh extends BaseAdapter{

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
                    if (districtName.contains("Sherpur")){

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(Mymensingh.this, PoliceInformationDetail.class));
                    }
                    else if (districtName.contains("Mymensingh")) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(Mymensingh.this, PoliceInformationDetail.class));
                    }
                    else if (districtName.contains("Jamalpur")) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(Mymensingh.this, PoliceInformationDetail.class));
                    }
                    else if ( districtName.contains("Netrokona") ) {

                        PoliceInformationDetail.POLICE_Number = policeCall;
                        PoliceInformationDetail.HISTORY = history;
                        PoliceInformationDetail.POLICE_STATION_NAME = policeStationName;

                        startActivity(new Intent(Mymensingh.this, PoliceInformationDetail.class));

                    }
                }
            });

            return myView;
        }
    }

    private  void mymensinghDisTable(){

        hashMap = new HashMap<>();
        hashMap.put("districtName","Sherpur");
        hashMap.put("policeCall","Sherpur");
        hashMap.put("policeStationName","Sherpur Police Station");
        hashMap.put("history","শেরপুরের ঐতিহাসিক পটভূমি\n" +
                "\n" +
                "শেরপুরের পূর্ব কথার কিছু উল্লেখ না করলে অনেক জানার বিষয় অজানাই থেকে যাবে। কাজেই অতি সংক্ষেপে তার বর্ণনা দেয়া হল। প্রাচীন কামরুপ রাজ্যের দক্ষিণ-পশ্চিম সীমান্ত অঞ্চলের আদি নাম পাওয়া যায় না। তবে এ অঞ্চলের হিন্দু শাসক দলিপ সামন্তের রাজ্যের রাজধানী গড় জরিপার উল্লেখ আছে। সম্রাট আকবরের সময় এ অঞ্চলের নাম দশ কাহনীয়া বাজু বলে ইতিহাসে পাওয়া যায়। শেরপুর পৌরসভার দক্ষিণ সীমান্তে মৃগী নদী হতে জামালপুর ঘাট পর্যন্ত প্রায় ৮/৯ মাইল প্রশস্ত ব্রহ্মপুত্র নদের পূর্ব নাম ছিল লৌহিত্য সাগর। নদের উভয় পাড়ের নিকটবর্তী লোকদের প্রায় সময়ই নৌকায় যাতায়াত করতে হত। তারা খেয়া ঘাটের ইজারাদারের সহিত যাতায়াত মাশুল হিসবে বাৎসরিক চুক্তি অনুযায়ী ১০(দশ) কাহন কড়ি প্রদান করত। সে হিসেবেই এ অঞ্চলের নাম হয় দশকাহনীয়া। তৎকালে কড়ির মাধ্যমে বেচা-কেনা বা আর্থিক লেনদেন করা হত।\n" +
                "\n" +
                "বাংলার নবাবী আমলে গাজী বংশের শেষ জমিদার শের আলী গাজী দশ কাহনিয়া অঞ্চল দখল করে স্বাধীনভাবে রাজত্ব করেন। এই শেরআলী গাজীর নামে দশ কাহনিয়ার নাম হয় শেরপুর। তখনও শেরপুর রাজ্যের রাজধানী ছিল গড়জরিপা। বর্তমান গাজীর খামার ইউনিয়নের গিদ্দা পাড়ায় ফকির বাড়ীতে শের আলী গাজীর মাজার এবং নকলা উপজেলার রুনী গাঁয়ে গাজীর দরগাহ অবস্থিত । বৃটিশ আমলে এবং পাকিস্তান আমলে নাম হয় শেরপুর সার্কেল। বাংলাদেশ স্বাধীন হওয়ার পর তৎকালীন রাষ্ট্রপতি জাতির জনক বঙ্গবন্ধু শেখ মুজিবুর রহমান শেরপুরকে ৬১ তম জেলা ঘোষণা করেন। কিন্তু রাজনৈতিক পট পরিবর্তনে তা স্থগিত হয়ে যায়। ১৯৭৯ সালে রাষ্ট্রপতি জিয়াউর রহমান শেরপুরকে মহকুমা, ১৯৮৪ সালে রাষ্ট্রপতি এরশাদ শেরপুরকে জেলায় উন্নীত করে জেলার ৫ টি থানাকে উপজেলায় রূপান্তর করেন। জমিদারী আমলে ১৮৬৯ সালে শেরপুর পৌরসভা স্থাপিত হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Mymensingh");
        hashMap.put("policeCall","Mymensingh");
        hashMap.put("policeStationName","Mymensingh Police Station");
        hashMap.put("history","জেলার পটভূমি\n" +
                "হাওর জঙ্গল মইষের শিং, এই তিনে ময়মনসিং’ প্রবাদ-প্রবচনে এভাবেই পরিচয় করানো হতো এক সময় ভারতবর্ষের বৃহত্তম জেলা ময়মনসিংহকে। ভারতবর্ষের সেই বৃহত্তম জেলা সময়ের বিবর্তনে ছয় জেলায় রূপান্তরিত হলেও জেলা সদরের গুরুত্ব তুলনামূলক বিচারে কমে যায় নি। বাংলাদেশের মানচিত্রে যে জেলাটি আজ ময়মনসিংহ জেলা হিসাবে চিহ্নিত তা বাংলাদেশের মধ্য-উত্তরাঞ্চলের ২৪০০২'৩১\" থেকে ২৫০২৫'৫৬\" উত্তর অক্ষাংশ এবং ৮৯০৩৯'০০\" থেকে ৯১০১৫'৩৫\" পূর্ব দ্রাঘিমাংশে অবস্থিত। ব্রহ্মপুত্র বিধৌত বাংলাদেশের এই উর্বর ভূমি শিক্ষা-শিল্প-সাহিত্য ও লোক-সংস্কৃতির এক বিপুল আধার।\n" +
                "\n" +
                "ময়মনসিংহের ইতিহাস অতিশয় সমৃদ্ধ। উত্তরে গারো পাহাড়, দক্ষিণে ভাওয়াল মধুপুরের বনাঞ্চল, পশ্চিমে ব্রহ্মপুত্র নদ থেকে উৎসারিত মেঘনার জল বেষ্টনী এবং পূর্বে সোমেশ্বরী তিতাস, সুরমা ও মেঘনা নদীর অববাহিকা অঞ্চল, প্রাকৃতিক প্রাচীর দ্বারা পরিবেষ্টিত এই অঞ্চলকে বরাবরই একটি দুর্জেয় অঞ্চল হিসেবে দেখতে পাওয়া যেত। আধুনিক ঐতিহাসিকগণ একমত পোষণ করেন যে, বৃহত্তর ঢাকা ও ময়মনসিংহ জেলা নিয়ে গঠিত ছিল প্রাচীন বংগরাজ্য। গোড়ার দিকে ময়মনসিংহ জেলার মধুপুর গড়সহ লালমাটির অঞ্চল নিয়ে গঠিত ছিল প্রাচীন বংগরাজ্য। হিন্দু রাজাগণের মৌর্য শাসন এর প্রতিষ্ঠা ও পরবর্তী সময় গুপ্ত ও পাল শাসকদের ইতিহাস ময়মনসিংহকে ঘিরে রেখেছে। শেষের দিকে সেন বংশীয় রাজাদের প্রশাসনিক দৌর্বল্যে মুসলমান বাদশাহগণ বাংলায় রাজত্ব কায়েমের প্রভাব ময়মনসিংহেও পড়ে। সিকান্দর শাহ-এর আমল থেকে মোঘল সাম্রাজ্য পেরিয়ে নবাবী আমল, কোম্পানী আমল এবং শেষে পাকিস্তানি শাসন-শোষণে ময়মনসিংহও প্রভাবান্বিত হয়। বিভিন্ন সূত্রে ময়মনসিংহ অঞ্চলে ৩৯টি পরগনার নাম পাওয়া যায়- ময়মনসিংহ, আলাপসিংহ, জাফরশাহী, বনভাওয়াল, পুথুরিয়া, কাগমারী, আন্টীয়া, বড় বাজু, সেরপুর, হাজবাদি, খালিয়াজুরী, জয়নশাহী, কুড়ি খাই, নছরৎশাহী, লতিফপুর, মকিমাবাদ, আটগাও, বলরামপুর, বরিকান্দি, বাউ খন্দ, চন্দ্রপ্রতাপ, ঈদগা, ইছকাবাদ, বায় দোম, সিংধা দরজিবাজ, কাসেমপুর, নিক্লী, সাসরদি, হাউলী, জকুজিয়াল, ইছাপুর, বরদাখতি, পাতিলা দহ, তুলন্দর, ইছপসাহী, হোসেন শাহী, হোসেনপুর, সুসঙ্গ ও নাসিরুর্জিয়াল।\n" +
                "\n" +
                "জেলার নাম ময়মনসিংহ নিয়ে ইতিহাসবিদদের মাঝে ভিন্ন মত প্রচলিত আছে। আর ষোড়শ শতাব্দীতে বাংলার স্বাধীন সুলতান সৈয়দ আলাউদ্দিন হোসেন শাহ তাঁর পুত্র সৈয়দ নাসির উদ্দিন নসরত শাহ’র জন্য এ অঞ্চলে একটি নতুন রাজ্য গঠন করেছিলেন, সেই থেকেই নসরতশাহী বা নাসিরাবাদ নামের সৃষ্টি। সলিম যুগের উৎস হিসেবে নাসিরাবাদ, নামটিও আজও শিক্ষা প্রতিষ্ঠান ছাড়া আর কোথাও উল্লেখ করা হচ্ছে না। ১৭৭৯-তে প্রকাশিত রেনেল এর ম্যাপে মোমেসিং নামটি বর্তমান ’ময়মনসিংহ’ অঞ্চলকেই নির্দেশ করে। তার আগে আইন-ই-আকবরীতে ‘মিহমানশাহী’ এবং ‘মনমনিসিংহ’ সরকার বাজুহার পরগনা হিসাবে লিখিত আছে; যা বর্তমান ময়মনসিংহকেই ধরা যায়। এসব বিবেচনায় বলা যায় সম্রাট আকবরের রাজত্ব কালের পূর্ব থেকেই ময়মনসিংহ নামটি প্রচলিত ছিলো। জেলা পত্তন কালে ময়মনসিংহ অঞ্চলের সমৃদ্ধ জমিদারগণ সরকারের কাছে জেলার নাম ময়মনসিংহ রাখার আবেদন করলে সরকার তা গ্রহণ করে নেন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Jamalpur");
        hashMap.put("policeCall","Jamalpur");
        hashMap.put("policeStationName","Jamalpur Police Station");
        hashMap.put("history","জেলার পটভূমি\n" +
                "জামালপুর জেলার ইতিহাস সম্পর্কে সঠিকভাবে ধারণা পেতে হলে প্রখ্যাত আউলিয়া হযরত শাহ জামাল (র:) ও হযরত শাহ কামাল (র:) এ দুই বুজুর্গ ব্যক্তির নাম স্মরণ করতে হয়। ইসলাম তথা মানবতার বাণী প্রচারের জন্য হযরত শাহ জামাল (র:) দিল্লীর বাদশাহ আকবরের সময়কালে সুদূর ইয়েমেন দেশ থেকে ইসলাম প্রচারের জন্য জামালপুরে তশরিফ রাখেন। জামালপুর শহরের আদি নাম সিংহজানী। হযরত শাহ জামালের (র:) নামে কোন মৌজা, গ্রাম হাট-বাজার কিছুই নেই।  আমাদের পরম সৌভাগ্য যে এ পূণ্যবান ব্যক্তির মাজার শরীফ জামালপুর শহরে অবস্থিত। তাঁর পবিত্র নামেই এ জেলার নামকরণ করা হয়েছে");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("districtName","Netrokona");
        hashMap.put("policeCall","Netrokona");
        hashMap.put("policeStationName","Netrokona Police Station");
        hashMap.put("history","নেত্রকোণা জেলার ইতিহাস ও ঐতিহ্যঃ\n" +
                "\n" +
                "ব্রহ্মপুত্র নদের পূর্বাঞ্চলে অবস্থিত নেত্রকোণা জেলার ইতিহাস প্রাচীন ঐতিহ্যে টই-টুম্বুর ও  ঐতিহ্যের বিচিত্র ঘটনা সম্ভারে গর্বিত। বিভিন্ন তাত্ত্বিক পর্যালোচনায় স্পষ্টতঃ প্রমাণ করে যে সাগর বা সমুদ্রগর্ভ থেকে জেগে ওঠায় এ অঞ্চলটি মানব বসবাসের যোগ্য ভূমিতে পরিণত হয়েছিল। গারো পাহাড়ের পাদদেশ লেহন করে এঁকেবেঁকে কংস, সোমেশ্বরী, গণেশ্বরী, মহেশ্বরী, গোরাউৎরা নদীসহ অন্যান্য শাখা নদী নিয়ে বর্তমান নেত্রকোণা জেলার জলধারার উদ্ভব। এ জেলার প্রত্যেক নদীই জেলার দক্ষিণ-পূর্ব দিকে প্রবাহিত। ফলে সমগ্র জেলার ভূমি উত্তরাংশে উঁচু এবং ক্রমে দক্ষিণ-পূর্বাংশে ঢালু।\n" +
                "\n" +
                "খ্রিস্টীয় চতুর্থ শতাব্দীতে এ অঞ্চল গুপ্ত সম্রাটগণের অধীন ছিল। ইতিহাস পাঠে জানা যায়, গুপ্তযুগে সমুদ্রগুপ্তের অধীনস্থ এ অঞ্চলসহ পশ্চিম ময়মনসিংহ কামরূপ রাজ্যের অন্তর্গত ছিল। ৬২৯ খ্রিস্টাব্দে হিন্দুরাজ শশাংকের আমন্ত্রণে চৈনিক পরিব্রাজক হিউ এন সাঙ যখন কামরূপ অঞ্চলে আসেন, তখন পর্যন্ত নারায়ণ বংশীয় ব্রাহ্মণ কুমার ভাস্কর বর্মণ কর্তৃক কামরূপ রাজ্য পরিচালিত ছিল। খ্রিস্টীয় ত্রয়োদশ শতাব্দীর শেষভাগে পূর্ব ময়মনসিংহের উত্তরাংশে পাহার মুল্লুকে বৈশ্যগারো ও দুর্গাগারো তাদের মনগড়া রাজত্ব পরিচালনা করতো। ত্রয়োদশ শতাব্দীর শেষ দিকে জনৈক মুসলিম শাসক পূর্ব ময়মনসিংহ অঞ্চল আক্রমণ করে অল্প কিছুদিনের জন্য মুসলিম শাসন প্রতিষ্ঠা করতে সক্ষম হয়। অতঃপর চতুর্দশ শতাব্দীতে জিতারা নামক জনৈক সন্ন্যাসী কর্তৃক কামরূপের তৎকালীন রাজধানী ভাটী অঞ্চল আক্রান্ত ও অধিকৃত হয়। সে সময় পর্যন্তও মুসলিম শাসক ও অধিবাসী স্থায়ীভাবে অত্রাঞ্চলে অবস্থান ও শাসন করতে পারেনি। খ্রিস্টীয় পঞ্চদশ শতাব্দীর শেষভাগে আলাউদ্দিন হোসেন শাহের শাসনামলে (১৪৯৩-১৫১৯) সমগ্র ময়মনসিংহ অঞ্চল মুসলিম রাজত্বের অন্তর্ভূক্ত হয়।");
        arrayList.add(hashMap);



    }
}