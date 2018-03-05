package com.zahidhasan.discart.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.zahidhasan.discart.R;

public class CategoryRecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView title;
    public ImageView image;

    public CategoryRecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        title = (TextView)itemView.findViewById(R.id.gridview_text);
        image = (ImageView)itemView.findViewById(R.id.gridview_image);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), title.getText(), Toast.LENGTH_SHORT).show();
    }
}
