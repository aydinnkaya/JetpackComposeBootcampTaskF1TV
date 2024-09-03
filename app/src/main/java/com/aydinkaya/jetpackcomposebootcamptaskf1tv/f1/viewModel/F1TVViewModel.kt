package com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aydinkaya.jetpackcomposebootcamptaskf1tv.R
import com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1.data.RaceEvent
import com.aydinkaya.jetpackcomposebootcamptaskf1tv.f1.data.RaceThumbnailEvent
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class F1TVViewModel : ViewModel() {
    private val _raceEvents = MutableStateFlow<List<RaceEvent>>(emptyList())
    val raceEvents: StateFlow<List<RaceEvent>> = _raceEvents

    private val _raceThumbnails = MutableStateFlow<List<RaceThumbnailEvent>>(emptyList())
    val raceThumbnails: StateFlow<List<RaceThumbnailEvent>> = _raceThumbnails

    init {
        // Load or set your race events
        _raceEvents.value = listOf(
            RaceEvent(
                R.drawable.f1,
                "Watch all the best moments from an unforgettable Italian Grand Prix",
            ),
            RaceEvent(R.drawable.f2, "Race In 30"),
            RaceEvent(R.drawable.f1_3, "Race In 30"),
            RaceEvent(R.drawable.f1_4, "Race In 30")            // Add more RaceEvent objects here
        )

        _raceThumbnails.value = listOf(
            RaceThumbnailEvent(
                imageResId = R.drawable.f1,
                title = "Race In 30",
                time = "00.29:56",
                formulaCategory = "F1"
            ),
            RaceThumbnailEvent(
                imageResId = R.drawable.f2,
                title = "Race ",
                time = "01.49.26",
                formulaCategory = "F1"
            ),
            RaceThumbnailEvent(
                imageResId = R.drawable.f1_3,
                title = "Race Highlights",
                time = "00.08.05",
                formulaCategory = "F1"
            ),
            RaceThumbnailEvent(
                imageResId = R.drawable.f1_4,
                title = "Race In 30",
                time = "3:00 PM",
                formulaCategory = "F3"
            ),
            RaceThumbnailEvent(
                imageResId = R.drawable.f1_4,
                title = "Race In 30",
                time = "3:00 PM",
                formulaCategory = "Formula 1"
            )
        )

    }
}

class F1TVViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(F1TVViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return F1TVViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

