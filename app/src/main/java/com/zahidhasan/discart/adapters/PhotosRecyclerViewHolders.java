package com.zahidhasan.discart.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.zahidhasan.discart.R;

/**
 * Created by auuntoo on 3/5/18.
 */

public class PhotosRecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public ImageView image;

    public PhotosRecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        image = (ImageView)itemView.findViewById(R.id.gridview_image);
        image.setTag("Helllo");
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), image.getTag().toString(), Toast.LENGTH_SHORT).show();
    }

}
