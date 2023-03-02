package com.example.getmovin;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PracticeExercises extends AppCompatActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayerView youTubePlayerView2;
    YouTubePlayerView youTubePlayerView3;
    YouTubePlayerView youTubePlayerView4;
    CardView cardView1;
    CardView cardView2;
    CardView cardView3;
    CardView cardView4;

  public static final String MyPREFERENCES = "CompletedVideoPrefs" ;
    SharedPreferences sharedpreferences;
  SharedPreferences.Editor editor;
  String[] videoIds;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice_activity);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        videoIds = new String[]{"xxzDtLqZBro", "gO74v4VnfX4", "4iugjk9AbN8", "4iugjk9AbN8"};
        youTubePlayerView = findViewById(R.id.youtubePlayer1);
        youTubePlayerView2 = findViewById(R.id.youtubePlayer2);
        youTubePlayerView3 = findViewById(R.id.youtubePlayer3);
        youTubePlayerView4 = findViewById(R.id.youtubePlayer4);
        cardView1 = findViewById(R.id.cardView1);
        cardView2 = findViewById(R.id.cardView2);
        cardView3 = findViewById(R.id.cardView3);
        cardView4 = findViewById(R.id.cardView4);

        editor = sharedpreferences.edit();
        checkVideosVisibility();
        youTubePlayerView.addYouTubePlayerListener(new YouTubePlayerListener() {
          @Override
          public void onReady(@NonNull YouTubePlayer youTubePlayer) {

          }

          @Override
          public void onStateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerState playerState) {
            if(playerState.toString().equals("ENDED"))
            {
              String joined = sharedpreferences.getString("videoIds", "");
              if(joined.isEmpty())
              {
                List<String> list = new ArrayList<String>();
                list.add(videoIds[0]);
                joined = String.join(",", list);
                editor.putString("videoIds", joined);
                editor.apply();
              }
              else {
                List<String> list = new ArrayList<String>(Arrays.asList(joined.split(","))); // convert back to list of strings
                list.add(videoIds[0]);
                joined = String.join(",", list);
                editor.putString("videoIds", joined);
                editor.apply();
              }
              //Intent
              finish();
              Intent intent = new Intent(getApplicationContext(),CompletedExercises.class);
              startActivity(intent);
            }
          }

          @Override
          public void onPlaybackQualityChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlaybackQuality playbackQuality) {

          }

          @Override
          public void onPlaybackRateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlaybackRate playbackRate) {

          }

          @Override
          public void onError(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerError playerError) {

          }

          @Override
          public void onCurrentSecond(@NonNull YouTubePlayer youTubePlayer, float v) {

          }

          @Override
          public void onVideoDuration(@NonNull YouTubePlayer youTubePlayer, float v) {

          }

          @Override
          public void onVideoLoadedFraction(@NonNull YouTubePlayer youTubePlayer, float v) {

          }

          @Override
          public void onVideoId(@NonNull YouTubePlayer youTubePlayer, @NonNull String s) {

          }

          @Override
          public void onApiChange(@NonNull YouTubePlayer youTubePlayer) {

          }
        });
        youTubePlayerView2.addYouTubePlayerListener(new YouTubePlayerListener() {
          @Override
          public void onReady(@NonNull YouTubePlayer youTubePlayer) {

          }

          @Override
          public void onStateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerState playerState) {
            if(playerState.toString().equals("ENDED"))
            {
              String joined = sharedpreferences.getString("videoIds", "");
              if(joined.isEmpty())
              {
                List<String> list = new ArrayList<String>();
                list.add(videoIds[1]);
                joined = String.join(",", list);
                editor.putString("videoIds", joined);
                editor.apply();
              }
              else {
                List<String> list = new ArrayList<String>(Arrays.asList(joined.split(","))); // convert back to list of strings
                list.add(videoIds[1]);
                joined = String.join(",", list);
                editor.putString("videoIds", joined);
                editor.apply();
              }
              //Intent
              finish();
              Intent intent = new Intent(getApplicationContext(),CompletedExercises.class);
              startActivity(intent);
            }
          }

          @Override
          public void onPlaybackQualityChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlaybackQuality playbackQuality) {

          }

          @Override
          public void onPlaybackRateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlaybackRate playbackRate) {

          }

          @Override
          public void onError(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerError playerError) {

          }

          @Override
          public void onCurrentSecond(@NonNull YouTubePlayer youTubePlayer, float v) {

          }

          @Override
          public void onVideoDuration(@NonNull YouTubePlayer youTubePlayer, float v) {

          }

          @Override
          public void onVideoLoadedFraction(@NonNull YouTubePlayer youTubePlayer, float v) {

          }

          @Override
          public void onVideoId(@NonNull YouTubePlayer youTubePlayer, @NonNull String s) {

          }

          @Override
          public void onApiChange(@NonNull YouTubePlayer youTubePlayer) {

          }
        });
        youTubePlayerView3.addYouTubePlayerListener(new YouTubePlayerListener() {
          @Override
          public void onReady(@NonNull YouTubePlayer youTubePlayer) {

          }

          @Override
          public void onStateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerState playerState) {
            if(playerState.toString().equals("ENDED"))
            {
              String joined = sharedpreferences.getString("videoIds", "");
              if(joined.isEmpty())
              {
                List<String> list = new ArrayList<String>();
                list.add(videoIds[2]);
                joined = String.join(",", list);
                editor.putString("videoIds", joined);
                editor.apply();
              }
              else {
                List<String> list = new ArrayList<String>(Arrays.asList(joined.split(","))); // convert back to list of strings
                list.add(videoIds[2]);
                joined = String.join(",", list);
                editor.putString("videoIds", joined);
                editor.apply();
              }
              //Intent
              finish();
              Intent intent = new Intent(getApplicationContext(),CompletedExercises.class);
              startActivity(intent);
            }
          }

          @Override
          public void onPlaybackQualityChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlaybackQuality playbackQuality) {

          }

          @Override
          public void onPlaybackRateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlaybackRate playbackRate) {

          }

          @Override
          public void onError(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerError playerError) {

          }

          @Override
          public void onCurrentSecond(@NonNull YouTubePlayer youTubePlayer, float v) {

          }

          @Override
          public void onVideoDuration(@NonNull YouTubePlayer youTubePlayer, float v) {

          }

          @Override
          public void onVideoLoadedFraction(@NonNull YouTubePlayer youTubePlayer, float v) {

          }

          @Override
          public void onVideoId(@NonNull YouTubePlayer youTubePlayer, @NonNull String s) {

          }

          @Override
          public void onApiChange(@NonNull YouTubePlayer youTubePlayer) {

          }
        });
        youTubePlayerView4.addYouTubePlayerListener(new YouTubePlayerListener() {
          @Override
          public void onReady(@NonNull YouTubePlayer youTubePlayer) {

          }

          @Override
          public void onStateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerState playerState) {
            if(playerState.toString().equals("ENDED"))
            {
              String joined = sharedpreferences.getString("videoIds", "");
              if(joined.isEmpty())
              {
                List<String> list = new ArrayList<String>();
                list.add(videoIds[3]);
                joined = String.join(",", list);
                editor.putString("videoIds", joined);
                editor.apply();
              }
              else {
                List<String> list = new ArrayList<String>(Arrays.asList(joined.split(","))); // convert back to list of strings
                list.add(videoIds[3]);
                joined = String.join(",", list);
                editor.putString("videoIds", joined);
                editor.apply();
              }
              //Intent
              finish();
              Intent intent = new Intent(getApplicationContext(),CompletedExercises.class);
              startActivity(intent);
            }
          }

          @Override
          public void onPlaybackQualityChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlaybackQuality playbackQuality) {

          }

          @Override
          public void onPlaybackRateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlaybackRate playbackRate) {

          }

          @Override
          public void onError(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerError playerError) {

          }

          @Override
          public void onCurrentSecond(@NonNull YouTubePlayer youTubePlayer, float v) {

          }

          @Override
          public void onVideoDuration(@NonNull YouTubePlayer youTubePlayer, float v) {

          }

          @Override
          public void onVideoLoadedFraction(@NonNull YouTubePlayer youTubePlayer, float v) {

          }

          @Override
          public void onVideoId(@NonNull YouTubePlayer youTubePlayer, @NonNull String s) {

          }

          @Override
          public void onApiChange(@NonNull YouTubePlayer youTubePlayer) {

          }
        });

    }
    void checkVideosVisibility()
    {
      String joined = sharedpreferences.getString("videoIds", "");// retrieve the joined string
      List<String> list = new ArrayList<String>(Arrays.asList(joined.split(","))); // convert back to list of strings
      for(int i=0;i<list.size();i++)
      {
        if(Objects.equals(list.get(i), videoIds[0]))
        {
          cardView1.setVisibility(View.GONE);
        }
        if(Objects.equals(list.get(i), videoIds[1]))
        {
          cardView2.setVisibility(View.GONE);
        }
        if(Objects.equals(list.get(i), videoIds[2]))
        {
          cardView3.setVisibility(View.GONE);
        }
        if(Objects.equals(list.get(i), videoIds[3]))
        {
          cardView4.setVisibility(View.GONE);
        }
      }
    }
    public void onClickBackToMain(View view) {
        finish();
    }
}

