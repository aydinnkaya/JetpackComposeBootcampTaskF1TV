package com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1.data.RaceEvent
import com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1.data.RaceThumbnailEvent

@Composable
fun RaceThumbnail(raceThumbnailEvent: RaceThumbnailEvent) {
    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(150.dp)
            .padding(end = 8.dp)
    ) {
        Image(
            painter = painterResource(id = raceThumbnailEvent.imageResId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(100.dp)
                .clip(RoundedCornerShape(8.dp))
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = raceThumbnailEvent.title,
            fontSize = 14.sp,
            color = Color.White,
            modifier = Modifier.align(Alignment.Start)
        )

        Text(
            text = raceThumbnailEvent.time,
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.align(Alignment.Start)
        )

        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(20.dp)
                    .width(2.dp)
                    .background(Color.Red),

            )

            Text(
                text = raceThumbnailEvent.formulaCategory,
                color = Color.White,
                fontWeight =  FontWeight.Bold,
                fontSize = 14.sp,

            )

        }

        }
}
