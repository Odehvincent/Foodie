package com.mad.foodie.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mad.foodie.R
import com.mad.foodie.componets.ButtonComponent
import com.mad.foodie.componets.ClickableLoginTextComponent
import com.mad.foodie.componets.DividerTextComponent
import com.mad.foodie.componets.HeadingText
import com.mad.foodie.componets.MyTextField

import com.mad.foodie.componets.NormalText
import com.mad.foodie.componets.UnderLinedNormalText
import com.mad.foodie.navigation.AuthAppRouter
import com.mad.foodie.navigation.Screen

@Composable
fun LoginScreen(){

    Surface (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ){
        Column( modifier = Modifier
            .fillMaxSize()) {


            NormalText(value = stringResource(id = R.string.login))
            HeadingText(value = stringResource(id = R.string.welcome))

            MyTextField(labelValue = stringResource(id = R.string.email_name),
                painterResource ( id = R.drawable.accounts))

            MyTextField(labelValue = stringResource(id = R.string.password),
                painterResource ( id = R.drawable.padlock))

            Spacer(modifier = Modifier.height(40.dp))
            UnderLinedNormalText(value = stringResource(id = R.string.forgot))

            Spacer(modifier = Modifier.height(40.dp))
            ButtonComponent(value = stringResource(id = R.string.login))

            Spacer(modifier = Modifier.height(20.dp))
            DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = false, onTextSelected = {
                AuthAppRouter.navigateTo(Screen.SignUpScreen)
            })

        }
    }
}
@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}
