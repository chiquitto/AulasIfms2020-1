package com.example.ex4kungfupanda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initBtProfilePage();
        initBtProfilePage2();
        initBtProfilePageScroll();
        initBtFeed();
    }

    private void initBtProfilePage() {
        findViewById(R.id.btProfilePage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileViewIntent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(profileViewIntent);
            }
        });
    }

    private void initBtProfilePage2() {
        findViewById(R.id.btProfilePage2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileViewIntent = new Intent(MainActivity.this, Profile2Activity.class);
                startActivity(profileViewIntent);
            }
        });
    }

    private void initBtProfilePageScroll() {
        findViewById(R.id.btProfilePageScroll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileViewIntent = new Intent(MainActivity.this, ProfileScrollActivity.class);
                startActivity(profileViewIntent);
            }
        });
    }

    private void initBtFeed() {
        findViewById(R.id.btFeed).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileViewIntent = new Intent(MainActivity.this, FeedActivity.class);
                startActivity(profileViewIntent);
            }
        });
    }


}
