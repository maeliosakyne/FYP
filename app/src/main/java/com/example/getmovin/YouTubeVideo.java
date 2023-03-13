package com.example.getmovin;

public class YouTubeVideo {

    private String mTitle;
    private String mThumbnailUrl;

    public YouTubeVideo(String title, String thumbnailUrl) {
        mTitle = title;
        mThumbnailUrl = thumbnailUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getThumbnailUrl() {
        return mThumbnailUrl;
    }
}
