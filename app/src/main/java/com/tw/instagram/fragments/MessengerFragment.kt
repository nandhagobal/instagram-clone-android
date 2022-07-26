package com.tw.instagram.fragments

import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.marginLeft
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
//                val navController = findNavController()
                Box(modifier = Modifier.fillMaxWidth()) {
                TopAppBar(modifier = Modifier.height(60.dp).fillMaxWidth(), backgroundColor = Color.Transparent, elevation = 0.dp) {
                    IconButton(onClick = {changeFragment(0)}) {
                        Icon(painter = painterResource(id = R.drawable.left_arrow_icon), contentDescription = "goback", modifier = Modifier
                            .fillMaxHeight()
                            .width(30.dp), tint = Color.Black)
                    }
                    Text(text = "nandhagobal2001", fontSize = 20.sp, fontWeight = FontWeight(800), color = Color.Black, modifier = Modifier.padding(horizontal = 30.dp, vertical = 0.dp))
                    Row(horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        Icon(
                            painter = painterResource(id = R.drawable.video_call_icon),
                            contentDescription = "video call"
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.add_room_icon),
                            contentDescription = "video call"
                        )
                    }
                }
                }

            }
        }
    }
}
