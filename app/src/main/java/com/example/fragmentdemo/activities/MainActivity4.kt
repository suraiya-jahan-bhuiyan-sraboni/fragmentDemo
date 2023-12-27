package com.example.fragmentdemo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.fragmentdemo.R
import com.example.fragmentdemo.fragment.AFragment
import com.example.fragmentdemo.fragment.BFragment
import com.example.fragmentdemo.fragment.CFragment
import com.example.fragmentdemo.fragment.DFragment
import com.example.fragmentdemo.fragment.EFragment
import com.google.android.material.navigation.NavigationView

class MainActivity4 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
      private lateinit var toggle: ActionBarDrawerToggle
   private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        drawerLayout=findViewById(R.id.drawLayout)
        val navigationView: NavigationView =findViewById(R.id.nav_Drawer)
        val toolbar: Toolbar =findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        toggle = ActionBarDrawerToggle(this,drawerLayout,toolbar, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navigationView.setNavigationItemSelectedListener(this)
        if(savedInstanceState==null){
            val manage=supportFragmentManager.beginTransaction()
            manage.add(R.id.fragmentContainerView, AFragment()).commit()
            navigationView.setCheckedItem(R.id.home)
        }
    }
        @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            @Suppress("DEPRECATION")
            super.onBackPressed()
        }
    }
        override fun onNavigationItemSelected(item: MenuItem): Boolean{
            when(item.itemId) {
                R.id.home -> loadFragment(AFragment())

               R. id.Search -> loadFragment(BFragment())

               R. id.utils -> loadFragment(CFragment())

                R.id.contactUs -> loadFragment(DFragment())

               R. id.profile -> loadFragment(EFragment())

                R.id.logout ->{
                    Toast.makeText(this, "Logged Out", Toast.LENGTH_SHORT).show()
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            return true
        }

    private fun loadFragment(fragment: Fragment) {
        val managerr=supportFragmentManager.beginTransaction()
        managerr.replace(R.id.fragmentContainerView, fragment).commit()
    }
}