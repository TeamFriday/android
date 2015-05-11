package com.example.festus.househunterapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class PropertyAgent extends ActionBarActivity {
    private RecyclerView recyclerview;
    private ArrayList<MyProperties> myproperties;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_agent);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);

        Button button;
        button= (Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(PropertyAgent.this,Addlistings.class);
                startActivity(in);
                finish();
            }
        });

        recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(linearLayoutManager);
        initializeData();
        initializeAdapter();
    }


    private void initializeData() {
        myproperties = new ArrayList<>();
        myproperties.add(new com.example.festus.househunterapp.MyProperties("Tyson propertie", R.drawable.img1));
        myproperties.add(new com.example.festus.househunterapp.MyProperties("kirichwa heights",  R.drawable.img2));
        myproperties.add(new com.example.festus.househunterapp.MyProperties("moringa heihts", R.drawable.img3));
        myproperties.add(new com.example.festus.househunterapp.MyProperties("lare properties",  R.drawable.img4));
        myproperties.add(new com.example.festus.househunterapp.MyProperties("wa mathu investments",  R.drawable.img5));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_property_agent, menu);
        return true;
    }

    public void initializeAdapter() {

    }

    class RAdapter extends RecyclerView.Adapter<PViewHolder> {

        @Override
        public PViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_caretaker, viewGroup, false);
            PViewHolder pvh = new PViewHolder(v);
            return pvh;
        }

        @Override
        public void onBindViewHolder(PViewHolder holder, int i) {
            holder.loct.setText(myproperties.get(i).title);

            holder.imgt.setImageResource(myproperties.get(i).imagId);
        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

    private class PViewHolder extends RecyclerView.ViewHolder {
        CardView card;
        TextView loct;
        ImageView imgt;
        public PViewHolder(View itemView) {
            super(itemView);
            card =(CardView)findViewById(R.id.card);
            loct = (TextView)findViewById(R.id.textview13);
            imgt = (ImageView)findViewById(R.id.imgvl);
        }
    }
}





