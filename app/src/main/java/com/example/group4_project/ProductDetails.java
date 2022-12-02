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
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetails extends AppCompatActivity {

    private ListView listView;
    private String productNames[] = {"God Of War", "Apex: Ledgend", "Call Of Duty", "Hallow Knight"};
    private String productPrice[] = {"Price: 100$", "Price: 200$", "Price: 300$", "Price: 400$"};
    private Integer imageid[] = {R.drawable.gow, R.drawable.apex, R.drawable.cod, R.drawable.hk};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        this.setTitle("List Of Products");

        Log.e("Checking : ", "Check product details");
        // Setting header
        TextView textView = new TextView(this);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText("Products");

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