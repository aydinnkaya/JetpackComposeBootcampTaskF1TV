package com.aydinkaya.jetpackcomposebootcamptaskf1tv

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp

@Composable
fun RaceItemList(raceItems: List<RaceItem>) {
    LazyRow(modifier = Modifier.fillMaxWidth()) {
        items(raceItems) { raceItem ->
            RaceItemCard(
                raceItem = raceItem,
                onWatchNowClick = { /* Handle click */ },
                modifier = Modifier
                    .width(LocalConfiguration.current.screenWidthDp.dp)


            )
        }
    }
}
