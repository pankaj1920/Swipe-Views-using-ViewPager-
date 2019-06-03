package com.example.swipeviewsusingviewpager.ViewPager;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.swipeviewsusingviewpager.R;

import java.util.List;

public class HomeViewPagerAdapter extends PagerAdapter {
    List<ViewPagerItem> items;

    public HomeViewPagerAdapter(List<ViewPagerItem> items) {
        this.items = items;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext())
                .inflate(R.layout.home_viewpager_item, container, false);

        ImageView viewPagerImages = (ImageView) view.findViewById(R.id.viewPagerImages);
        TextView viewPagerTitle = (TextView) view.findViewById(R.id.viewPagerTitle);

        //Setting Image
        viewPagerTitle.setText(items.get(position).getViewPagerImages());
        viewPagerImages.setImageResource(items.get(position).viewPagerImages);
        container.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }


}
