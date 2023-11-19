package com.example.fragmentdemo.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fragmentdemo.fragment.AFragment;
import com.example.fragmentdemo.fragment.BFragment;
import com.example.fragmentdemo.fragment.CFragment;

public class ViewPagerMessengerAdapter extends FragmentPagerAdapter {
    public ViewPagerMessengerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new AFragment();
        }else if(position==1){
          return new BFragment();
        }else{
            return new CFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "CHAT";
        }else if(position==1){
            return "STATUS";
        }else{
            return "CALLS";
        }
    }
}
