package com.example.demoproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoproject.DataModelApi.Pojo;

import java.util.List;

public class ApiAdapter extends RecyclerView.Adapter<ApiAdapter.MyViewHolder> {
    List<Pojo.Root> fetchallData;

    public ApiAdapter(List<Pojo.Root> fetchallData) {
        this.fetchallData = fetchallData;
    }
    @NonNull
    @Override
    public ApiAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.apiitem, parent, false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ApiAdapter.MyViewHolder holder, int position) {
        holder.id_tv.setText(Integer.toString(position));
        holder.slug_tv.setText(fetchallData.get(position).toString());
        holder.store_id.setText(Integer.toString(position));
        holder.category_tv.setText(fetchallData.get(position).getCurrent_page());
        holder.deleted_tv.setText(fetchallData.get(position).getFirst_page_url());
        holder.name_tv.setText(fetchallData.get(position).getCurrent_page());

    }
    @Override
    public int getItemCount() {
           return fetchallData.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView id_tv,slug_tv,store_id,category_tv,deleted_tv,name_tv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id_tv = itemView.findViewById(R.id.id_tv);
            slug_tv = itemView.findViewById(R.id.slug_tv);
            store_id = itemView.findViewById(R.id.store_id);
            category_tv = itemView.findViewById(R.id.category_tv);
            deleted_tv = itemView.findViewById(R.id.deleted_tv);
            name_tv = itemView.findViewById(R.id.name_tv);
        }
    }
}