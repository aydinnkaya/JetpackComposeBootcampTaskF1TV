package com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1

import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.aydinkaya.jetpackcomposebootcamptaskf1tv.F1TVTopBar
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.unit.dp
import com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1.viewModel.F1TVViewModel
import com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1.viewModel.F1TVViewModelFactory

@Composable
fun F1TVApp(viewModel: F1TVViewModel = viewModel(factory = F1TVViewModelFactory())) {
    val raceEvents = viewModel.raceEvents.collectAsState()
    val raceThumbnailEvent = viewModel.raceThumbnails.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color(0xFF0A0D14))
    ) {
        F1TVTopBar()
        HeaderCarousel(events = raceEvents.value)
      //  RaceIn30Section(events = raceEvents.value)
        RaceReplaySection(events = raceThumbnailEvent.value)
    }
}
