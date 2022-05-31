package com.example.caisse;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class TicketListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_list);
        init() ;
    }
    public void init(){
        TableLayout ll = (TableLayout) findViewById(R.id.layout);


        for (Integer i = 0; i <23; i++) {
            if (i == 0) {
                String s = new String(i.toString());
                TableRow row = new TableRow(this);
                TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
                row.setLayoutParams(lp);

                TextView qty = new TextView(this);
                qty.setText("quantity");
                qty.setTextColor(Color.parseColor("#E7625F"));

                TextView nameProduit = new TextView(this);
                nameProduit.setText("name");
                nameProduit.setTextColor(Color.parseColor("#E7625F"));

                TextView priceProduct = new TextView(this);
                priceProduct.setText("price");
                priceProduct.setTextColor(Color.parseColor("#E7625F"));

                row.addView(qty);
                row.addView(priceProduct);
                row.addView(nameProduit);
                ll.addView(row, i);
            } else {
                String id = new String(i.toString());
                Integer prix = i*10;
                String price = new String(prix.toString());
                TableRow row = new TableRow(this);

                TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
                row.setLayoutParams(lp);

                TextView qty = new TextView(this);
                qty.setText(id);
                row.addView(qty);


                TextView nameProduit = new TextView(this);
                nameProduit.setText("croustina");
                row.addView(nameProduit);

                TextView priceProduct = new TextView(this);
                priceProduct.setText("price");
                priceProduct.setText(price);
                row.addView(priceProduct);


                ll.addView(row, i);

                Button myButton = new Button(this);
                myButton.setText("+");
                myButton.setId(i);
                myButton.setWidth(2);
                row.addView(myButton);

            }
        }
    }
}