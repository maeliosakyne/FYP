package com.example.getmovin;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompletedExercises extends AppCompatActivity {
  //Initializing widgets
   SharedPreferences sharedpreferences;
   ImageButton back_btn;
   int position = 0;
   public static final String MyPREFERENCES = "CompletedVideoPrefs" ;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.completed_activity);
          LayoutInflater inflater = getLayoutInflater();
          // Find the parent LinearLayout and remove any existing views
          LinearLayoutCompat parentPanel = findViewById(R.id.row_linear_layout);
          back_btn = findViewById(R.id.backButton4);
          //Back button listener
          back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              finish();
            }
            //Finish the activity of back button click
          });

          //Remove all views in completed exercises
          parentPanel.removeAllViews();

          //Set orientation to be vertical
          parentPanel.setOrientation(LinearLayoutCompat.VERTICAL);

          //Getting video ids of completed videos from shared preference
          sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

          String joined = sharedpreferences.getString("videoIds", "");// retrieve the joined string of Video ID's
          //If the list of completed videos is not empty
          if(!joined.isEmpty()) {
            List<String> list = new ArrayList<>(Arrays.asList(joined.split(",")));
            //For Loop until the video ID's in the completed video list have been taken from shared preferences
            for (int i = 0; i < list.size(); i++) {
              position = i;
              //Inflate the row_layout for a completed exercise
              View item = inflater.inflate(R.layout.row_layout, null);
              //Setting the video title in row_layout
              TextView videoTitleTxt = item.findViewById(R.id.videoTitle);
              videoTitleTxt.setText(new StringBuilder().append("Workout ").append(i + 1).toString()); //setting workout number to the current index of for loop

              //Setting up Youtube listener
              YouTubePlayerView youTubePlayerView = item.findViewById(R.id.youtubePlayer_row);
              youTubePlayerView.addYouTubePlayerListener(new YouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                  //setting the video id in the youtube video player
                  youTubePlayer.cueVideo(list.get(position), 0);
                }

                @Override
                public void onStateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerState playerState) {

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
              //Add the view
              parentPanel.addView(item);
            }
          }
        }
}



