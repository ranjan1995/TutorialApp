package com.example.tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class JavaActivity extends AppCompatActivity {
    private TextView content;
    private String html;
    private String flag;
    private WebView browser;
    private ImageView backButton;
    private TextView title;


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
        backButton= findViewById(R.id.backButton);
        title= findViewById(R.id.title);
        html = getIntent().getStringExtra("html");
        flag = getIntent().getStringExtra("flag");
        browser.loadDataWithBaseURL("file:///android_asset/",html,
                "text/html", "UTF-8",null);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        if (flag != null) {
            title.setText(flag);
        } else {
            title.setText(R.string.app_name);
        }
        setSupportActionBar(myToolbar);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

}
