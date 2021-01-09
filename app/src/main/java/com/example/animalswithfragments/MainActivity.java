package com.example.animalswithfragments;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabs;
    private ViewPager2 viewPager;
    private String array[] = {"List", "Details"};

    ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager_id);
        tabs = findViewById(R.id.activity_tabs);

        viewPager.setAdapter(viewPagerAdapter);

        new TabLayoutMediator(tabs, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(array[position]);
            }
        }).attach();

    }

    public void onClick(View view)
    {
        viewPager.setCurrentItem(1);
    }
}