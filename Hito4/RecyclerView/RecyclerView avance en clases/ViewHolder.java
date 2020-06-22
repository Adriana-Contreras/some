package com.example.reciclerview.adapter;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.reciclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder {

     private RelativeLayout rlContainer;


    private CircleImageView circleImage;
      private TextView tvImage;

      public ViewHolder(View itemView){
          super(itemView);
          intiComponentes(itemView);
      }
      public void intiComponentes(View itemView){
         rlContainer= itemView.findViewById(R.id.rlListItem);
         circleImage= itemView.findViewById(R.id.civItem);
         tvImage= itemView.findViewById(R.id.tv1);
    }
    public CircleImageView getCircleImage() {
        return circleImage;
    }

    public RelativeLayout getRlContainer() {
        return rlContainer;
    }

    public TextView getTvImage() {
        return tvImage;
    }
}
