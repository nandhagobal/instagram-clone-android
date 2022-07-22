package com.tw.instagram.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.tw.instagram.HomeFragmentPagerAdapter
import com.tw.instagram.R

class PagerFragment : Fragment() {
    lateinit var viewPager: ViewPager2
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_viewer, container, false)
        viewPager = view.findViewById<ViewPager2>(R.id.homeMessageViewPager)
        setPagerAdapter()
        return view;
    }

    private fun setPagerAdapter() {
        val fragmentChangeHandler : (Int) -> Unit = {position:Int -> viewPager.currentItem = position}
        viewPager.adapter = HomeFragmentPagerAdapter(this,fragmentChangeHandler)
    }
}