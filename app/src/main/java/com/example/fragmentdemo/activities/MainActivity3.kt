package com.example.fragmentdemo.activities

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.fragmentdemo.R.id
import com.example.fragmentdemo.R.layout
import com.example.fragmentdemo.fragment.AFragment
import com.example.fragmentdemo.fragment.BFragment
import com.example.fragmentdemo.fragment.CFragment
import com.example.fragmentdemo.fragment.DFragment
import com.example.fragmentdemo.fragment.EFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity3 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main3)
        val btmNavView: BottomNavigationView =findViewById(id.NavView)

        btmNavView.selectedItemId=(id.nav_profile)
        supportFragmentManager.beginTransaction().add(id.ContainerBottom,EFragment()).commit()

        btmNavView.setOnItemSelectedListener{onOptionsItemSelected->
             when(onOptionsItemSelected.itemId){
                id.nav_home ->{
                    loadFragment(AFragment())
                    true
                }

                id.nav_Search ->{
                    loadFragment(BFragment())
                    true
                }

                id.nav_utils ->{
                    loadFragment(CFragment())
                    true
                }

                id.nav_contactUs ->{
                    loadFragment(DFragment())
                    true
                }

                id.nav_profile ->{
                    loadFragment(EFragment())
                    true
                }else-> false
            }
        }
    }
    private fun loadFragment(fragment: Fragment) {
        val managerr=supportFragmentManager.beginTransaction()
        managerr.replace(id.ContainerBottom, fragment).commit()
    }

}


