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
    private String details[] = {"Name  ", "Contact Number  ", "Email id  ", "Address  "};
    private String info[] = {"Dr. M.Sandhya", "+91 98749*****", "drmsandhya@nitw.ac.in", "XXX House, India - 99"};
    private Integer imageid[] = {R.drawable.ui, R.drawable.pi, R.drawable.ei, R.drawable.li};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);
        this.setTitle("Contact Description");

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