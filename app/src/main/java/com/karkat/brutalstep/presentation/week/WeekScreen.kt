package com.karkat.brutalstep.presentation.week

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karkat.brutalstep.R
import com.karkat.brutalstep.presentation.common.Dimensions
import com.karkat.brutalstep.presentation.common.HeadlineText
import com.karkat.brutalstep.presentation.common.StatBox
import com.karkat.brutalstep.presentation.today.components.TodayProgressInfo
import com.karkat.brutalstep.presentation.week.components.WeekProgress

@Composable
fun WeekScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = colorResource(R.color.BackgroundDark)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeadlineText(
            modifier = Modifier.padding(vertical = Dimensions.headlineVerticalPadding),
            text = stringResource(R.string.WeekStatsTitle)
        )

        Spacer(modifier = Modifier.height(25.dp))

        WeekProgress()


        Spacer(modifier = Modifier.height(60.dp))

        Column (verticalArrangement = Arrangement.spacedBy(15.dp)){
            StatBox(amount = "20000", statInfo = stringResource(R.string.WeekScreenSteps))
            StatBox(amount = "2000", statInfo = stringResource(R.string.WeekScreenCalories))
            StatBox(amount = "0", statInfo = stringResource(R.string.WeekGoalReached))
        }
    }
}

@Preview
@Composable
private fun WeekScreenPreview() {
    WeekScreen()
}