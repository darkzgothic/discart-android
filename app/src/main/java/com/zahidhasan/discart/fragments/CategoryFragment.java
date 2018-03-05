package com.zahidhasan.discart.fragments;


import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zahidhasan.discart.R;
import com.zahidhasan.discart.SearchActivity;
import com.zahidhasan.discart.adapters.CategoryRecyclerViewAdapter;
import com.zahidhasan.discart.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {

    private GridLayoutManager lLayout;

    public static CategoryFragment newInstance() {
        CategoryFragment fragment = new CategoryFragment();
        return fragment;
    }

    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_category, container, false);

        TextView search = (TextView)v.findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), SearchActivity.class));
            }
        });

        List<Category> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(getContext(), 3);

        RecyclerView rView = (RecyclerView)v.findViewById(R.id.recyclerview);
        rView.setHasFixedSize(true);
        rView.setFocusable(false);
        rView.setLayoutManager(lLayout);

        CategoryRecyclerViewAdapter rcAdapter = new CategoryRecyclerViewAdapter(getContext(), rowListItem);
        rView.setAdapter(rcAdapter);

        return v;
    }

    private List<Category> getAllItemList(){

        List<Category> allItems = new ArrayList<Category>();
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));
        allItems.add(new Category("Sharee Store", R.drawable.restaurant_64dp));
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));
        allItems.add(new Category("Restaurent", R.drawable.restaurant_64dp));

        return allItems;
    }

}
