package com.example.hp.igbedu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //casts TextViews into objects
        TextView welcome =  findViewById(R.id.welcome);
        TextView library =  findViewById(R.id.library);
        TextView playing =  findViewById(R.id.playing);


        //sets onClickListener on  Textview Objects to push into Intent
        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent welcomeIntent = new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(welcomeIntent);
            }
        });

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(MainActivity.this, IgbeduLibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(playingIntent);
            }
        });

    }


}
