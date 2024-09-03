package com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1.data.RaceEvent
import com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1.data.RaceThumbnailEvent


@Composable
fun RaceReplaySection(events: List<RaceThumbnailEvent>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp)
    ) {
        Text(
            text = "2024 Italian Grand Prix",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(top = 8.dp)
        ) {
            events.forEach { event ->
                RaceThumbnail(event )
            }
        }
    }
}
