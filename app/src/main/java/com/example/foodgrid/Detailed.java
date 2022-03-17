package com.example.foodgrid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detailed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        TextView name = (TextView) findViewById(R.id.textView5);
        ImageView image = (ImageView) findViewById(R.id.imageView3);
        Intent i = getIntent();
        String foodname = i.getStringExtra("name");
        int foodimg = i.getIntExtra("photo",0);
        name.setText(foodname);
        image.setImageResource(foodimg);
    }
}