package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnRoll = (Button) findViewById(R.id.roll);
        final ImageView imgDice = (ImageView) findViewById(R.id.diceImg);

        btnRoll.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random =  new Random();
                int randNumber = random.nextInt(6) + 1;

                if (randNumber == 1) imgDice.setImageResource(R.drawable.dice_1);
                else if (randNumber == 2) imgDice.setImageResource(R.drawable.dice_2);
                else if (randNumber == 3) imgDice.setImageResource(R.drawable.dice_3);
                else if (randNumber == 4) imgDice.setImageResource(R.drawable.dice_4);
                else if (randNumber == 5) imgDice.setImageResource(R.drawable.dice_5);
                else imgDice.setImageResource(R.drawable.dice_6);

                Toast.makeText(MainActivity.this, "Dice Rolled", Toast.LENGTH_SHORT).show();
            }
        });
    }
}