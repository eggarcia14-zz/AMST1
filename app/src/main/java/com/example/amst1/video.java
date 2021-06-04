package com.example.amst1;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class video extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        VideoView videoView;
        videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mControl = new MediaController(this);
        mControl.setAnchorView(videoView);
        Uri uri = Uri.parse("https://youtu.be/CFPLIaMpGrY");
        videoView.setMediaController(mControl);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}
