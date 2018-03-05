package com.zahidhasan.discart.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zahidhasan.discart.R;
import com.zahidhasan.discart.model.Photo;

import java.util.List;

/**
 * Created by auuntoo on 3/5/18.
 */

public class PhotosRecyclerViewAdapter extends RecyclerView.Adapter<PhotosRecyclerViewHolders>{

    private List<Photo> photoList;
    private Context context;

    public PhotosRecyclerViewAdapter(Context context, List<Photo> photoList) {
        this.photoList = photoList;
        this.context = context;
    }
    @Override
    public PhotosRecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.photos_grid_view, null);
        PhotosRecyclerViewHolders rcv = new PhotosRecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(PhotosRecyclerViewHolders holder, int position) {
        holder.image.setImageResource(photoList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return this.photoList.size();
    }
}
