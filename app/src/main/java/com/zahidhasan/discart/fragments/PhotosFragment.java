package com.zahidhasan.discart.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zahidhasan.discart.R;
import com.zahidhasan.discart.adapters.PhotosRecyclerViewAdapter;
import com.zahidhasan.discart.model.Category;
import com.zahidhasan.discart.model.Photo;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhotosFragment extends Fragment {

    private GridLayoutManager lLayout;

    public PhotosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_photos, container, false);

        List<Photo> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(getContext(), 3);

        RecyclerView rView = (RecyclerView)v.findViewById(R.id.recyclerview);
        rView.setHasFixedSize(true);
        rView.setFocusable(false);
        rView.setLayoutManager(lLayout);

        PhotosRecyclerViewAdapter rcAdapter = new PhotosRecyclerViewAdapter(getContext(), rowListItem);
        rView.setAdapter(rcAdapter);

        return v;
    }
    private List<Photo> getAllItemList(){

        List<Photo> allItems = new ArrayList<Photo>();
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));
        allItems.add(new Photo("Anto", R.drawable.category_24dp));

        return allItems;
    }

}
