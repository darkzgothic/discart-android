package com.zahidhasan.discart;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.zahidhasan.discart.fragments.CategoryFragment;
import com.zahidhasan.discart.fragments.ListFragment;
import com.zahidhasan.discart.fragments.MeFragment;

public class UserMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        if (getSupportActionBar() != null){
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        }

        CategoryFragment fragment = new CategoryFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame_layout, fragment, fragment.getTag()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                switch (item.getItemId()) {
                    case R.id.action_item_category:
                        CategoryFragment cfragment = new CategoryFragment();
                        ft.replace(R.id.frame_layout, cfragment, cfragment.getTag());
                        ft.commit();
                        break;
                    case R.id.action_item_list:
                        ListFragment lfragment = new ListFragment();
                        ft.replace(R.id.frame_layout, lfragment, lfragment.getTag());
                        ft.commit();
                        break;
                    case R.id.action_item_me:
                        MeFragment mfragment = new MeFragment();
                        ft.replace(R.id.frame_layout, mfragment, mfragment.getTag());
                        ft.commit();
                        break;
                }
                return true;
            }
        });

    }
}
