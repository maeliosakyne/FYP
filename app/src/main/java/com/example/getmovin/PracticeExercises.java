package com.example.getmovin;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PracticeExercises extends AppCompatActivity {
    private ScrollView mScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice_activity);
        mScrollView = findViewById(R.id.scrollView2);

        // Add VideoCardViews to the ScrollView
        for (int i = 0; i < 10; i++) {
            VideoCardView videoCardView = new VideoCardView(this);
            videoCardView.setOnCompleteListener((OnCompleteListener) this);
            mScrollView.addView(videoCardView);
        }
    }

    public void onComplete(View view) {
        mScrollView.removeView(view);
        Intent intent = new Intent(this, CompletedExercises.class);
        intent.putExtra("video_card_view", (Serializable) view);
        startActivity(intent);
    }
    public void onClickBackToMain(View view) {
        finish();
    }
}

