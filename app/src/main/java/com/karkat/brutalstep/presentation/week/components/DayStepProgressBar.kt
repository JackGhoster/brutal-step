package com.karkat.brutalstep.presentation.week.components

import android.health.connect.datatypes.units.Percentage
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karkat.brutalstep.R
import com.karkat.brutalstep.presentation.common.Dimensions
import com.karkat.brutalstep.ui.theme.BrutalStepTheme

@Composable
fun DayStepProgressBar(
    modifier: Modifier = Modifier,
    percentage: Float,
    date: String,
    steps: Int
) {
    val clampedPercentage = percentage.coerceIn(0f, 1f)
    val cornerRadius = 16.dp

    val animatedProgress by animateFloatAsState(
        targetValue = clampedPercentage,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    )

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = date,
            color = colorResource(R.color.TextDark),
            fontWeight = FontWeight.Light,
            fontSize = Dimensions.weekDayDate,
        )

        Box(
            modifier = Modifier
                .height(255.dp)
                .width(Dimensions.progressBarThickness)
                .background(
                    color = colorResource(R.color.ProgressBackgroundDark),
                    shape = RoundedCornerShape(cornerRadius)
                )
        ) {
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .fillMaxHeight(animatedProgress)
                    .background(
                        color = colorResource(R.color.ProgressForegroundDark),
                        shape = RoundedCornerShape(
                            topStart = cornerRadius ,
                            bottomStart = cornerRadius,
                            topEnd = cornerRadius,
                            bottomEnd = cornerRadius
                        )
                    )
            )
        }

        Text(
            text = steps.toString(),
            color = colorResource(R.color.TextDark),
            fontWeight = FontWeight.Medium,
            fontSize = Dimensions.weekDaySteps,
        )
    }
}

@Preview
@Composable
private fun DayStepProgressBarPreview() {
    BrutalStepTheme {
        DayStepProgressBar(percentage = 0.5f, date = "02.15", steps = 5000 )
    }

}