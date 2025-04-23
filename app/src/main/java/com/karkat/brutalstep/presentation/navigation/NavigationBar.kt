package com.karkat.brutalstep.presentation.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.karkat.brutalstep.R
import com.karkat.brutalstep.presentation.common.Dimensions
import com.karkat.brutalstep.ui.theme.BrutalStepTheme

@Composable
fun NavigationBar(modifier: Modifier = Modifier) {
    Row(modifier = modifier
        .background(colorResource(R.color.AccentDark))
        .fillMaxWidth()
        .height(Dimensions.navHeight), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically){
        NavigationButton(drawable = R.drawable.settings, text = stringResource( R.string.SettingsNav))
        NavigationButton(drawable = R.drawable.home, text = stringResource( R.string.MainScreenNav))
        NavigationButton(drawable = R.drawable.week, text = stringResource( R.string.WeekStatsNav))
    }
}

@Preview
@Composable
private fun NavPreview() {
    BrutalStepTheme {
        NavigationBar()
    }
}