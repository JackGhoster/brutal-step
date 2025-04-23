package com.karkat.brutalstep.presentation.settings

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karkat.brutalstep.R
import com.karkat.brutalstep.presentation.common.Dimensions
import com.karkat.brutalstep.presentation.common.HeadlineText
import com.karkat.brutalstep.presentation.settings.components.InputForm

@Composable
fun SettingsScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = colorResource(R.color.BackgroundDark)), horizontalAlignment = Alignment.CenterHorizontally) {
        HeadlineText(
            modifier = Modifier.padding(vertical = Dimensions.headlineVerticalPadding),
            text = stringResource(R.string.SettingTitle)
        )
        Image(
            imageVector = Icons.Rounded.AccountCircle,
            contentDescription = "",
            modifier = Modifier.width(120.dp).height(120.dp),
            colorFilter = ColorFilter.tint(color = colorResource(R.color.AccentDark))
        )

        Spacer(modifier = Modifier.height(60.dp))

        Column(modifier = Modifier.padding(horizontal = 25.dp),verticalArrangement = Arrangement.spacedBy(60.dp)) {
            InputForm(headlineText = stringResource(R.string.SettingsHeight))
            InputForm(headlineText = stringResource(R.string.SettingsWeight))
            InputForm(headlineText = stringResource(R.string.SettingsGoal))
        }
    }
}

@Preview
@Composable
private fun SettingsScreenPreview() {
    SettingsScreen()
}