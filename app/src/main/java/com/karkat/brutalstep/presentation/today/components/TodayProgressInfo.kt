package com.karkat.brutalstep.presentation.today.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.karkat.brutalstep.R
import com.karkat.brutalstep.presentation.common.Dimensions

@Composable
fun TodayProgressInfo(modifier: Modifier = Modifier, todaySteps: Int, goalSteps: Int) {
    val percentage = todaySteps.toFloat() / goalSteps.toFloat()

    Column (modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(Dimensions.infoStepsSpacingBetweenElements)){
        Row {
            Text(
                text = todaySteps.toString(),
                color = colorResource(R.color.TextDark),
                fontWeight = FontWeight.Bold,
                fontSize = Dimensions.stepsProgress
            )
            Text(
                text = "/",
                color = colorResource(R.color.AccentDark),

                fontWeight = FontWeight.Bold,
                fontSize = Dimensions.stepsProgress
            )
            Text(
                text = goalSteps.toString(),
                color = colorResource(R.color.AccentDark),

                fontWeight = FontWeight.Bold,
                fontSize = Dimensions.stepsProgress
            )
        }

        HomeProgressBar(percentage = percentage)

        Text(
            text = stringResource(R.string.MainScreenSteps),
            color = colorResource(R.color.TextDark),

            fontWeight = FontWeight.Bold,
            fontSize = Dimensions.stepsTodayText
        )

    }
}

@Preview
@Composable
private fun TodayProgressPreview() {
    TodayProgressInfo(todaySteps = 3000, goalSteps = 8000)
}