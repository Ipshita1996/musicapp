package com.android.ipshita.musicapp;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class nowplaying extends AppCompatActivity {


    String url = "https://cld.pt/dl/download/5e286a06-3c2a-4eb5-ad41-d56979d9e228/Dont%20Let%20Me%20Down%20(feat.%20Daya).mp3"; // your URL here
    MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowplaying);

        Button play=(Button)findViewById(R.id.play);
        Button pause=(Button)findViewById(R.id.pause);


        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (getIntent().getBooleanExtra("EXIT", false))
        {
            mediaPlayer.release();
            mediaPlayer = null;
        }

    }
    public void onPause(){
        mediaPlayer.release();
        mediaPlayer = null;
        super.onPause();

    }
    public void playsong(View view){
        mediaPlayer.start();
    }
    public void pausesong(View view){
        mediaPlayer.pause();
    }

}

