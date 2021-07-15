package com.Kchienja.test


import androidx.compose.foundation.layout.*

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.Kchienja.test.ui.theme.DeepBlue
import androidx.compose.foundation.background

@Composable
fun DetailScreen(name: String?)
{
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.background(DeepBlue).fillMaxSize(),

    ){
        Text(text = "Hello, $name")
    }
}