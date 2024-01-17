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
        TextView buyDisplay = (TextView) findViewById(R.id.buyView);

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

                if(money < 5)
                {
                    buyDisplay.setText("You can buy french fries!");
                }
                else if(money < 20)
                {
                    buyDisplay.setText("You can buy one piece of clothing from Target!");
                }
                else if (money < 40)
                {
                    buyDisplay.setText("You can buy a dish from a steakhouse!");
                }
                else if(money < 80)
                {
                    buyDisplay.setText("You can buy a high quality video game!");
                }
                else
                {
                    buyDisplay.setText("You can buy at least 80 rubber ducks!");
                }
            }
        });

    }
}