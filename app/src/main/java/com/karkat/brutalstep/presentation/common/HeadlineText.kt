package com.karkat.brutalstep.presentation.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karkat.brutalstep.R

@Composable
fun HeadlineText(modifier: Modifier = Modifier, text: String) {
    Row (horizontalArrangement = Arrangement.Center){
        Text(
            text = text,
            modifier = modifier,
            color = colorResource(R.color.TextDark),
            fontWeight = FontWeight.Bold,
            fontSize = Dimensions.headline
        )
    }
}

@Preview
@Composable
private fun HeadlinePreview() {
    HeadlineText(text = stringResource(id = R.string.MainScreenTitle))
}