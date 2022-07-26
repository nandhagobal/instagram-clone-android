package com.tw.instagram.adapters

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tw.instagram.fragments.ContainerFragment
import com.tw.instagram.fragments.HomeFragment
import com.tw.instagram.fragments.MessengerFragment

class HomeFragmentPagerAdapter(fragment: Fragment, val fragmentChangeHandler : (Int)-> Unit) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
//        val functionProvider :(Int)-> Unit = {position:Int-> changeFragment(position = position)}
        return if(position == 0){
            ContainerFragment(fragmentChangeHandler)
        }
        else {
            MessengerFragment(fragmentChangeHandler)
        }
    }
    private fun changeFragment(position:Int){
        Log.e("instagram","Going inside the changeFragment")
        createFragment(position)
    }

}
