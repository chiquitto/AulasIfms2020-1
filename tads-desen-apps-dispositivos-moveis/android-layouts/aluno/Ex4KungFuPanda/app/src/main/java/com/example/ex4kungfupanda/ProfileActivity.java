package com.example.ex4kungfupanda;

import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        initBtnViewProfile();
    }

    private void initBtnViewProfile() {
        findViewById(R.id.btnViewProfile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailsIntent = new Intent(ProfileActivity.this, Profile2Activity.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    ActivityOptionsCompat optionsCompat =
                            ActivityOptionsCompat.makeSceneTransitionAnimation(ProfileActivity.this, findViewById(R.id.bg_image),
                                    "profile_image");
                    startActivity(detailsIntent, optionsCompat.toBundle());
                } else {
                    startActivity(detailsIntent);
                }
            }
        });
    }
}
