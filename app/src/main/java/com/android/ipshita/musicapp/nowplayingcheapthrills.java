package com.android.ipshita.musicapp;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class nowplayingcheapthrills extends AppCompatActivity {
    String url = "http://h.saavncdn.com/203/SONY_886445602203_01_006.mp3"; // your URL here
    MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowplayingcheapthrills);


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
