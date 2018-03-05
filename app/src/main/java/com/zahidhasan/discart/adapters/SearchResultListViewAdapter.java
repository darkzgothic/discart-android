package com.zahidhasan.discart.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zahidhasan.discart.R;
import com.zahidhasan.discart.model.Search;
import com.zahidhasan.discart.model.Suggestion;

import java.util.List;

/**
 * Created by auuntoo on 3/1/18.
 */

public class SearchResultListViewAdapter extends ArrayAdapter<Search> {
    private Activity context;
    private List<Search> searchList;

    public SearchResultListViewAdapter(Activity context, List<Search> searchList){
        super(context, R.layout.search_list_view, searchList);
        this.context = context;
        this.searchList = searchList;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.search_list_view, null, true);
//        TextView title = (TextView) listViewItem.findViewById(R.id.text_view);
//        ImageView imageView = (ImageView) listViewItem.findViewById(R.id.image_view);

//        Suggestion suggestion = suggestionList.get(position);
//        title.setText(suggestion.getTitle());
//        imageView.setImageResource(suggestion.getImage());
        return listViewItem;
    }
}
