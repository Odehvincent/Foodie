package com.mad.foodie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mad.foodie.app.Auth
import com.mad.foodie.ui.theme.FoodieTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodieTheme {
                Auth()
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview(){
    Auth()
}
