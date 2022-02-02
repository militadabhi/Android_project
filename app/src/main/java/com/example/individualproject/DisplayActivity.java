package com.example.individualproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DisplayActivity extends AppCompatActivity {
    Button btncheckout ,btnAddtoCart;
    ImageView imgDisplay;
    TextView txtDisplayprice, txtDisplayname, txtDisplaydiscription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);



        btncheckout = findViewById(R.id.btnCheckout);
        btnAddtoCart = findViewById(R.id.btnAddtoCart);
        imgDisplay = findViewById(R.id.imgDisplay);
        txtDisplayprice = findViewById(R.id.txtDisplayprice);
        txtDisplayname=findViewById(R.id.txtDisplayname);
        txtDisplaydiscription=findViewById(R.id.txtDisplaydiscription);

        Intent i = getIntent();
        int image = i.getIntExtra("imageDisplay", 0);
        String name = i.getStringExtra("txtDisplayname");
        String discription = i.getStringExtra("txtDisplaydiscription");
        double price=i.getDoubleExtra("txtDisplayprice", 0);
        imgDisplay.setImageResource(image);
        txtDisplayprice.setText(Double.toString(price));
        txtDisplaydiscription.setText(discription);
        txtDisplayname.setText(name);



        btncheckout.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),CheckoutActivity.class);

                startActivity(i);
            }
        });

        btnAddtoCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });
    }
}