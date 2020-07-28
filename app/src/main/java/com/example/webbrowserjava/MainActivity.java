package com.example.webbrowserjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WebView myWebView = (WebView) findViewById(R.id.webviewbrowser);
        myWebView.loadUrl("https://ph.tinhtong.vn/");
        myWebView.getSettings().setJavaScriptEnabled(true);

    }
}