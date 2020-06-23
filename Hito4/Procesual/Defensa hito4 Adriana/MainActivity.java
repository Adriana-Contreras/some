package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.recyclerview.Adapter.RVAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RVAdapter rvAdapter;
    private ArrayList<String> imagesName = new ArrayList<>();

    private ArrayList<String> imagesURL = new ArrayList<>();

    private final String imgURL = "V4OgA4O,yB3d2qH,9jMbaX2,rYndmdq,sypYnSP,HBeK1ot,YCqbt8r,eLk31XX,4ZHp7FO,XzffKgy,DJabk5C";
    private final String imgNam = "Playlist 1,Playlist 2 ,Playlist 3,Playlist 4,Playlist 5,Playlist 6, Playlist 7, Playlist 8";

    private Button btnescuchar, btnescucharpremium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitMaps();
        initRecyclerView();
      //  _addClickTextNext();
    }

    public void initImageBitMaps() {


        imagesURL.addAll(Arrays.asList(imgURL.split(",")));
        imagesName.addAll(Arrays.asList(imgNam.split(",")));



    }

    public void initRecyclerView() {

        recyclerView = findViewById(R.id.rvContainer);
        rvAdapter = new RVAdapter(this, imagesName, imagesURL);
        recyclerView.setAdapter(rvAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}