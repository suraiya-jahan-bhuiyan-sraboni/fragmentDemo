package com.example.fragmentdemo.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragmentdemo.R
import com.example.fragmentdemo.activities.MainActivity3
import com.example.fragmentdemo.ui.login.LoginActivity


class EFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_e, container, false)
        val login:Button=view.findViewById(R.id.loginBtn)
        login.setOnClickListener {
            val intent=Intent(view.context,LoginActivity::class.java)
            startActivity(intent)
        }
        return view
    }

}