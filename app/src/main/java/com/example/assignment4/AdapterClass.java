package com.example.assignment4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<ViewHolderClass> {

    Context context;
    List<DataClass> item_list;

    public AdapterClass(Context context, List<DataClass> item_list) {
        this.context = context;
        this.item_list = item_list;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderClass(LayoutInflater.from(context).inflate(R.layout.recycler_view_style1, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {
        holder.company_name.setText(item_list.get(position).getName());
        holder.event_image.setImageResource(item_list.get(position).getImage_id());
    }

    @Override
    public int getItemCount() {
        return item_list.size();
    }
}
