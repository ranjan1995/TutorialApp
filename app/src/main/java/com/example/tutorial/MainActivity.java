package com.example.tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id) {
            case R.id.Java_Home:
                goToContentActivity(R.string.java_home);
                break;
            case R.id.Java_Overview:
                goToContentActivity(R.string.Java_Overview);
                break;
            case R.id.Java_Environment_Setup:
                goToContentActivity(R.string.Java_Environment_Setup);
                break;
            case R.id.Java_Basic_Syntax:
                goToContentActivity(R.string.Java_Basic_Syntax);
                break;
            case R.id.java_object_classes:
                goToContentActivity(R.string.java_object_classes);
                break;
            case R.id.java_constructors:
                goToContentActivity(R.string.java_constructors);
                break;
            case R.id.java_basic_datatypes:
                goToContentActivity(R.string.java_basic_datatypes);
                break;
            case R.id.java_variable_types:
                goToContentActivity(R.string.java_variable_types);
                break;
            case R.id.java_modifier_types:
                goToContentActivity(R.string.java_modifier_types);
                break;
            case R.id.java_basic_operators:
                goToContentActivity(R.string.java_basic_operators);
                break;
            case R.id.java_loop_control:
                goToContentActivity(R.string.java_loop_control);
                break;
            case R.id.java_decision_making:
                goToContentActivity(R.string.java_decision_making);
                break;
            case R.id.java_numbers:
                goToContentActivity(R.string.java_numbers);
                break;
            case R.id.java_characters:
                goToContentActivity(R.string.java_characters);
                break;
            case R.id.java_strings:
                goToContentActivity(R.string.java_strings);
                break;
            case R.id.java_arrays:
                goToContentActivity(R.string.java_arrays);
                break;
            case R.id.java_date_time:
                goToContentActivity(R.string.java_date_time);
                break;
            case R.id.java_regular_expressions:
                goToContentActivity(R.string.java_regular_expressions);
                break;
            case R.id.java_methods:
                goToContentActivity(R.string.java_methods);
                break;
            case R.id.java_files_io:
                goToContentActivity(R.string.java_files_io);
                break;
            case R.id.java_exceptions:
                goToContentActivity(R.string.java_exceptions);
                break;
            case R.id.java_innerclasses:
                goToContentActivity(R.string.java_innerclasses);
                break;
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void goToContentActivity(int homepage) {
        Intent intent = new Intent(MainActivity.this, JavaActivity.class);
        intent.putExtra("html", getResources().getString(homepage));
        startActivity(intent);
    }
}
