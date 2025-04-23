package com.karkat.brutalstep.presentation.today.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karkat.brutalstep.R
import com.karkat.brutalstep.presentation.common.Dimensions

@Composable
fun HomeProgressBar(modifier: Modifier = Modifier, percentage: Float) {
    val clampedPercentage = percentage.coerceIn(0f, 1f)
    val cornerRadius = 16.dp

    val animatedProgress by animateFloatAsState(
        targetValue = clampedPercentage,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    )

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(Dimensions.progressBarThickness)
            .background(
                color = colorResource(R.color.ProgressBackgroundDark),
                shape = RoundedCornerShape(cornerRadius)
            )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(animatedProgress)
                .fillMaxHeight()
                .background(
                    color = colorResource(R.color.ProgressForegroundDark),
                    shape = RoundedCornerShape(
                        topStart = cornerRadius,
                        bottomStart = cornerRadius,
                        topEnd =  cornerRadius,
                        bottomEnd = cornerRadius
                    )
                )
        )
    }
}

@Preview
@Composable
private fun HomeProgressBarPreview() {
    HomeProgressBar(percentage = 0.25f)
}