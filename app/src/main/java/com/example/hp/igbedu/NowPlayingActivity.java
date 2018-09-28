package com.example.hp.igbedu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        //casts TextView into objects
        TextView welcome =  findViewById(R.id.welcome);
        TextView library =  findViewById(R.id.library);
        //sets onClickListener on  Textview Objects to push into Intent
        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent welcomeIntent = new Intent(NowPlayingActivity.this, WelcomeActivity.class);
                startActivity(welcomeIntent);
            }
        });

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(NowPlayingActivity.this, IgbeduLibraryActivity.class);
                startActivity(libraryIntent);
            }
        });
    }
}
