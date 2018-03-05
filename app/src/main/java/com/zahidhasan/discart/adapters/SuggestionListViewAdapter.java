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
import com.zahidhasan.discart.model.Suggestion;

import java.util.List;

/**
 * Created by auuntoo on 3/1/18.
 */

public class SuggestionListViewAdapter extends ArrayAdapter<Suggestion> {
    private Activity context;
    private List<Suggestion> suggestionList;

    public SuggestionListViewAdapter(Activity context, List<Suggestion> suggestionList){
        super(context, R.layout.suggestion_list_view, suggestionList);
        this.context = context;
        this.suggestionList = suggestionList;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.suggestion_list_view, null, true);
        TextView title = (TextView) listViewItem.findViewById(R.id.text_view);
        ImageView imageView = (ImageView) listViewItem.findViewById(R.id.image_view);

        Suggestion suggestion = suggestionList.get(position);
        title.setText(suggestion.getTitle());
        imageView.setImageResource(suggestion.getImage());
        return listViewItem;
    }
}
