package com.example.kushal.volleyclick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailView extends AppCompatActivity
{
    private TextView nametxt;
    private ImageView fullimg;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);

        nametxt=(TextView)findViewById(R.id.name_txt);
        fullimg=(ImageView)findViewById(R.id.full_image);

        Intent i=getIntent();

        String name=i.getStringExtra("name");
        String imageurl=i.getStringExtra("imageurl");

        nametxt.setText(name);

        Picasso.with(this)
                .load(imageurl)
                .into(fullimg);
    }
}
