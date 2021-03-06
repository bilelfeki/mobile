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

import com.example.caisse.R;

public class TicketListActivity extends AppCompatActivity {
    public final int x=0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_list);
        init() ;
    }
    public void init(){

        TableLayout ll = (TableLayout) findViewById(R.id.layout);
        int incremant  = 0 ;
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
                nameProduit.setText("id");
                nameProduit.setTextColor(Color.parseColor("#E7625F"));

                TextView priceProduct = new TextView(this);
                priceProduct.setText("      totalPrice");
                priceProduct.setTextColor(Color.parseColor("#E7625F"));

                row.addView(nameProduit);
                row.addView(qty);
                row.addView(priceProduct);
                ll.addView(row, i);
            } else {
                int x=0 ;
                String id = new String(i.toString());
                Integer prix = 5000;
                String price = new String(prix.toString());
                TableRow row = new TableRow(this);

                TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
                row.setLayoutParams(lp);

                TextView qty = new TextView(this);
                qty.setText(id);
                row.addView(qty);




                TextView nameProduit = new TextView(this);
                nameProduit.setText("   10");
                row.addView(nameProduit);

                TextView increment = new TextView(this);
                row.addView(increment);

                TextView priceProduct = new TextView(this);
                priceProduct.setText("     toatalPrice");
                priceProduct.setText(price);
                row.addView(priceProduct);


                ll.addView(row, i);

                Button myButton = new Button(this);
                myButton.setText("+");
                myButton.setId(i);
                myButton.setWidth(2);
                myButton.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                increment.setText(x);
                            }
                        }) ;
            }
        }
    }
}