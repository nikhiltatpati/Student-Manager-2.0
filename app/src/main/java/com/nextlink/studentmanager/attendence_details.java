package com.nextlink.studentmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nextlink.studentmanager.Attendence.Attendence_manage;

import java.util.ArrayList;
import java.util.List;

public class attendence_details extends AppCompatActivity {

        List<attmodel> detailList;

        RecyclerView recyclerView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_attendence_details);

            recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            detailsAdapter adapter = new detailsAdapter(this, Attendence_manage.sub_name);

            recyclerView.setAdapter(adapter);
        }
    }
