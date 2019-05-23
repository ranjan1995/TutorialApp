package com.example.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class JavaActivity extends AppCompatActivity {
    private TextView content;
    private String html;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        content = findViewById(R.id.home);
        html = getIntent().getStringExtra("html");
        content.setText(Html.fromHtml(html));
    }
}
