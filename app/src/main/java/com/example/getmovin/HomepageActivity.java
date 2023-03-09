package com.example.fypapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class HomepageActivity extends AppCompatActivity {
  private static final long SEVEN_DAYS_INTERVAL = 7 * 24 * 60 * 60 * 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        long lastClearTime = getSharedPreferences("CompletedVideoPrefs", MODE_PRIVATE).getLong("last_clear_time", -1);
        long currentTime = System.currentTimeMillis();
      if(lastClearTime==-1)
          {
            SharedPreferences.Editor editor = getSharedPreferences("CompletedVideoPrefs", MODE_PRIVATE).edit();
            editor.putLong("last_clear_time", currentTime);
            editor.apply();
          }
        else{
          if (currentTime - lastClearTime > SEVEN_DAYS_INTERVAL) {
            // Clear the shared preferences
            SharedPreferences.Editor editor = getSharedPreferences("CompletedVideoPrefs", MODE_PRIVATE).edit();
            editor.remove("videoIds");
            editor.putLong("last_clear_time", currentTime);
            editor.apply();
          }
        }
    }
    public void onClickPracticeExercises(View view) {
        startActivity(new Intent(HomepageActivity.this, PracticeExercises.class));
    }
    public void onClickHelp(View view) {
        startActivity(new Intent(HomepageActivity.this, HelpActivity.class));
    }
    public void Completed(View view) {
        startActivity(new Intent(HomepageActivity.this, CompletedExercises.class));
    }

  public void achievementsClick(View view) {
    Intent intent = new Intent(getApplicationContext(),AchievementsActivity.class);
    startActivity(intent);
  }
}
