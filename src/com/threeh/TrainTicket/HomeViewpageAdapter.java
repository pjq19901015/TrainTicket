package com.threeh.trainticket;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class HomeViewpageAdapter extends FragmentPagerAdapter   {
    private int mCount = CONTENT.length;
    protected static final int[] CONTENT = new int[] {
            R.drawable.picture1,
            R.drawable.picture2,
            R.drawable.picture3
    };

    public HomeViewpageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TestFragment.newInstance(CONTENT[position % CONTENT.length]);
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
      return null;
    }

    public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }
}