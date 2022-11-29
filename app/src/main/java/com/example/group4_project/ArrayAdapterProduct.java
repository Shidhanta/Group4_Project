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
}
