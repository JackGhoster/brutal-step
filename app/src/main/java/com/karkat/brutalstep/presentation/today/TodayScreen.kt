package com.karkat.brutalstep.presentation.today

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


@Composable
fun TodayScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = colorResource(R.color.BackgroundDark)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeadlineText(
            modifier = Modifier.padding(vertical = Dimensions.headlineVerticalPadding),
            text = stringResource(R.string.MainScreenTitle)
        )

        Spacer(modifier = Modifier.height(100.dp))
        TodayProgressInfo(modifier = Modifier.padding(horizontal = 30.dp),todaySteps = 5000, goalSteps = 10000)


        Spacer(modifier = Modifier.height(100.dp))

        Column (verticalArrangement = Arrangement.spacedBy(15.dp)){
            StatBox(amount = "500", statInfo = stringResource(R.string.MainScreenCalories))
            StatBox(amount = "2000", statInfo = stringResource(R.string.MainScreenDistance))
            StatBox(amount = "1", statInfo = stringResource(R.string.MainScreenQuestion))
        }
    }
}

@Preview
@Composable
private fun TodayScreenPreview() {
    TodayScreen()
}