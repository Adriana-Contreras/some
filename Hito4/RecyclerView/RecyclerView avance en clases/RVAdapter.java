package com.example.reciclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reciclerview.R;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<ViewHolder> {

    private Context  context;
    private ArrayList<String> imageNames = new ArrayList<>();
    private ArrayList<Integer> images = new ArrayList<>();


    public RVAdapter(Context context, ArrayList<String>imageNames,ArrayList<Integer> images){
        this.context = context;
        this.imageNames=  imageNames;
        this.images= images;

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rl_list_item, viewGroup,false);
        ViewHolder vHolder = new ViewHolder(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
