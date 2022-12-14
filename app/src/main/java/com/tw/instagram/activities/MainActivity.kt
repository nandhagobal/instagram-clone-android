package com.tw.instagram.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tw.instagram.R
import com.tw.instagram.di.homeModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val navController = Navigation.findNavController(this,R.id.NavFragmentContainer)
//        val navigationBar = findViewById<BottomNavigationView>(R.id.bottomNavigationBar)
//        NavigationUI.setupWithNavController(navigationBar,navController)
        startKoin{
            androidLogger()
            androidContext(this@MainActivity)
            modules(homeModule)
        }
    }
}