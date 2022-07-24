package com.tw.instagram.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgument
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tw.instagram.R

class ContainerFragment(val changeFragmentHandler: (Int)->Unit): Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_container,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navController = Navigation.findNavController(view.findViewById(R.id.NavFragmentContainer2))
        val navigationBar = view.findViewById<BottomNavigationView>(R.id.bottomNavigationBar)
        NavigationUI.setupWithNavController(navigationBar,navController)
//        navController.graph.addArgument("changeFragmentHandler",changeFragmentHandler)
        super.onViewCreated(view, savedInstanceState)
    }
}