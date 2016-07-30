package com.android.ipshita.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView browse=(TextView)findViewById(R.id.browsemore);
        LinearLayout chainsmokers=(LinearLayout)findViewById(R.id.chainsmokers);
        LinearLayout cheapthrills=(LinearLayout)findViewById(R.id.cheapthrills);

        assert browse != null;
        browse.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, browse_more.class);
                startActivity(numbersIntent);
            }
        });


        assert chainsmokers!=null;
        chainsmokers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, nowplaying.class);
                startActivity(numbersIntent);
            }
        });
        assert cheapthrills!=null;
        cheapthrills.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, nowplayingcheapthrills.class);
                startActivity(numbersIntent);
            }
        });

    }
}
