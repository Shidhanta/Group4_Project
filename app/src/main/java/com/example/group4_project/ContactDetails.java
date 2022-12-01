package com.example.group4_project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ContactDetails extends AppCompatActivity {

    private ListView listView;
    private String details[] = {"Name :- ", "Contact Number :- ", "Email id :- ", "Address :- "};
    private String info[] = {"Sidhanta", "7777777789", "ssmc20149@nitw.ac.in", "XXX House, India - 99"};
    private Integer imageid[] = {R.drawable.god_of_war, R.drawable.south_park, R.drawable.god_of_war, R.drawable.south_park};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        // Setting header
        TextView textView = new TextView(this);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText("List of Contacts");

        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.addHeaderView(textView);
        // For populating list data
        ArrayAdapterProduct customProductList = new ArrayAdapterProduct(this, details, info, imageid);
        listView.setAdapter(customProductList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(), "You Selected " + details[position - 1] + " as contact details", Toast.LENGTH_SHORT).show();
            }
        });

    }
}