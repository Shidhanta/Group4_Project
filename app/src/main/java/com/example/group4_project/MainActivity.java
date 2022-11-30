package com.example.group4_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating the instance of PopupMenu
                PopupMenu popup = new PopupMenu(MainActivity.this, button);
                //Inflating the Popup using menu file
                popup.getMenuInflater().inflate(R.menu.menu1, popup.getMenu());
                //registering popup with OnMenuItemClickListen
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(MainActivity.this, "You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        switch (item.getItemId()) {
                            case R.id.products:
                                Intent productDetailsIntent = new Intent(MainActivity.this, ProductDetails.class);
                                startActivity(productDetailsIntent);
                                break;
                            case R.id.contacts:
                                Intent contactsDetailsIntent = new Intent(MainActivity.this, ContactDetails.class);
                                startActivity(contactsDetailsIntent);
                                break;
                        }
                        return true;
                    }
                });
                popup.show();//showing popup menu
            }
        });
    }
}