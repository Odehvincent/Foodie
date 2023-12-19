package com.mad.foodie.navigation

import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.runtime.staticCompositionLocalOf

private val LocalBackPressedDispatcher =
    staticCompositionLocalOf<OnBackPressedDispatcher?>{null}

private class ComposableBackNavigationHandler(enabled: Boolean) : OnBackPressedCallback(enabled){
   lateinit var onBackPressed: () -> Unit


    override fun handleOnBackPressed() {
        onBackPressed()
    }

}
// Need to finish it