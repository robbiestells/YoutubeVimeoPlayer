package com.primeperspective.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    WebView videoView;
    MediaController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String vimeo = "https://vimeo.com/37551417";

        videoView = (WebView) findViewById(R.id.videoView);

        //if youtube
        int screenwidth = View.MeasureSpec.getSize(videoView.getMeasuredWidthAndState());
        String width = "width=\"" + screenwidth + "\"";
        String youtube = "src=\"https://www.youtube.com/embed/ovBSCbKopGY\"";
        String html = " <iframe " + width + " height=\"200\"" + youtube + " frameborder=\"0\" allowfullscreen></iframe>";

        String videoHtml = "<iframe src=\"https://player.vimeo.com/video/37551417?title=0&byline=0&portrait=0\" width=\"300\" height=\"200\" frameborder=\"0\" allowfullscreen></iframe>";

//        String youtube = "src=\"https://www.youtube.com/embed/ovBSCbKopGY\"";
//        String html = " <iframe width=\"300\" height=\"200\"" + youtube + " frameborder=\"0\" allowfullscreen></iframe>";

        //if vimeo

        videoView.getSettings().setJavaScriptEnabled(true);
        videoView.loadDataWithBaseURL("", videoHtml , "text/html",  "UTF-8", "");
    }
}
