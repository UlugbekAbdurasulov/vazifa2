package com.example.vazifa1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.CollationElementIterator;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<Member> members;

    public CustomAdapter(Context context, List<Member> members) {
        this.context = context;
        this.members = members;
    }







    @Override
    public int getItemCount() {return members.size();}


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_custom_adapter, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(  @NonNull RecyclerView.ViewHolder holder, int position) {
        Member member = members.get(position);
        if (holder instanceof CustomViewHolder) {
            TextView first_name = ((CustomViewHolder) holder).first_name;
            TextView last_name = ((CustomViewHolder) holder).last_name;
            ImageView imageView = ((CustomViewHolder) holder).imageView;


            first_name.setText(member.getFrist_Name());
            last_name.setText(member.getLast_Name());
            imageView.setImageDrawable(member.getImage1());

        }
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView first_name;
        public TextView last_name;
        public ImageView imageView;

        public CustomViewHolder(View v){
            super(v);
            view = v;


            first_name = view.findViewById(R.id.first_name);
            last_name = view.findViewById(R.id.last_name);
            imageView = view.findViewById(R.id.imageView);

        }
    }
}