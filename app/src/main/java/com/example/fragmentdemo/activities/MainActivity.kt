package com.example.fragmentdemo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

import androidx.fragment.app.FragmentTransaction
import com.example.fragmentdemo.R
import com.example.fragmentdemo.fragment.AFragment
import com.example.fragmentdemo.fragment.BFragment
import com.example.fragmentdemo.fragment.CFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val A:Button = findViewById(R.id.button)
        val B:Button = findViewById(R.id.button2)
        val C:Button = findViewById(R.id.button3)
        val tabLayout:FloatingActionButton=findViewById(R.id.Tab2)
        val bottomNav:FloatingActionButton=findViewById(R.id.bottomNav)
        val drawlayout:FloatingActionButton=findViewById(R.id.Drawer)
        loafFragment(BFragment(),0)
        A.setOnClickListener() {
            loafFragment(AFragment(),1)
            }
        B.setOnClickListener() {
            loafFragment(BFragment(),1)
        }
        C.setOnClickListener() {
            loafFragment(CFragment(),1)
        }
        tabLayout.setOnClickListener(){
            val intent=Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        bottomNav.setOnClickListener{
            val intentt=Intent(this, MainActivity3::class.java)
            startActivity(intentt)
        }
        drawlayout.setOnClickListener{
            val intt=Intent(this,MainActivity4::class.java)
            startActivity(intt)
        }
    }
    private fun loafFragment(fragment: Fragment,flag:Int){
        if(flag==0){
        val manager: FragmentTransaction =supportFragmentManager.beginTransaction().add(R.id.container,fragment)
        manager.commit()
        }
        else{
            val manager: FragmentTransaction =supportFragmentManager.beginTransaction().replace(R.id.container,fragment)
            manager.commit()
        }
    }
}
