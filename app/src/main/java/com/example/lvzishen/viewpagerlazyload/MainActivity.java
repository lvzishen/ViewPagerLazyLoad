package com.example.lvzishen.viewpagerlazyload;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    List<Fragment> fragmentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        Fragment payOrderFragment = DemoFragment.newInstance("0", "");
        Fragment unPayOrderFragment = DemoFragment.newInstance("1", "");
        Fragment payOrderHistoryFragment = DemoFragment.newInstance("2", "");
        fragmentList.add(payOrderFragment);
        fragmentList.add(unPayOrderFragment);
        fragmentList.add(payOrderHistoryFragment);
        viewPager.setOffscreenPageLimit(2);  //fragmentList.size()-1
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), (ArrayList<Fragment>) fragmentList);
        viewPager.setAdapter(adapter);
    }

    public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
        ArrayList<Fragment> list;

        public MyFragmentPagerAdapter(FragmentManager fm, ArrayList<Fragment> list) {
            super(fm);
            this.list = list;

        }


        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Fragment getItem(int arg0) {
            return list.get(arg0);
        }

        @Override
        public int getItemPosition(Object object) {
            return super.getItemPosition(object);
        }


    }
}


