package com.jpakku.daggerhiltexploration

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.jpakku.daggerhiltexploration.ui.DaggerHiltExplorationTheme
import dagger.hilt.android.AndroidEntryPoint

// @AndroidEntryPoint = needed if dependency is injected to an Android Component Class
// Android Component Classes = classes that come from Android Framework (Activity, Fragments, Service, etc.)

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DaggerHiltExplorationTheme {
                val viewModel = hiltViewModel<MyViewModel>()
            }
        }
    }
}