package com.example.kazukoba.jsonimportlistviewsample2;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    List<Map<String, String>> contactlist = new ArrayList<Map<String, String>>();

    String[] names = { "Google", "Yahoo", "SAK" };

    final String[] urls = { "http://www.google.com", "http://yahoo.co.jp",
            "http://www.networkacademy.jp/" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < names.length; i++) {

            Map<String, String> conMap = new HashMap<String, String>();

            conMap.put("Name", names[i]);

            conMap.put("URL", urls[i]);

            contactlist.add(conMap);

        }

        SimpleAdapter adapter = new SimpleAdapter(this, contactlist,

                android.R.layout.simple_list_item_2, new String[] { "Name",

                "URL" }, new int[] { android.R.id.text1,

                android.R.id.text2 });

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);
    }
}
