package com.example.fragmentdemo.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentdemo.R
import com.example.fragmentdemo.fragment.AFragment
import com.example.fragmentdemo.fragment.BFragment
import com.example.fragmentdemo.fragment.CFragment
import com.example.fragmentdemo.fragment.DFragment
import com.example.fragmentdemo.fragment.EFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val btmNavView: BottomNavigationView =findViewById(R.id.NavView)
        btmNavView.selectedItemId=(R.id.nav_profile)
       supportFragmentManager.beginTransaction().add(R.id.ContainerBottom,EFragment()).commit()
        btmNavView.setOnItemSelectedListener{onOptionsItemSelected->
             when(onOptionsItemSelected.itemId){
                R.id.nav_home ->{
                    val manager=supportFragmentManager.beginTransaction()
                    manager.replace(R.id.ContainerBottom,AFragment()).commit()
                    true
                }

                R.id.nav_Search ->{
                    val manager=supportFragmentManager.beginTransaction()
                    manager.replace(R.id.ContainerBottom, BFragment()).commit()
                    true
                }

                R.id.nav_utils ->{
                    val manager=supportFragmentManager.beginTransaction()
                    manager.replace(R.id.ContainerBottom, CFragment()).commit()
                    true
                }

                R.id.nav_contactUs ->{
                    val manager=supportFragmentManager.beginTransaction()
                    manager.replace(R.id.ContainerBottom, DFragment()).commit()
                    true
                }

                R.id.nav_profile ->{
                    val manager=supportFragmentManager.beginTransaction()
                    manager.replace(R.id.ContainerBottom, EFragment()).commit()
                    true
                }else-> false
            }
        }
    }

}