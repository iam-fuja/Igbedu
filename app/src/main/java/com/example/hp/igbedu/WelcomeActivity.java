package com.example.hp.igbedu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2);
        //casts TextView into objects
        TextView library = (TextView) findViewById(R.id.library);
        TextView playing = (TextView) findViewById(R.id.playing);
        //sets onClickListener on  Textview Objects to push into Intent
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(WelcomeActivity.this, IgbeduLibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(WelcomeActivity.this, NowPlayingActivity.class);
                startActivity(playingIntent);
            }
        });
    }
}
