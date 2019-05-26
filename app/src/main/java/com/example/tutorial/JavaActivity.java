package com.example.tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.widget.TextView;

public class JavaActivity extends AppCompatActivity {
    private TextView content;
    private String html;
    private String flag;
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
        flag = getIntent().getStringExtra("flag");
        browser.loadDataWithBaseURL("file:///android_asset/",html,
                "text/html", "UTF-8",null);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        if (flag != null) {
            myToolbar.setTitle(flag);
        } else {
            myToolbar.setTitle(R.string.app_name);
        }
        setSupportActionBar(myToolbar);
    }

}
