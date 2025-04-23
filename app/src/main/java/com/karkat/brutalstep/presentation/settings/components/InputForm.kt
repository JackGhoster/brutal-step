package com.karkat.brutalstep.presentation.settings.components

import android.content.res.Resources.Theme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.sharp.AddCircle
import androidx.compose.material.icons.sharp.Clear
import androidx.compose.material.icons.sharp.Search
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.karkat.brutalstep.R
import com.karkat.brutalstep.presentation.common.Dimensions
import com.karkat.brutalstep.ui.theme.BrutalStepTheme

@Composable
fun InputForm(modifier: Modifier = Modifier, headlineText: String) {
    Column (modifier = Modifier.background(color = colorResource( R.color.BackgroundDark))){
        Text(
            text = headlineText,
            modifier = modifier,
            fontWeight = FontWeight.Bold,
            fontSize = Dimensions.inputFormHeadline,
            color = colorResource(R.color.TextDark)
        )

        TextField(
            value = headlineText,
            onValueChange = {  },
            modifier = modifier.fillMaxWidth(),
            label = { Text("") },
            leadingIcon = null
            ,
            trailingIcon = {
                Icon(
                    imageVector = Icons.Rounded.Clear,
                    contentDescription = "Search icon",
                    tint = colorResource(R.color.AccentDark)
                )
            },
            singleLine = true,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(
                onSearch = { /* Handle search action */ }
            ),
            colors = TextFieldDefaults.colors(
                unfocusedTextColor = colorResource(R.color.TextDark),
                unfocusedContainerColor = colorResource(R.color.BackgroundDark),
                focusedContainerColor = colorResource(R.color.BackgroundDark),
                disabledIndicatorColor = colorResource(R.color.AccentDark),
                focusedIndicatorColor = colorResource(R.color.AccentDark),
                unfocusedIndicatorColor = colorResource(R.color.AccentDark)
            )
        )
    }
}

@Preview
@Composable
private fun InputFormPreview() {
    BrutalStepTheme{
        Column {
            InputForm(headlineText = stringResource(id = R.string.SettingsHeight))
        }
    }
}