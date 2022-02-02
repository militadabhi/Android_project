package com.example.individualproject;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class makeupAdapter extends RecyclerView.Adapter<makeupAdapter.MyViewHolder> {

    private List<makeup> mMakeup;

    public makeupAdapter(List<makeup> makeups){
        mMakeup = makeups;


    }

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        return new MyViewHolder(layoutInflater, parent);

    }

    public void onBindViewHolder(MyViewHolder holder,int position){

        makeup m =mMakeup.get(position);
        holder.imgProduct.setImageResource(m.getImage());
        holder.txtPrice.setText(Double.toString(m.getPrice()));
        holder.txtName.setText(m.getName());
        holder.txtDiscription.setText(m.getDiscription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DisplayActivity.class);
                i.putExtra("imageDisplay", m.getImage());
                i.putExtra("txtDisplayprice",m.getPrice());
                i.putExtra("txtDisplayname",m.getName());
                i.putExtra("txtDisplaydiscription",m.getDiscription());
                view.getContext().startActivity(i);



            }
        });

    }


    public int getItemCount() {
        return mMakeup.size();

    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imgProduct;
        TextView txtPrice;
        TextView txtName;
        TextView txtDiscription;
        public MyViewHolder(LayoutInflater inflater,ViewGroup parent){
            super(inflater.inflate(R.layout.raw_layout,parent,false));
            imgProduct = itemView.findViewById(R.id.imgProduct);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            txtName = itemView.findViewById(R.id.txtName);
            txtDiscription = itemView.findViewById(R.id.txtDiscription);


        }
    }
}
