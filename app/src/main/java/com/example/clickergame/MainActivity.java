package com.example.clickergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int money = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView green = (ImageView) findViewById(R.id.greenImg);
        TextView moneyDisplay = (TextView) findViewById(R.id.moneyView);

        green.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                money++;
                moneyDisplay.setText("You have " + money + "$");

                if (money > 100)
                {
                    money = -1;
                    moneyDisplay.setText("Numbers don't go past 100, so you're going back to 0$");
                }
            }
        });

    }
}