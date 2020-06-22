package com.example.recyclerview.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerview.R;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final String TAG = "RVAdapter";
private Context context;

private  ArrayList<String> imageNames= new ArrayList<>();
private  ArrayList<String> imageNames2= new ArrayList<>();
private  ArrayList<String> imagesURI= new ArrayList<>();
private  ArrayList<String> imagesURI2= new ArrayList<>();
    public RVAdapter(Context context, ArrayList<String> imageNames, ArrayList<String> imagesURI) {
        this.context=context;

        this.imageNames=imageNames;
        this.imagesURI=imagesURI;

        this.imageNames2=imageNames2;
       this.imagesURI2 = imagesURI2;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rl_list_item,viewGroup,false);
        ViewHolder vHolder = new ViewHolder(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.setOnClickListener();

        String URI = "https://i.imgur.com/";
        Glide.with(context)

                .asBitmap()
                .load(URI + imagesURI.get(position) + ".png")
                .into(holder.getCircleImage());
        holder.getTvImage().setText(imageNames.get(position));

        holder.getRlContainer().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Clicked on: " + imageNames.get(position));
                Toast.makeText(context, imageNames.get(position) + " :D ", Toast.LENGTH_LONG).show();
            }


        });


    }
    @Override
    public int getItemCount() {
        return imageNames.size();
    }


}


