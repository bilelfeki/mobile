package com.example.caisse.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.caisse.R;
import com.example.caisse.backend.GetTesterActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * test the get with OkHttp
         */


        Button productList = findViewById(R.id.button);
        productList.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, ProductListActivity.class);
                        startActivity(i);
                    }
                }) ;
        Button TicketList = findViewById(R.id.tickets);
        TicketList.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, TicketListActivity.class);
                        startActivity(i);
                    }
                }) ;

        Button GetTester = findViewById(R.id.button2);
        GetTester.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, GetTesterActivity.class);
                        startActivity(i);
                    }
                }) ;
        /**
         * this test is similar to get a product
         * but the spring project is not hosted and
         * on a real api and that's make a problem
         */

    }
    @Override
    protected void onStart() {
        super.onStart();


    }
}