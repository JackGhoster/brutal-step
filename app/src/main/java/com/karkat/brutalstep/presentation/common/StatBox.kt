package com.karkat.brutalstep.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.room.util.TableInfo
import com.karkat.brutalstep.R
import com.karkat.brutalstep.ui.theme.BrutalStepTheme

@Composable
fun StatBox(modifier: Modifier = Modifier, amount: String, statInfo: String) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .height(Dimensions.infoBoxHeight)
        .background(color = colorResource(R.color.AccentBoxDark)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = amount,
            fontSize = Dimensions.infoBoxHeadline,
            fontWeight = FontWeight.Bold,
            color = colorResource( R.color.AccentDark )
        )

        Text(
            text = statInfo,
            fontSize = Dimensions.infoBoxText,
            fontWeight = FontWeight.Medium,
            color = colorResource( R.color.AccentBoxLight )
        )
    }
}

@Preview
@Composable
private fun StatBoxPreview() {
    BrutalStepTheme {
        StatBox(amount = "200", statInfo = stringResource(R.string.MainScreenCalories))
    }
}