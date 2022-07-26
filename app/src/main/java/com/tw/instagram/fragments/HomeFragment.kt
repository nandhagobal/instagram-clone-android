package com.tw.instagram.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tw.instagram.R
//import com.tw.instagram.adapters.PostAdapter
import com.tw.instagram.databinding.FragmentHomeBinding

class HomeFragment(): Fragment() {

     private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding.postRecyclerView.adapter = PostAdapter()
        binding.messengerIcon.setOnClickListener{
//            navController.navigate(HomeFragmentDirections.actionHomeFragmentToMessengerFragment2())
        }
    }
}