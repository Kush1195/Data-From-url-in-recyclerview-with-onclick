package com.example.kushal.volleyclick;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>
{
    private List<List_Data> list_data;
    private Context context;

    public MyAdapter(List<List_Data> list_data, Context context)
    {
        this.list_data = list_data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_data, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        final List_Data listData = list_data.get(position);
        Picasso.with(context).load(listData.getImage_url()).into(holder.img);
        holder.txtname.setText(listData.getName());

        holder.img.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                    Intent intent = new Intent(context,DetailView.class);
                    intent.putExtra("name",listData.getName());
                    intent.putExtra("imageurl",listData.getImage_url());
                    context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return list_data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView img;
        private TextView txtname;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            img = (ImageView)itemView.findViewById(R.id.imageview);
            txtname = (TextView)itemView.findViewById(R.id.text_name);

        }
    }
}
