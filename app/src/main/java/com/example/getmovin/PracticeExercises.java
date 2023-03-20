package com.example.getmovin;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
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
    Calendar calender = Calendar.getInstance();
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
             checkAchievements();
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
              checkAchievements();
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
              checkAchievements();
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
              checkAchievements();
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

  private void checkAchievements() {
    if (!sharedpreferences.getBoolean("firstAchievementUnlock", false)) {
      editor.putBoolean("firstAchievementUnlock", true);
      editor.apply();
    }
//    Calendar calender = Calendar.getInstance();
//    String joined_week = sharedpreferences.getString("weeksNumber", "");
//    if(joined_week.isEmpty())
//    {
//      List<String> list = new ArrayList<String>();
//      list.add(String.valueOf(calender.get(Calendar.WEEK_OF_YEAR)));
//      joined_week = String.join(",", list);
//      editor.putString("weeksNumber", joined_week);
//      editor.apply();
//    }
//    else {
//      List<String> list = new ArrayList<String>(Arrays.asList(joined_week.split(",")));// convert back to list of strings
//      for(int i=0;i<list.size();i++) {
//        if (calender.get(Calendar.WEEK_OF_YEAR) == Integer.parseInt(list.get(i))) {
//          if (!sharedpreferences.getBoolean("secondAchievementUnlock", false)) {
//            editor.putBoolean("secondAchievementUnlock", true);
//            editor.apply();
//          }
//        }

    // Achievement 2: First week of exercises
    if (sharedpreferences.contains("weeksNumber")) {
      List<String> weekList = Arrays.asList(sharedpreferences.getString("weeksNumber", "").split(","));
      if (weekList.size() >= 2 && calender.get(Calendar.WEEK_OF_YEAR) == Integer.parseInt(weekList.get(weekList.size() - 1))) {
        // User completed first week of exercises
        if (!sharedpreferences.getBoolean("secondAchievementUnlock", false)) {
          // Unlock Achievement 2
          SharedPreferences.Editor editor = sharedpreferences.edit();
          editor.putBoolean("secondAchievementUnlock", true);
          editor.apply();
        }
      }
    }


    // Achievement 3, 4 and 5: Consecutive weeks of exercises
    if (sharedpreferences.contains("weeksNumber")) {
      List<String> weekList = Arrays.asList(sharedpreferences.getString("weeksNumber", "").split(","));
      if (weekList.size() >= 2) {
        boolean consecutiveWeeks = true;
        for (int i = 1; i < weekList.size(); i++) {
          if (Integer.parseInt(weekList.get(i)) != Integer.parseInt(weekList.get(i - 1)) + 1) {
            consecutiveWeeks = false;
            break;
          }
        }
        if (consecutiveWeeks) {
          // User has been practicing for 2 or more consecutive weeks
          if (!sharedpreferences.getBoolean("thirdAchievementUnlock", false)) {
            // Unlock Achievement 3
            SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putBoolean("thirdAchievementUnlock", true);
            editor.apply();
          }
          if (weekList.size() >= 4 && calender.get(Calendar.WEEK_OF_YEAR) == Integer.parseInt(weekList.get(weekList.size() - 1))) {
            // User has been practicing for over a month
            if (!sharedpreferences.getBoolean("forthAchievementUnlock", false)) {
              // Unlock Achievement 4
              SharedPreferences.Editor editor = sharedpreferences.edit();
              editor.putBoolean("forthAchievementUnlock", true);
              editor.apply();
            }
            if (weekList.size() >= 8 && calender.get(Calendar.WEEK_OF_YEAR) == Integer.parseInt(weekList.get(weekList.size() - 1))) {
              // User has been practicing for over two months
              if (!sharedpreferences.getBoolean("fifthAchievementUnlock", false)) {
                // Unlock Achievement 5
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putBoolean("fifthAchievementUnlock", true);
                editor.apply();
              }
            }
          }
        }
      }

//
//        if (calender.get(Calendar.WEEK_OF_YEAR) - 1 == Integer.parseInt(list.get(i))) {
//          int con = sharedpreferences.getInt("consecutive", 0);
//          editor.putInt("consecutive", con + 1);
//          editor.apply();
//                    if(!sharedpreferences.getBoolean("thirdAchievementUnlock",false)) {
//                      editor.putBoolean("thirdAchievementUnlock", true);
//                      editor.apply();
//                    }
//                    if(i>=2)
//                    {
//                      if(calender.get(Calendar.WEEK_OF_YEAR)-2==Integer.parseInt(list.get(i-2)))
//                      {
//                        if(i>=3)
//                        {
//                          if(calender.get(Calendar.WEEK_OF_YEAR)-3==Integer.parseInt(list.get(i-3)))
//                          {
//                            if(!sharedpreferences.getBoolean("forthAchievementUnlock",false)) {
//                              editor.putBoolean("forthAchievementUnlock", true);
//                              editor.apply();
//                            }
//                          }
//                        }
//                      }
//                    }
//        }
//        if (calender.get(Calendar.WEEK_OF_YEAR) - 1 != Integer.parseInt(list.get(i)))
//        {
//          editor.putInt("consecutive", 0);
//          editor.apply();
//        }
//      }
//      list.add(String.valueOf(calender.get(Calendar.WEEK_OF_YEAR)));
//      joined_week = String.join(",", list);
//      editor.putString("weeksNumber", joined_week);
//      editor.apply();
//    }
    }
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

