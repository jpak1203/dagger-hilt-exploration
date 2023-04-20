package com.jpakku.daggerhiltexploration.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun DaggerHiltExplorationTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        content = content
    )
}