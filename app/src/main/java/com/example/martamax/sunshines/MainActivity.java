package com.example.martamax.sunshines;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayList<String> sunShine = new ArrayList<>();
        for (int i = 0; i < 100500; i++) {
            sunShine.add("Monday 7C cloudy");
            sunShine.add("Tuesday -3C snow");
            sunShine.add("Wednesday 0C rainy");
            sunShine.add("Thursday -12C snow");
            sunShine.add("Friday +3C shine");
        }
//        ListAdapter adapter = new ArrayAdapter<>(this, R.layout.list_item, sunShine);
        ListAdapter adapter = new WeatherAdapter(this, sunShine);
        listView.setAdapter(adapter);

    }
}
