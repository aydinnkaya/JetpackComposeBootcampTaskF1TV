package com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.aydinkaya.jetpackcomposebootcamptaskf1tv.R
import com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1.data.RaceEvent

@Composable
fun RaceIn30Section(events: List<RaceEvent>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        if (events.isNotEmpty()) {
            val mainEvent = events.first()


            Text(
                text = mainEvent.description,
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier.padding(horizontal = 10.dp)

            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /*TODO: Implement watch now action*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                modifier = Modifier
                    .width(24.dp)
                    .clip(shape = CircleShape)
                    .padding(vertical = 8.dp)
            ) {
               Icon(
                    painter = painterResource(id = R.drawable.baseline_play_arrow_24),
                    contentDescription = "",
                )
                Text(text = "Watch now", color = Color.White)
            }
        }
    }
}

