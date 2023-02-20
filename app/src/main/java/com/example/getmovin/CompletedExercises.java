package com.example.getmovin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class CompletedExercises extends AppCompatActivity {
    private LinearLayout mLinearLayout;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.completed_activity);
           // mLinearLayout = findViewById(R.id.linear);
            Intent intent = getIntent();
            VideoCardView videoCardView = (VideoCardView) intent.getSerializableExtra("video_card_view");
            mLinearLayout.addView(videoCardView);
        }
    public void onClickBackToMain(View view){
        finish();
    }
}



