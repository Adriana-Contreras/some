package com.example.recyclerview.Adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

public class ViewHolderdos  extends RecyclerView.ViewHolder{

    Context context;



    private RelativeLayout rlContainer;
    private ImageView imgPlay, imgPause, imgStop;
    private TextView tvImage1;

    public ViewHolderdos(@NonNull View itemView) {
        super(itemView);
        initComponents(itemView);
    }
    private void initComponents(View itemView) {

        context = itemView.getContext();
        rlContainer = itemView.findViewById(R.id.rlListItem1);

        tvImage1 = itemView.findViewById(R.id.tvImage2);
        imgPlay= itemView.findViewById(R.id.imgPlay1);
        imgPause= itemView.findViewById(R.id.imgPause1);
        imgStop= itemView.findViewById(R.id.imgStop1);

    }
    public Context getContext() {
        return context;
    }

    public RelativeLayout getRlContainer() {
        return rlContainer;
    }

    public ImageView getImgPlay() {
        return imgPlay;
    }

    public ImageView getImgPause() {
        return imgPause;
    }

    public ImageView getImgStop() {
        return imgStop;
    }

    public TextView getTvImage1() {
        return tvImage1;
    }
}
