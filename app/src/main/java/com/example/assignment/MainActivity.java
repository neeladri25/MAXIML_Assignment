package com.example.assignment;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    WebView browse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        browse=findViewById(R.id.webview);
        Intent i = getIntent();
        if(i.getData() != null){
            browse.loadUrl(i.getData().toString());
        }
    }
}
