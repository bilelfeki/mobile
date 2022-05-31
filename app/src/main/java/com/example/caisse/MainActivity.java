package com.example.caisse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    TextView txtString;
    public String url= "https://reqres.in/api/users/2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * test the get with OkHttp
         */

        txtString= findViewById(R.id.textView);
        Button b1 = findViewById(R.id.button);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, ProductListActivity.class);
                        startActivity(i);
                    }
                }) ;
        Button b2 = findViewById(R.id.tickets);
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, TicketListActivity.class);
                        startActivity(i);
                    }
                }) ;
    }
    @Override
    protected void onStart() {
        super.onStart();
        OkHttpClient client = new OkHttpClient() ;
        txtString.append(client.toString());
        Request request = new Request.Builder()
                .url(url)
                .build();
        txtString.append(request.toString());
        client.newCall(request).enqueue(
                new Callback() {
                    @Override
                    public void onFailure(@NonNull Call call, @NonNull IOException e) {
                        txtString.append(e.toString());
                    }

                    @Override
                    public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                        if(response.isSuccessful()){
                            final String ticket=response.body().string() ;
                            final String test=response.body().getClass().toString() ;
                            MainActivity.this.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {

                                    txtString.append("hhhh"+test + "hhh");
                                    txtString.append(ticket);
                                }
                            });
                        }
                    }
                }
        );
    }
}