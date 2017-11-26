package com.neebles.moviedb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
    }

    public void openHome(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void openLogin(View view) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}
