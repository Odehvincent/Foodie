package com.mad.foodie.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mad.foodie.R
import com.mad.foodie.componets.HeadingText

@Composable
fun TermsAndConditionScreen(){
    Surface (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp)){

        HeadingText(value = stringResource(id = R.string.accepts))
    }
}

@Preview
@Composable
fun TermsAndConditionScreenPreview(){
    TermsAndConditionScreen()
}