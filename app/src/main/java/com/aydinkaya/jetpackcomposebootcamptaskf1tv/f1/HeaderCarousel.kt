package com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1

import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.aydinkaya.jetpackcomposebootcamptaskf1tv.R
import com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1.data.RaceEvent

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HeaderCarousel(events: List<RaceEvent>) {
    // Initialize the pager state
    val pagerState = rememberPagerState(initialPage = 0, pageCount = { events.size })


    Column {
        // HorizontalPager with dynamic pageSize
        HorizontalPager(
            pageSize = PageSize.Fill,
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize()
        ) { page ->

            Column(
                modifier = Modifier.fillMaxWidth()
                //  .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = events[page].imageResId),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()

                )


                if (events.isNotEmpty()) {
                    val mainEvent = events.first()

                    Text(
                        text = mainEvent.description,
                        fontSize = 14.sp,
                        color = Color.White,
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .align(Alignment.CenterHorizontally),
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = { /*TODO: Implement watch now action*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                        shape = RoundedCornerShape(50),
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
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

        Spacer(modifier = Modifier.height(4.dp))

        // CustomPagerIndicator
        CustomPagerIndicator(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            pageSize = events.size,
            currentPage = pagerState.currentPage,
            activeColor = Color.Red,
            inactiveColor = Color.Gray
        )
    }
}

@Composable
fun CustomPagerIndicator(
    modifier: Modifier = Modifier,
    pageSize: Int,
    currentPage: Int,
    activeColor: Color,
    inactiveColor: Color,
    indicatorSize: Int = 8,
    spacing: Int = 4
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(spacing.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (i in 0 until pageSize) {
            Box(
                modifier = Modifier
                    .size(indicatorSize.dp)
                    .clip(CircleShape)
                    .background(if (i == currentPage) activeColor else inactiveColor)
            )
        }
    }
}
