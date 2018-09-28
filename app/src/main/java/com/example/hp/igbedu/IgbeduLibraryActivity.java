package com.example.hp.igbedu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class IgbeduLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_igbedu_library);

      //Array List storing list of songs
        ArrayList<Igbedu> tracks = new ArrayList<Igbedu>(5);
        tracks.add(new Igbedu("Nino", "My Debut", R.drawable.nino_cover, R.drawable.play));
        tracks.add(new Igbedu("Cino", "I'm coming out", R.drawable.cino_cover, R.drawable.play));
        tracks.add(new Igbedu("Nere", "Cool Fella", R.drawable.generic_cover, R.drawable.play));
        tracks.add(new Igbedu("Fuja", "Here I'm", R.drawable.mak, R.drawable.play));
        tracks.add(new Igbedu("Dave Rock", "Popping Stizz", R.drawable.generic_cover, R.drawable.play));

      //cast view from adapter into listview
        IgbeduAdapter adapter = new IgbeduAdapter(this, tracks);
        ListView listView =  findViewById(R.id.list);

      //sets onClickListener on listitem to push into Intent
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long g) {
                Intent nowPlaying = new Intent(getApplicationContext(), NowPlayingActivity.class);
                startActivity(nowPlaying);
            }
        });
    }
}
