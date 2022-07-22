package com.tw.instagram.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.tw.instagram.R

class MessengerFragment(val changeFragment: (Int) -> Unit) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                val navController = findNavController()
                Box() {
                TopAppBar(modifier = Modifier.wrapContentHeight(), backgroundColor = Color.Transparent, elevation = 0.dp) {
                    IconButton(onClick = {changeFragment(0)}) {
                        Icon(painter = painterResource(id = R.drawable.left_arrow_icon), contentDescription = "goback")
                    }
                    Text(text = "Messenger")
                }
                }

            }
        }
    }
}
