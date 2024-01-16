package com.example.clickergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int money = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView green = (ImageView) findViewById(R.id.greenImg);

        green.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                money++;
            }
        });

    }
}