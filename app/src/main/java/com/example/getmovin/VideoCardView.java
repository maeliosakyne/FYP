package com.example.getmovin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import androidx.cardview.widget.CardView;

public class VideoCardView extends CardView {

    private OnCompleteListener mListener;

    public VideoCardView(Context context) {
        super(context);
        init();
    }

    public VideoCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VideoCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        @SuppressLint("WrongViewCast")
        Button completeButton = findViewById(R.id.completeBtn1);
        completeButton.setOnClickListener(view -> {
            if (mListener != null) {
                mListener.onComplete(VideoCardView.this);
            }
        });
    }

    public void setOnCompleteListener(OnCompleteListener listener) {
        mListener = listener;
    }
}