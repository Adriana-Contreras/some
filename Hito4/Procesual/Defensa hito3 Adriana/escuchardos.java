package com.example.recyclerview.Adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.R;

import java.util.ArrayList;
import java.util.Arrays;

public class escuchardos extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RVAdapterdos rvAdapterdos;

    private ArrayList<String> imagesStopURL = new ArrayList<>();
    private ArrayList<String> imagesPauseURL = new ArrayList<>();
    private ArrayList<String> imagesPlayURL = new ArrayList<>();
    private ArrayList<String> imagesName2 = new ArrayList<>();

    private final String  imgplay = "59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq";
    private final String imgpause = "2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ";
    private final String imgstop ="LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe";
    private final String imgNam2 = "music 1,music 2,music 3,music 4,music 5,music 6,music 7,music 8,music 9,music 10,music 11,music 12";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escuchardos);
        initImageBitMaps();
        initRecyclerView();

    }

    public void initRecyclerView() {

        recyclerView= findViewById(R.id.rvContainerR);
        rvAdapterdos = new RVAdapterdos(this, imagesName2,imagesPlayURL,imagesPauseURL,imagesStopURL);
        recyclerView.setAdapter(rvAdapterdos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    public void initImageBitMaps() {
        imagesPlayURL.addAll(Arrays.asList(imgplay.split(",")));
        imagesPauseURL.addAll(Arrays.asList(imgpause.split(",")));
        imagesStopURL.addAll(Arrays.asList(imgstop.split(",")));
        imagesName2.addAll(Arrays.asList(imgNam2.split(",")));

    }

}
