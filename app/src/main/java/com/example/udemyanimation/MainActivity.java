package com.example.udemyanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isCat = true;
    ImageView tomImageView;
    ImageView jerryImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tomImageView = findViewById(R.id.tomView);
        jerryImageView = findViewById(R.id.jerryView);

    }

    public void animateImage(View view) {

        if (isCat) {
            tomImageView.animate().scaleX(0).scaleY(0).rotation(tomImageView.getRotation()+360).setDuration(3000);
            jerryImageView.animate().scaleX(1).scaleY(1).rotation(jerryImageView.getRotation()+360).setDuration(3000);
            isCat = false;
        } else {
            jerryImageView.animate().scaleX(0).scaleY(0).rotation(jerryImageView.getRotation()+360).setDuration(3000);
            tomImageView.animate().scaleX(1).scaleY(1).rotation(tomImageView.getRotation()+360).setDuration(3000);
            isCat = true;
        }

    }

}
