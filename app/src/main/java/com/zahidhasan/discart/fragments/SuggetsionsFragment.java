package com.zahidhasan.discart.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.zahidhasan.discart.R;
import com.zahidhasan.discart.adapters.SuggestionListViewAdapter;
import com.zahidhasan.discart.model.Suggestion;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SuggetsionsFragment extends Fragment {

    private ListView listView;
    private List<Suggestion> suggestionList;

    public SuggetsionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_suggetsions, container, false);

        listView = (ListView)v.findViewById(R.id.list_view);
        suggestionList = new ArrayList<>();
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));
        suggestionList.add(new Suggestion("Top Rated", R.drawable.category_24dp));

        SuggestionListViewAdapter adapter = new SuggestionListViewAdapter(getActivity(), suggestionList);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                SearchResultFragment searchResultFragment = new SearchResultFragment();
                ft.replace(R.id.search_scrollView, searchResultFragment, searchResultFragment.getTag()).commit();
            }
        });

        return v;
    }

}
