package com.example.individualproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txteyeshade, txtlipsticks, txtfoundation;
    ImageView imgeyeshade, imglipsticks, imgfoundation , imghome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txteyeshade = findViewById(R.id.txteyeshade);
        txtlipsticks = findViewById(R.id.txtlipsticks);
        txtfoundation = findViewById(R.id.txtfoundation);

        imgeyeshade = findViewById(R.id.imgeyeshade);
        imgeyeshade.setImageResource(R.drawable.eyeshades1);
        imglipsticks = findViewById(R.id.imglipsticks);
        imglipsticks.setImageResource(R.drawable.lipsticks);
        imgfoundation = findViewById(R.id.imgfoundation);
        imgfoundation.setImageResource(R.drawable.foundation);
        imghome = findViewById(R.id.imghome);
        imghome.setImageResource(R.drawable.home2);





        txteyeshade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ProductActivity.class);
                startActivity(intent);
            }
        });

        txtlipsticks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ProductActivity.class);
                startActivity(intent);
            }
        });

        txtfoundation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ProductActivity.class);
                startActivity(intent);
            }
        });

        imgeyeshade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ProductActivity.class);
                startActivity(intent);
            }
        });

        imglipsticks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ProductActivity.class);
                startActivity(intent);
            }
        });

        imgfoundation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ProductActivity.class);
                startActivity(intent);
            }
        });


    }
}