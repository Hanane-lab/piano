package com.example.piano;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3,b4,b5,b6,b7 ;
    MediaPlayer mp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);

    }
    public void BellClick(View view){
        int id = view.getId();
        if(id == R.id.button1){
            mp=MediaPlayer.create(this,R.raw.a);
            mp.start();
        } else if(id == R.id.button2){
            mp.stop();
            mp=MediaPlayer.create(this,R.raw.b);
            mp.start();
        }else if(id == R.id.button3){
            mp.stop();
            mp=MediaPlayer.create(this,R.raw.c);
            mp.start();
        }
        else if(id == R.id.button4){
            mp.stop();
            mp=MediaPlayer.create(this,R.raw.d);
            mp.start();
        }
        else if(id == R.id.button5){
            mp.stop();
            mp=MediaPlayer.create(this,R.raw.e);
            mp.start();
        }
        else if (id == R.id.button6){
            mp.stop();
            mp=MediaPlayer.create(this,R.raw.f);
            mp.start();
        }else if (id == R.id.button7){
            mp.stop();
            mp=MediaPlayer.create(this,R.raw.g);
            mp.start();
        }
    }
}