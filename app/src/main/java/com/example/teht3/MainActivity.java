package com.example.teht3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> list = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnAddClick (View view) {
        Date currentTime = Calendar.getInstance().getTime();
        String timetxt = currentTime.toString();
        list.add(timetxt);

        //instantiate custom adapter
        Adapter adapteri = new Adapter(list, this);

        //handle listview and assign adapter
        ListView lView = (ListView)findViewById(R.id.listview1);
        lView.setAdapter(adapteri);
    }
}
