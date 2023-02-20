package com.example.getmovin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class HomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

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
}