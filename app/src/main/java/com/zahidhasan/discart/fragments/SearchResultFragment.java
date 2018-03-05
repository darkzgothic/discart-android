package com.zahidhasan.discart.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.zahidhasan.discart.CompanyActivity;
import com.zahidhasan.discart.R;
import com.zahidhasan.discart.adapters.SearchResultListViewAdapter;
import com.zahidhasan.discart.model.Search;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchResultFragment extends Fragment {

    private ListView listView;
    private List<Search> searchList;

    public SearchResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_search_result, container, false);

        listView = (ListView)v.findViewById(R.id.list_view);
        searchList = new ArrayList<>();

        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));
        searchList.add(new Search("Anto", "Anto", R.drawable.category_24dp, "7.4"));

        SearchResultListViewAdapter adapter = new SearchResultListViewAdapter(getActivity(), searchList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView name = view.findViewById(R.id.name);
                Toast.makeText(getContext(), name.getText(), Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getContext(), CompanyActivity.class));
            }
        });
        return v;
    }

}
