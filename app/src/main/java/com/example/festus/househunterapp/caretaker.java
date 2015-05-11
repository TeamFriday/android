package com.example.festus.househunterapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Caretaker extends RecyclerView.Adapter<Caretaker.ViewHolder> {

        List<Listings>mItems;
        public Caretaker (){

            super();
            mItems = new ArrayList<Listings>();
            Listings property= new Listings();
            property.setName("3 bedroomed apartment");
            property.setThumbnail(R.drawable.img1);
            mItems.add(property);

            property= new Listings();
            property.setName("2 bedroomed apartment");
            property.setThumbnail(R.drawable.img2);
            mItems.add(property);

            property= new Listings();
            property.setName("3 bedroomed apartment");
            property.setThumbnail(R.drawable.img3);
            mItems.add(property);

            property= new Listings();
            property.setName("4 bedroomed apartment");
            property.setThumbnail(R.drawable.img4);
            mItems.add(property);

            property= new Listings();
            property.setName("4 bedroomed apartment");
            property.setThumbnail(R.drawable.img5);
            mItems.add(property);
    }

    @Override
    public Caretaker.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_caretaker, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(Caretaker.ViewHolder holder, int i) {

        Listings property = mItems.get(i);
        holder.listingHouses.setText(property.getName());
        holder.imgThumbnail.setImageResource(property.getThumbnail());

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgThumbnail;
        public TextView  listingHouses;

        public ViewHolder(View itemView) {
            super(itemView);

            imgThumbnail = (ImageView)itemView.findViewById(R.id.imgvl);
            listingHouses = (TextView)itemView.findViewById(R.id.textview13);
        }
    }
}
