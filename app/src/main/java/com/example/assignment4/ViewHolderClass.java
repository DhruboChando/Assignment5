package com.example.assignment4;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderClass extends RecyclerView.ViewHolder {
    ImageView event_image;
    TextView company_name;
    public ViewHolderClass(@NonNull View itemView) {
        super(itemView);

        event_image = itemView.findViewById(R.id.iv_event_image);
        company_name = itemView.findViewById(R.id.tv_company_name);

    }
}
