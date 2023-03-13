package com.example.getmovin;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AchievementsActivity extends AppCompatActivity {
    SharedPreferences sharedpreferences;
    int position = 0;
    public static final String MyPREFERENCES = "CompletedVideoPrefs" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);
        LayoutInflater inflater = getLayoutInflater();
        LinearLayoutCompat parentPanel = findViewById(R.id.trophy_lyt);
        parentPanel.removeAllViews();
        parentPanel.setOrientation(LinearLayoutCompat.VERTICAL);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        if(sharedpreferences.getBoolean("firstAchievementUnlock",false))
        {
          View item = inflater.inflate(R.layout.row_achivement_lyt, null);
          ImageView imageView = item.findViewById(R.id.trophy_icon);
          TextView textView= item.findViewById(R.id.leve_txt);
          textView.setText("You Completed Your First Video");
          imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.trophy1,getTheme()));
          parentPanel.addView(item);
        }
        if(sharedpreferences.getBoolean("secondAchievementUnlock",false))
        {
          View item = inflater.inflate(R.layout.row_achivement_lyt, null);
          ImageView imageView = item.findViewById(R.id.trophy_icon);
          TextView textView= item.findViewById(R.id.leve_txt);
          textView.setText("You Completed Your First Week Of Exercises");
          imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.trophy2,getTheme()));
          parentPanel.addView(item);
        }
        if(sharedpreferences.getBoolean("thirdAchievementUnlock",false))
        {
          View item = inflater.inflate(R.layout.row_achivement_lyt, null);
          ImageView imageView = item.findViewById(R.id.trophy_icon);
          TextView textView= item.findViewById(R.id.leve_txt);
          textView.setText("you Have Been Practicing For 2 Weeks");
          imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.trophy3,getTheme()));
          parentPanel.addView(item);
        }
        if(sharedpreferences.getBoolean("forthAchievementUnlock",false))
        {
          View item = inflater.inflate(R.layout.row_achivement_lyt, null);
          ImageView imageView = item.findViewById(R.id.trophy_icon);
          TextView textView= item.findViewById(R.id.leve_txt);
          textView.setText("you Have Been Practicing For 1 Month");
          imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.trophy4,getTheme()));
          parentPanel.addView(item);
        } if(sharedpreferences.getBoolean("fifthAchievementUnlock",false))
        {
          View item = inflater.inflate(R.layout.row_achivement_lyt, null);
          ImageView imageView = item.findViewById(R.id.trophy_icon);
          TextView textView= item.findViewById(R.id.leve_txt);
          textView.setText("you Have Been Practicing For 2 Months");
          imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.trophy5,getTheme()));
          parentPanel.addView(item);
        }

    }

}
