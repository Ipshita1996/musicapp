package com.android.ipshita.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class    browse_more extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_more);

        RelativeLayout chainsmokers=(RelativeLayout)findViewById(R.id.chainsmokers);
        RelativeLayout sia=(RelativeLayout)findViewById(R.id.sia);
        RelativeLayout beiber=(RelativeLayout)findViewById(R.id.beiber);

        assert chainsmokers != null;
        chainsmokers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(browse_more.this, nowplaying.class);
                startActivity(Intent);
            }
        });

        assert sia != null;
        sia.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(browse_more.this, nowplayingcheapthrills.class);
                startActivity(Intent);
            }
        });

        assert beiber != null;
        beiber.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(browse_more.this, nowplayingwhereareyounow.class);
                startActivity(Intent);
            }
        });
    }
}
