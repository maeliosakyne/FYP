package com.example.getmovin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;


public class HomepageActivity extends AppCompatActivity {
  private static final long SEVEN_DAYS_INTERVAL = 7 * 24 * 60 * 60 * 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        setContentView(R.layout.activity_homepage);
        //Getting last clear data time from shared preference
        long lastClearTime = getSharedPreferences("CompletedVideoPrefs", MODE_PRIVATE).getLong("last_clear_time", -1);
        //Getting current time
        long currentTime = System.currentTimeMillis();
        //If its the users first time then store the current time as last clear time
      if(lastClearTime==-1)
          {
            SharedPreferences.Editor editor = getSharedPreferences("CompletedVideoPrefs", MODE_PRIVATE).edit();
            editor.putLong("last_clear_time", currentTime);
            editor.apply();
          }
        else{ //else if current time - last clear time is 7 days then remove the data of completed video in shared preference
          if (currentTime - lastClearTime > SEVEN_DAYS_INTERVAL) {
            // Clear the shared preferences
            SharedPreferences.Editor editor = getSharedPreferences("CompletedVideoPrefs", MODE_PRIVATE).edit();
            //Line to remove the data from shared preference
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
