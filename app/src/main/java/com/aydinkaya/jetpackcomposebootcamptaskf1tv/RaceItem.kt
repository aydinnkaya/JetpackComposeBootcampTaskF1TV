package com.aydinkaya.jetpackcomposebootcamptaskf1tv

data class RaceItem(
    val imageRes: Int,
    val title: String,
    val subtitle: String,
    val description: String
)

val raceItems = listOf(
    RaceItem(
        imageRes = R.drawable.f1,  // Replace with actual resource
        title = "F1: 2024 Italian Grand Prix",
        subtitle = "Race In 30",
        description = "Watch all the best moments from an unforgettable\n Italian Grand Prix."
    ),
    RaceItem(
        imageRes = R.drawable.f2,  // Replace with actual resource
        title = "F1: 2024 Italian Grand Prix",
        subtitle = "Race",
        description = "Race"
    ),
    RaceItem(
        imageRes = R.drawable.f1_3,  // Replace with actual resource
        title = "F1: 2024 Italian Grand Prix",
        subtitle = "Race Highlights",
        description = "Watch all the best moments from an unforgettable\n Italian Grand Prix."
    ),
    RaceItem(
        imageRes = R.drawable.f1_4,  // Replace with actual resource
        title = "F1: 2024 Italian Grand Prix",
        subtitle = "Pre-Race Show",
        description = "F1 Live brings you all the build-up\n to the Grand Prix."
    )
)
