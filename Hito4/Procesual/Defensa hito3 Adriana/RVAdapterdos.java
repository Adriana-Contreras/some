package com.example.recyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerview.R;

import java.util.ArrayList;

public class RVAdapterdos extends RecyclerView.Adapter<ViewHolderdos> {

    private static final String TAG = "RVAdapterdos";
    private Context context;

    private ArrayList<String> imagesStopURL = new ArrayList<>();
    private ArrayList<String> imagesPauseURL = new ArrayList<>();
    private ArrayList<String> imagesPlayURL = new ArrayList<>();
    private ArrayList<String> imagesName2 = new ArrayList<>();


    public RVAdapterdos(Context context, ArrayList<String> imageNames2, ArrayList<String> imagesPlayURL,ArrayList<String> imagesPauseURL,ArrayList<String> imagesStopURL )  {
        this.context = context;
      this.imagesName2 = imageNames2;
      this.imagesPlayURL = imagesPlayURL;
      this.imagesPauseURL = imagesPauseURL;
      this. imagesStopURL= imagesStopURL;

    }

    @Override
    public ViewHolderdos onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rl_listen_dos,viewGroup,false);
        ViewHolderdos vHolder= new ViewHolderdos(view);
        return vHolder;

    }

    @Override
    public void onBindViewHolder( final ViewHolderdos holder, int position) {
        String URI = "https://i.imgur.com/";
        Glide.with(context)
                .asBitmap()
                .load(URI + imagesPlayURL.get(position) + ".png")
                .into(holder.getImgPlay());
        holder.getTvImage1().setText(imagesName2.get(position));



        Glide.with(context)
                .asBitmap()
                .load(URI + imagesPauseURL.get(position) + ".png")
                .into(holder.getImgPause());




        Glide.with(context)
                .asBitmap()
                .load(URI + imagesStopURL.get(position) + ".png")//aqui le paso carga desde una url internet
                .into(holder.getImgStop());





        holder.getImgPlay().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               holder.getImgPlay().setVisibility(View.INVISIBLE);
               holder.getImgPause().setVisibility(View.VISIBLE);
                Toast.makeText(context,"play music",Toast.LENGTH_SHORT).show();
            }
        });


        holder.getImgPause().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               holder.getImgPause().setVisibility(View.INVISIBLE);
               holder.getImgPlay().setVisibility(View.VISIBLE);

                Toast.makeText(context,"pause music",Toast.LENGTH_SHORT).show();
            }
        });


        holder.getImgStop().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context,"stop music",Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public int getItemCount() {
        return imagesName2.size();
    }


}
