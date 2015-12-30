package com.manikandansethuraj.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity
        implements View.OnClickListener{

    private String GOOGLE_API_KEY = "AIzaSyC_VvdBfMTB7Tg_gSAAWXeqVeHbKj7RWBY";
    private String YOUTUBE_PLAYLIST_MY_FAV = "LLIQBd4tvpYoSqrTdIluHAUA";
    private String YOUTUBE_PLAYLIST_FOOTBALL = "PLMC9KNkIncKtPzgY-5rmhvj7fax8fdxoj";
    private String YOUTUBE_PLAYLIST_CRICKET = "PLtineFwLo0jc_RT2VEtwSYP48796yAUep";
    private String YOUTUBE_PLAYLIST_BEST_OF_2015 = "PLvFYFNbi-IBFeP5ALr50hoOmKiYRMvzUq";
    private String YOUTUBE_PLAYLIST_TRAILERS = "PLScC8g4bqD47c-qHlsfhGH3j6Bg7jzFy-";
    private String YOUTUBE_PLAYLIST_TECHNOLOGY = "PLNyYK0P0pNzvlE4Ph3SLrNHqhgLn4drTZ";
    private ImageButton btnPlayMyFav;
    private ImageButton btnPlayCricket;
    private ImageButton btnPlayFootball;
    private ImageButton btnPlayBestOf2015;
    private ImageButton btnPlayTrailers;
    private ImageButton btnPlayTechnology;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        btnPlayMyFav = (ImageButton) findViewById(R.id.btnPlayMyFav);
        btnPlayCricket = (ImageButton) findViewById(R.id.btnPlayCricket);
        btnPlayBestOf2015 = (ImageButton) findViewById(R.id.btnPlayPlayBestOf2015);
        btnPlayFootball = (ImageButton) findViewById(R.id.btnPlayFootball);
        btnPlayTechnology = (ImageButton) findViewById(R.id.btnPlayTech);
        btnPlayTrailers = (ImageButton) findViewById(R.id.btnPlayTrailers);

        btnPlayCricket.setOnClickListener(this);
        btnPlayMyFav.setOnClickListener(this);
        btnPlayTrailers.setOnClickListener(this);
        btnPlayBestOf2015.setOnClickListener(this);
        btnPlayTechnology.setOnClickListener(this);
        btnPlayFootball.setOnClickListener(this);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btnPlayCricket:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST_CRICKET);
                break;
            case R.id.btnPlayMyFav:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST_MY_FAV);
                break;
            case  R.id.btnPlayFootball:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST_FOOTBALL);
                break;
            case  R.id.btnPlayPlayBestOf2015:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST_BEST_OF_2015);
                break;
            case  R.id.btnPlayTech:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST_TECHNOLOGY);
                break;
            case  R.id.btnPlayTrailers:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST_TRAILERS);
                break;
            default:

        }

        if (intent != null){
            startActivity(intent);
        }

    }
}