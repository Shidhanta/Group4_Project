package com.example.group4_project;

import android.app.ListActivity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class ProductDetails extends ListActivity {
    private ListView listView;
    private String productNames[] = {"Product X", "Product Y"};
    private String productPrice[] = {"100", "200"};
    private Integer imageid[] = {R.drawable.god_of_war, R.drawable.south_park};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        Log.e("Checking : ", "Check product details");
        // Setting header
        TextView textView = new TextView(this);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText("List of Products");

        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.addHeaderView(textView);
        // For populating list data
        ArrayAdapterProduct customProductList = new ArrayAdapterProduct(this, productNames, productPrice, imageid);
        listView.setAdapter(customProductList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(), "You Selected " + productNames[position - 1] + " as Product", Toast.LENGTH_SHORT).show();
            }
        });

    }
}