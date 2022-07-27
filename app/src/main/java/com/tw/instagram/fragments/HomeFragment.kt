package com.tw.instagram.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tw.instagram.R
import com.tw.instagram.adapters.PostAdapter
import com.tw.instagram.databinding.FragmentHomeBinding
import com.tw.instagram.viewmodels.HomeViewModel
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

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
        binding.postRecyclerView.adapter = PostAdapter()
        binding.postRecyclerView.layoutManager = LinearLayoutManager(binding.postRecyclerView.context)
        val decoration = DividerItemDecoration(binding.postRecyclerView.context, DividerItemDecoration.VERTICAL)
        binding.postRecyclerView.addItemDecoration(decoration)
        val viewModel : HomeViewModel by viewModel()
        binding.messengerIcon.setOnClickListener{
//            navController.navigate(HomeFragmentDirections.actionHomeFragmentToMessengerFragment2())
        }
    }
}