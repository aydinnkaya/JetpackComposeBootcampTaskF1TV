package com.aydinkaya.jetpackcomposebootcamptaskf1tv

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun F1TVHomeScreen() {
    Scaffold(
        topBar = { F1TVTopBar() },
        content = { paddingValues ->  // Use paddingValues to account for any insets
            Box(modifier = Modifier.padding(paddingValues).fillMaxSize()) {
                RaceItemList(raceItems = raceItems)
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun F1TVHomeScreenPreview() {
    F1TVHomeScreen()
}