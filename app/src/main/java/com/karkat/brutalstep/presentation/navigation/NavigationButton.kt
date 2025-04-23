package com.karkat.brutalstep.presentation.navigation

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karkat.brutalstep.R
import com.karkat.brutalstep.presentation.common.Dimensions
import com.karkat.brutalstep.presentation.common.Dimensions.navButtonWidth
import com.karkat.brutalstep.presentation.common.Dimensions.navIconWidth
import com.karkat.brutalstep.ui.theme.BrutalStepTheme

@Composable
fun NavigationButton(modifier: Modifier = Modifier, drawable: Int, text: String) {
    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally){
        IconButton(
            modifier = modifier
                .width(navButtonWidth)
                .height(navButtonWidth)
                ,
            onClick = {},
        ) {
            Icon(modifier = modifier.width(navIconWidth).height(navIconWidth).background(color = Color.Unspecified, shape = RoundedCornerShape(0.dp)),painter = painterResource(drawable), contentDescription = null, tint = Color.Unspecified)
        }
        Text(
            text = text,
            fontSize = Dimensions.navText,
            color = colorResource(id = R.color.BackgroundDark),
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
private fun NavButtonPreview() {
    BrutalStepTheme {
        NavigationButton(drawable = R.drawable.home, text = "Home")
    }
}