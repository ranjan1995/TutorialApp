package com.example.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.widget.TextView;

public class JavaActivity extends AppCompatActivity {
    private TextView content;
    private String html;
    WebView browser;


    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        content = findViewById(R.id.home);
        html = getIntent().getStringExtra("html");
        content.setText(Html.fromHtml(html));
    }*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        browser= findViewById(R.id.webView);
        html = getIntent().getStringExtra("html");

        browser.loadDataWithBaseURL("file:///android_asset/",html,
                "text/html", "UTF-8",null);
    }

}
