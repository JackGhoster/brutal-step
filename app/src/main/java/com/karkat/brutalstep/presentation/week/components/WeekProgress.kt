package com.karkat.brutalstep.presentation.week.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karkat.brutalstep.ui.theme.BrutalStepTheme

@Composable
fun WeekProgress(modifier: Modifier = Modifier) {
   Row(
       modifier = modifier
           .fillMaxWidth()
           .padding(horizontal = 20.dp),
       horizontalArrangement = Arrangement.SpaceBetween,
       verticalAlignment = Alignment.CenterVertically
   )
   {
       DayStepProgressBar(percentage = 0.5f, date = "02.15", steps = 4000)
       DayStepProgressBar(percentage = 0.5f, date = "02.15", steps = 4000)
       DayStepProgressBar(percentage = 0.5f, date = "02.15", steps = 4000)
       DayStepProgressBar(percentage = 0.5f, date = "02.15", steps = 4000)
       DayStepProgressBar(percentage = 0.5f, date = "02.15", steps = 4000)
       DayStepProgressBar(percentage = 0.5f, date = "02.15", steps = 4000)
       DayStepProgressBar(percentage = 0.5f, date = "02.15", steps = 4000)

   }
}

@Preview
@Composable
private fun WeekProgressPreview() {
    BrutalStepTheme {
        WeekProgress()
    }
}