package com.example.individualproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

    private List<makeup> makeupDb = new ArrayList<>();

    private RecyclerView rView;
    private RecyclerView.Adapter adapter;

    ImageView imgProduct;
    TextView txtname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        imgProduct = findViewById(R.id.imgProduct);
        txtname = findViewById(R.id.txtName);

        makeup sephora = new makeup(R.drawable.eyeshades,20.00,"Sephora","Highly pigmented nudes");
        makeup fenti = new makeup(R.drawable.eyeshades1,100.00,"Fenti","Highly pigmented Bolds");
        makeup fenti2 = new makeup(R.drawable.eyeshades,100.00,"Fenti","Highly pigmented nudes");
        makeup JC = new makeup(R.drawable.eyeshades1,50.00,"James Charles","All in one pallet");
        makeup rare = new makeup(R.drawable.eyeshades,80.00,"Rare","All naturals");

        makeupDb.add(sephora);
        makeupDb.add(fenti);
        makeupDb.add(fenti2);
        makeupDb.add(JC);
        makeupDb.add(rare);
        adapter= new makeupAdapter(makeupDb);

        rView = findViewById(R.id.rView);
        rView.setLayoutManager(new GridLayoutManager(this, 3));
        rView.setAdapter(adapter);


    }
}