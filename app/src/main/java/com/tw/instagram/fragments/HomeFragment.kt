package com.tw.instagram.fragments

import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tw.instagram.R

class HomeFragment(val changeFragment: (Int)->Unit): Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navController = findNavController()
        super.onViewCreated(view, savedInstanceState)
        val messageIcon = view.findViewById<ImageView>(R.id.messengerIcon)
        messageIcon.setOnClickListener{
            changeFragment(1)
        }
    }
}