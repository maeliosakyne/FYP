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
   SharedPreferences sharedpreferences;
   ImageButton back_btn;
   int position = 0;
   public static final String MyPREFERENCES = "CompletedVideoPrefs" ;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.completed_activity);
          LayoutInflater inflater = getLayoutInflater();
          LinearLayoutCompat parentPanel = findViewById(R.id.row_linear_layout);
          back_btn = findViewById(R.id.backButton);
          back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              finish();
            }
          });
          parentPanel.removeAllViews();
          parentPanel.setOrientation(LinearLayoutCompat.VERTICAL);
          sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
          String joined = sharedpreferences.getString("videoIds", "");// retrieve the joined string
          if(!joined.isEmpty()) {
            List<String> list = new ArrayList<>(Arrays.asList(joined.split(",")));
            for (int i = 0; i < list.size(); i++) {
              position = i;
              View item = inflater.inflate(R.layout.row_layout, null);
              TextView videoTitleTxt = item.findViewById(R.id.videoTitle);
              videoTitleTxt.setText(new StringBuilder().append("Workout ").append(i + 1).toString());
              YouTubePlayerView youTubePlayerView = item.findViewById(R.id.youtubePlayer_row);
              youTubePlayerView.addYouTubePlayerListener(new YouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
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
              parentPanel.addView(item);
            }
          }
        }
}



