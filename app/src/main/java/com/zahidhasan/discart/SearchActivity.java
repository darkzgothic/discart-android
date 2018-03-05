package com.zahidhasan.discart;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zahidhasan.discart.fragments.SuggetsionsFragment;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        SuggetsionsFragment fragment = new SuggetsionsFragment();
        ft.replace(R.id.search_scrollView, fragment, fragment.getTag()).commit();

    }
}
