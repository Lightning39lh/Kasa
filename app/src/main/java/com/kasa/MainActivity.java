package com.kasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btGames;
    Button btLearn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btGames=(Button)findViewById(R.id.btGames);
        btLearn=(Button)findViewById(R.id.btLearn);
        btGames.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
            Intent toGames = new Intent(MainActivity.this, Games.class);
            startActivity(toGames);
            }
        });
        btLearn.setOnClickListener(new View.OnClickListener()
        {
                      @Override
             public void onClick(View v) {
                   Intent toLearn = new Intent (MainActivity.this, Learn.class);
                   startActivity(toLearn);
        }
        });
    }
}
