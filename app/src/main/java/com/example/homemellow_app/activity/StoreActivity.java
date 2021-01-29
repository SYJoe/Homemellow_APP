package com.example.homemellow_app.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homemellow_app.R;
import com.example.homemellow_app.data.StoreData;
import com.example.homemellow_app.data.StoreResponse;
import com.example.homemellow_app.network.RetrofitClient;
import com.example.homemellow_app.network.ServiceApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StoreActivity extends AppCompatActivity {
    private TextView nameText;
    private TextView costText;
    private ImageView itemImg;
    private ServiceApi service;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.store_item);

            nameText = (TextView) findViewById(R.id.textView1);
            costText = (TextView) findViewById(R.id.textView2);
            itemImg = (ImageView) findViewById(R.id.imageView);

            service = RetrofitClient.getClient().create(ServiceApi.class);


            loadData(new StoreData());

        }

        private void loadData(StoreData data) {
            service.storeData(data).enqueue(new Callback<StoreResponse>() {
                @Override
                public void onResponse(Call<StoreResponse> call, Response<StoreResponse> response) {
                    StoreResponse result = response.body();
                    //Toast.makeText(StoreActivity.this, result.getMessage(), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(Call<StoreResponse> call, Throwable t) {
                    Toast.makeText(StoreActivity.this, "네트워크 에러 발생", Toast.LENGTH_SHORT).show();
                    Log.e("네트워크 에러 발생", t.getMessage());
                }
            });
        }
    }
