package com.mad.foodie.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.mad.foodie.navigation.AuthAppRouter
import com.mad.foodie.navigation.Screen
import com.mad.foodie.screens.LoginScreen
import com.mad.foodie.screens.SignUpScreen
import com.mad.foodie.screens.TermsAndConditionScreen

@Composable
fun Auth(){
    //Surface are containers we can define
    Surface(modifier = Modifier.fillMaxSize(),
        color = Color.White
    ){
        Crossfade(targetState =AuthAppRouter.currentScreen, label = "Screen Transition") {
            currentState->
            when(currentState.value){
               is Screen.SignUpScreen ->{
                   SignUpScreen()
               }
                is Screen.TermsAndConditionScreen ->{
                    TermsAndConditionScreen()
                }
//                is Screen.LoginScreen ->{
//                    LoginScreen()
//                }

                else -> {}
            }
        }

        }
    }


//Testing
//@Composable
//fun Auth() {
//    Surface(
//        modifier = Modifier.fillMaxSize(),
//        color = Color.White
//    ) {
//        Crossfade(targetState = AuthAppRouter.currentScreen, label = "Screen Transition") { currentState ->
//            when (currentState.value) {
//                is Screen.SignUpScreen -> SignUpScreen()
//                is Screen.TermsAndConditionScreen -> TermsAndConditionsScreen()
//                is Screen.LoginScreen -> LoginScreen()
//                else -> {}
//            }
//        }
//    }
//}

