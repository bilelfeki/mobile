package com.example.caisse.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.caisse.ProductLigne;
import com.example.caisse.R;

import java.util.ArrayList;

public class ProductListActivity extends AppCompatActivity {

    ArrayList<ProductLigne>  products = new ArrayList<>() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        /**
         * fake initialisation
         */
        products.add(new ProductLigne(1,"croustina",5000));
        products.add(new ProductLigne(2,"bagette",5000));
        products.add(new ProductLigne(3,"major",200));
        products.add(new ProductLigne(4,"chokotom",7000));
        products.add(new ProductLigne(5,"sablitou",7850));
        products.add(new ProductLigne(5,"sablitou",7850));
        products.add(new ProductLigne(5,"sablitou",7850));
        products.add(new ProductLigne(5,"sablitou",7850));
        products.add(new ProductLigne(5,"sablitou",7850));
        products.add(new ProductLigne(5,"sablitou",7850));
        products.add(new ProductLigne(5,"sablitou",7850));
        products.add(new ProductLigne(5,"sablitou",7850));
        products.add(new ProductLigne(5,"sablitou",7850));

        generateDynamicView() ;

        Button gotoTicket = findViewById(R.id.ticket);
        gotoTicket.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(ProductListActivity.this, TicketListActivity.class);
                        startActivity(i);
                    }
    });
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    public void generateDynamicView(){
        TableLayout ll = (TableLayout) findViewById(R.id.layout);


        for (Integer i = 0; i <products.size(); i++) {
            if (i == 0) {
                String s = new String(i.toString());
                TableRow row = new TableRow(this);
                TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
                row.setLayoutParams(lp);

                TextView idProduct = new TextView(this);
                idProduct.setText("id");
                idProduct.setTextColor(Color.parseColor("#E7625F"));

                TextView nameProduit = new TextView(this);
                nameProduit.setText("name");
                nameProduit.setTextColor(Color.parseColor("#E7625F"));

                TextView priceProduit = new TextView(this);
                priceProduit.setText("price");
                priceProduit.setTextColor(Color.parseColor("#E7625F"));


                row.addView(idProduct);
                row.addView(nameProduit);
                row.addView(priceProduit);
                ll.addView(row, i);
            } else {
                String s = new String(i.toString());

                TableRow row = new TableRow(this);
                TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
                row.setLayoutParams(lp);

                TextView idProduct = new TextView(this);
                idProduct.setText(products.get(i).getId().toString());



                TextView priceProduit = new TextView(this);
                priceProduit.setText(products.get(i).getPrice().toString());
                priceProduit.setTextColor(Color.parseColor("#E7625F"));


                TextView nameProduit = new TextView(this);
                nameProduit.setText(products.get(i).getName());


                Button addButton = new Button(this);
                addButton.setText("+");
                addButton.setId(i);
                addButton.setWidth(1);


                row.addView(idProduct);
                row.addView(nameProduit);
                row.addView(priceProduit);
                row.addView(addButton);

                ll.addView(row, i);
            }
        }


    }
}