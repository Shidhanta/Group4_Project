package com.example.group4_project;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ArrayAdapterProduct extends ArrayAdapter {
    private String[] productName;
    private String[] productPrice;
    private Integer[] imageid;
    private Activity context;

    public ArrayAdapterProduct(Activity context, String[] productNames, String[] productPrice, Integer[] imageid) {
        super(context, R.layout.row_item, productNames);
        this.context = context;
        this.productName = productNames;
        this.productPrice = productPrice;
        this.imageid = imageid;
    }

    @Override
public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            row = inflater.inflate(R.layout.row_item, null, true);
        TextView textViewPN = (TextView) row.findViewById(R.id.textViewProductName);
        TextView textViewPP = (TextView) row.findViewById(R.id.textViewProductPrice);
        ImageView image = (ImageView) row.findViewById(R.id.imageViewProduct);
        textViewPN.setText(productName[position]);
        textViewPP.setText(productPrice[position]);
        image.setImageResource(imageid[position]);
        return row;
    }
}


