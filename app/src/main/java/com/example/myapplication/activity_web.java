package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class activity_web extends AppCompatActivity {

    WebView monAffichageWeb ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);



        monAffichageWeb = findViewById(R.id.webView1) ;
        monAffichageWeb.loadUrl("file:///android_asset/slam3.html");

    }

}
