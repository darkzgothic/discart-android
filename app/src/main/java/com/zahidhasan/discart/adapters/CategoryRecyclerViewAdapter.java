package com.zahidhasan.discart.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zahidhasan.discart.R;
import com.zahidhasan.discart.model.Category;

import java.util.List;

/**
 * Created by auuntoo on 2/27/18.
 */

public class CategoryRecyclerViewAdapter extends RecyclerView.Adapter<CategoryRecyclerViewHolders>{

    private List<Category> categoryList;
    private Context context;

    public CategoryRecyclerViewAdapter(Context context, List<Category> categoryList) {
        this.categoryList = categoryList;
        this.context = context;
    }
    @Override
    public CategoryRecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_grid_view, null);
        CategoryRecyclerViewHolders rcv = new CategoryRecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(CategoryRecyclerViewHolders holder, int position) {
        holder.title.setText(categoryList.get(position).getTitle());
        holder.image.setImageResource(categoryList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return this.categoryList.size();
    }
}
