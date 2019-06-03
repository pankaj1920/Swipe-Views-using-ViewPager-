package com.example.swipeviewsusingviewpager.ViewPager;

public class ViewPagerItem {
    int viewPagerImages;
    String viewPagerTitle;

    public ViewPagerItem(int viewPagerImages, String viewPagerTitle) {
        this.viewPagerImages = viewPagerImages;
        this.viewPagerTitle = viewPagerTitle;
    }

    public int getViewPagerImages() {
        return viewPagerImages;
    }

    public void setViewPagerImages(int viewPagerImages) {
        this.viewPagerImages = viewPagerImages;
    }

    public String getViewPagerTitle() {
        return viewPagerTitle;
    }

    public void setViewPagerTitle(String viewPagerTitle) {
        this.viewPagerTitle = viewPagerTitle;
    }
}
