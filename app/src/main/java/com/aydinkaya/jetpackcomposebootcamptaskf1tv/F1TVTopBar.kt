package com.aydinkaya.jetpackcomposebootcamptaskf1tv

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun F1TVTopBar() {
    TopAppBar(
        title = {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center // Center the image horizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.f1_tv_logo_preview_rev_1),
                    contentDescription = "F1 TV Logo",
                    modifier = Modifier.size(100.dp)
                )
            }


        },
        navigationIcon = {
            IconButton(onClick = { /* Handle navigation icon press */ }) {
                Icon(
                    painter = painterResource(id =R . drawable . baseline_menu_24 ) ,
                    contentDescription = null
                )
            }
        },
        actions = {
            Row {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_search_24),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF0A0D14),
            titleContentColor = Color.White,
            actionIconContentColor = Color.White
        ),
        modifier = Modifier.fillMaxWidth(),


        )
}
