package com.example.getmovin;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;

public class AchievementsActivity extends AppCompatActivity {
    //Initializing the widgets
    SharedPreferences sharedpreferences;
    ImageButton back_btn;
    int position = 0;
    public static final String MyPREFERENCES = "CompletedVideoPrefs" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);

        // Get the LayoutInflater
        LayoutInflater inflater = getLayoutInflater();

        // Find the parent LinearLayout and remove any existing views
        LinearLayoutCompat parentPanel = findViewById(R.id.trophy_lyt);

        back_btn = findViewById(R.id.backButton5);
        //Back button listener
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
            //Finish the activity of back button click
        });

        parentPanel.removeAllViews();

        // Set the orientation of the parent LinearLayout
        parentPanel.setOrientation(LinearLayoutCompat.VERTICAL);

        // Get the SharedPreferences instance
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        // Check if the first achievement has been unlocked
        if(sharedpreferences.getBoolean("firstAchievementUnlock",false))
        { // If so, inflate the achievement layout
          View item = inflater.inflate(R.layout.row_achievement_lyt, null);

          // Find the ImageView and TextView in the layout
          ImageView imageView = item.findViewById(R.id.trophy_icon);
          TextView textView= item.findViewById(R.id.leve_txt);

          // Set the text and image for the achievement
          textView.setText("You Completed Your First Video");
          imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.trophy1,getTheme()));

          // Add the achievement view to the parent LinearLayout
          parentPanel.addView(item);
        }

        // Check if the second achievement has been unlocked (repeat for each achievement)
        if(sharedpreferences.getBoolean("secondAchievementUnlock",false))
        {
          View item = inflater.inflate(R.layout.row_achievement_lyt, null);
          ImageView imageView = item.findViewById(R.id.trophy_icon);
          TextView textView= item.findViewById(R.id.leve_txt);
          textView.setText("You Completed Your First Week Of Exercises!");
          imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.trophy2,getTheme()));
          parentPanel.addView(item);
        }

        //third achievement
        if(sharedpreferences.getBoolean("thirdAchievementUnlock",false))
        {
          View item = inflater.inflate(R.layout.row_achievement_lyt, null);
          ImageView imageView = item.findViewById(R.id.trophy_icon);
          TextView textView= item.findViewById(R.id.leve_txt);
          textView.setText("You Have Been Practicing For 2 Full Weeks!");
          imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.trophy3,getTheme()));
          parentPanel.addView(item);
        }

        //fourth achievement
        if(sharedpreferences.getBoolean("fourthAchievementUnlock",false))
        {
          View item = inflater.inflate(R.layout.row_achievement_lyt, null);
          ImageView imageView = item.findViewById(R.id.trophy_icon);
          TextView textView= item.findViewById(R.id.leve_txt);
          textView.setText("You Have Been Practicing For 1 Whole Month!");
          imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.trophy4,getTheme()));
          parentPanel.addView(item);
        }

        //fifth achievement
        if(sharedpreferences.getBoolean("fifthAchievementUnlock",false))
        {
          View item = inflater.inflate(R.layout.row_achievement_lyt, null);
          ImageView imageView = item.findViewById(R.id.trophy_icon);
          TextView textView= item.findViewById(R.id.leve_txt);
          textView.setText("You Have Been Practicing Your Exercises For 2 Whole Months!");
          imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.trophy5,getTheme()));
          parentPanel.addView(item);
        }

    }

}
