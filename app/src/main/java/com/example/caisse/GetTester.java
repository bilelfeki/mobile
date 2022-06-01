package com.example.caisse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetTester extends AppCompatActivity {
    TextView responsePlace;
/*
    public String fakeApi="https://reqres.in/api/users/2" ;
*/
    String fakeApi="https://mocki.io/v1/5c2beb19-cbf3-4f57-8594-185dae45f510" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_tester);

    }

    public void doget(String api){
        /**
         * make an instance of httpOk
         */
        OkHttpClient client = new OkHttpClient() ;
        /**
         * make the request with your api
         */
        Request request = new Request.Builder()
                .url(api)
                .build();
        /**
         * render your response in a text view
         */
        /******************************/
        /**
         * find the text where to render the response
         */
        responsePlace= findViewById(R.id.textView2);
        client.newCall(request).enqueue(
                new Callback() {
                    @Override
                    public void onFailure(@NonNull Call call, @NonNull IOException e) {
                        responsePlace.append("your response is failed");
                    }

                    @Override
                    public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                        if(response.isSuccessful()) {
                            final String ticket = response.body().string();
                            GetTester.this.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    responsePlace.append(ticket);
                                }
                            });
                        }
                    }

                });
    }

    @Override
    protected void onStart() {
        super.onStart();
        doget(fakeApi) ;
    }
}
