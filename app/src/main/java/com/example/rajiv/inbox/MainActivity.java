package com.example.rajiv.inbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
   LinearLayoutManager manage;
    GridAdapter adapter;

    String name[]={"Mont","rid","har","Ram","sid","sam","james","jarry"};
    String sub[]={"Hi","meeting","Materials","shootout","mall","meetup","meet","study"};
    String body[]={"long time","At 1030?","Bringing it to..","shot at 1045..","are you ..","will thecc..","is it..","I have.."};
    String time[]={"2h","3h","2h","7h","2h","2h","2h","2h"};
    int img[]={R.drawable.ima1,R.drawable.index,R.drawable.index,R.drawable.index,R.drawable.ima1,R.drawable.ima1,R.drawable.ima1,R.drawable.ima1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manage=new LinearLayoutManager(this);
        adapter=new GridAdapter(this,name,sub,body,time,8,img);//no of iems is the arguement
        recycler= (RecyclerView) findViewById(R.id.recy);
        recycler.setLayoutManager(manage);
        recycler.setAdapter(adapter);
        recycler.addOnItemTouchListener(
                new RecyclerItemClickListener(this.getApplicationContext(), recycler ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        //body[position] is the body of mail in that clicked position

                        // do whatever
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );
    }
}
