package com.example.recyclerview.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.recyclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;


public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

   Context context;

    private RelativeLayout rlContainer;
    private RelativeLayout rlContainer2;
    private CircleImageView circleImage;
    private TextView tvImage;
   private ImageView imgPlay, imgPause, imgStop;
    private Button btnescuchar, btnescucharPremium;

    public ViewHolder(View itemView) {
        super(itemView);
        initComponents(itemView);
    }

    private void initComponents(View itemView) {

        context = itemView.getContext();
        rlContainer = itemView.findViewById(R.id.rlListItem);
        circleImage = itemView.findViewById(R.id.civItem);
        tvImage = itemView.findViewById(R.id.tvImage);

        btnescucharPremium = itemView.findViewById(R.id.btnEscucharPremium2);
        btnescuchar = itemView.findViewById(R.id.btnEscuchar1);




        rlContainer2 = itemView.findViewById(R.id.rlListItem);
        imgPlay= itemView.findViewById(R.id.imgPlay1);
        imgPause= itemView.findViewById(R.id.imgPause1);
        imgStop= itemView.findViewById(R.id.imgStop1);




    }
//        btnescuchar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                        Intent intent = new Intent(getItemViewType(),Escuchar.class);
//
//
//    }

    void setOnClickListener(){
        btnescuchar.setOnClickListener(this);
        btnescucharPremium.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEscuchar1:
                Intent intent = new Intent(context, escuchardos.class);
                context.startActivity(intent);
                break;
            case R.id.btnEscucharPremium2:
                Intent intent2 = new Intent(context, escuchardos.class);
                context.startActivity(intent2);

                break;

        }

    }



    public RelativeLayout getRlContainer () {


            return rlContainer;
        }

        public CircleImageView getCircleImage () {
            return circleImage;
        }

        public TextView getTvImage () {
            return tvImage;
        }


}
