package com.example.swipeviewsusingviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;

import com.example.swipeviewsusingviewpager.ViewPager.HomeViewPagerAdapter;
import com.example.swipeviewsusingviewpager.ViewPager.ViewPagerItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    HomeViewPagerAdapter homeViewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewPager);

        List<ViewPagerItem> viewPagerItems = new ArrayList<>();
        viewPagerItems.add(new ViewPagerItem(R.drawable.plant,"plants"));
        viewPagerItems.add(new ViewPagerItem(R.drawable.tree,"Tree"));
        viewPagerItems.add(new ViewPagerItem(R.drawable.city,"City"));
        viewPagerItems.add(new ViewPagerItem(R.drawable.sky,"Sky"));

    homeViewPagerAdapter = new HomeViewPagerAdapter(viewPagerItems);
    viewPager.setAdapter(homeViewPagerAdapter);
    viewPager.setPadding(130,0,0,130);

    viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    });


    }
}
