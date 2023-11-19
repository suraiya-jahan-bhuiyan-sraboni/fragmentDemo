package com.example.fragmentdemo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.fragmentdemo.R
import com.example.fragmentdemo.adapters.ViewPagerMessengerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val tab:TabLayout=findViewById(R.id.Tablayout)
        val viewPager:ViewPager=findViewById(R.id.viewpager)
        val adapter =
            ViewPagerMessengerAdapter(
                supportFragmentManager
            )
        viewPager.adapter=adapter
        tab.setupWithViewPager(viewPager)

    }
}