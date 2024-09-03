package com.aydinkaya.jetpackcomposebootcamptaskf1tv

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun RaceItemCard(raceItem: RaceItem, onWatchNowClick: () -> Unit,modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .background(Color.Black),

    ) {
        Image(
            painter = painterResource(id = raceItem.imageRes),
            contentDescription = raceItem.title,
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp),
        )

        Spacer(modifier = Modifier.height(8.dp))


        Text(
            text = raceItem.description,
            color = Color.White,
            fontSize = 14.sp,
            modifier = Modifier.padding(horizontal = 11.dp, vertical = 4.dp)
            ,
            textAlign =  TextAlign.Center
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 100.dp), // Kenarlardan boşluk vermek için
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = onWatchNowClick,
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                modifier = Modifier
                    .wrapContentWidth()
                    .align(Alignment.CenterVertically) // Dikey olarak ortalar
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_play_arrow_24),
                    contentDescription = "",
                )
                Text("Watch now", color = Color.White)
            }
        }



        // Add dots for pagination or other items below
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            // Dots or other indicators
            Box(modifier = Modifier
                .size(8.dp)
                .background(Color.Gray)
                .padding(2.dp))
            Spacer(modifier = Modifier.width(4.dp))
            Box(modifier = Modifier
                .size(8.dp)
                .background(Color.Gray)
                .padding(2.dp))
            Spacer(modifier = Modifier.width(4.dp))
            Box(modifier = Modifier
                .size(8.dp)
                .background(Color.Gray)
                .padding(2.dp))
        }


    }
}


