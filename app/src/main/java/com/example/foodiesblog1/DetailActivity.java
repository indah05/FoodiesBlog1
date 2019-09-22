package com.example.foodiesblog1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    private ImageView detailPhoto;
    private TextView detailName, detailStep, detailBahan;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle("Detail");

        // receive data
        Intent intentDetail = getIntent();
        String photo = intentDetail.getExtras().getString("Photo");
        String name = intentDetail.getExtras().getString("Name");
        String detail = intentDetail.getExtras().getString("Detail");
        String bahan = intentDetail.getExtras().getString("Bahan");

        detailPhoto = findViewById(R.id.img_detail_photo);
        detailName = findViewById(R.id.tv_detail_name);
        detailBahan = findViewById(R.id.tv_detail_bahan);
        detailStep = findViewById(R.id.tv_detail_step);

        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions())
                .into(detailPhoto);
        detailName.setText(name);
        detailBahan.setText(bahan);
        detailStep.setText(detail);

    }
}
