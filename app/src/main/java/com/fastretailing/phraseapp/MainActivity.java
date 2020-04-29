package com.fastretailing.phraseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mPlayer;

    public void phrase(View view) {
        Button button = (Button) view;
        Log.i("info", button.getTag().toString());

        mPlayer = MediaPlayer.create(this, getResources().getIdentifier(button.getTag().toString(), "raw", getPackageName()));
        mPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
