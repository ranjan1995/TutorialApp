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
                goToContentActivityWithFlag(R.string.java_home,R.string.java_home_nav);
                break;
            case R.id.Java_Overview:
                goToContentActivityWithFlag(R.string.Java_Overview,R.string.java_overview_nav);
                break;
            case R.id.Java_Environment_Setup:
                goToContentActivityWithFlag(R.string.Java_Environment_Setup,R.string.java_environment_setup_nav);
                break;
            case R.id.Java_Basic_Syntax:
                goToContentActivityWithFlag(R.string.Java_Basic_Syntax,R.string.java_basic_syntax_nav);
                break;
            case R.id.java_object_classes:
                goToContentActivityWithFlag(R.string.java_object_classes,R.string.java_object_classes_nav);
                break;
            case R.id.java_constructors:
                goToContentActivityWithFlag(R.string.java_constructors,R.string.java_constructors_nav);
                break;
            case R.id.java_basic_datatypes:
                goToContentActivityWithFlag(R.string.java_basic_datatypes,R.string.java_basic_datatypes_nav);
                break;
            case R.id.java_variable_types:
                goToContentActivityWithFlag(R.string.java_variable_types,R.string.java_variable_types_nav);
                break;
            case R.id.java_modifier_types:
                goToContentActivityWithFlag(R.string.java_modifier_types,R.string.java_modifier_types_nav);
                break;
            case R.id.java_basic_operators:
                goToContentActivityWithFlag(R.string.java_basic_operators,R.string.java_basic_operators_nav);
                break;
            case R.id.java_loop_control:
                goToContentActivityWithFlag(R.string.java_loop_control,R.string.java_loop_control_nav);
                break;
            case R.id.java_decision_making:
                goToContentActivityWithFlag(R.string.java_decision_making,R.string.java_decision_making_nav);
                break;
            case R.id.java_numbers:
                goToContentActivityWithFlag(R.string.java_numbers,R.string.java_numbers_nav);
                break;
            case R.id.java_characters:
                goToContentActivityWithFlag(R.string.java_characters,R.string.java_characters_nav);
                break;
            case R.id.java_strings:
                goToContentActivityWithFlag(R.string.java_strings,R.string.java_strings_nav);
                break;
            case R.id.java_arrays:
                goToContentActivityWithFlag(R.string.java_arrays,R.string.java_arrays_nav);
                break;
            case R.id.java_date_time:
                goToContentActivityWithFlag(R.string.java_date_time,R.string.java_date_time_nav);
                break;
            case R.id.java_regular_expressions:
                goToContentActivityWithFlag(R.string.java_regular_expressions,R.string.java_regular_expressions_nav);
                break;
            case R.id.java_methods:
                goToContentActivityWithFlag(R.string.java_methods,R.string.java_methods_nav);
                break;
            case R.id.java_files_io:
                goToContentActivityWithFlag(R.string.java_files_io,R.string.java_files_and_i_o_nav);
                break;
            case R.id.java_exceptions:
                goToContentActivityWithFlag(R.string.java_exceptions,R.string.java_exceptions_nav);
                break;
            case R.id.java_innerclasses:
                goToContentActivityWithFlag(R.string.java_innerclasses,R.string.java_inner_classes_nav);
                break;
        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
/*
    private void goToContentActivity(int homepage) {
        Intent intent = new Intent(MainActivity.this, JavaActivity.class);
        intent.putExtra("html", getResources().getString(homepage));
        startActivity(intent);
    }*/
    private void goToContentActivityWithFlag(int homepage, int flag) {
        Intent intent = new Intent(MainActivity.this, JavaActivity.class);
        intent.putExtra("html", getResources().getString(homepage));
        intent.putExtra("flag", getResources().getString(flag));
        startActivity(intent);
    }
}
