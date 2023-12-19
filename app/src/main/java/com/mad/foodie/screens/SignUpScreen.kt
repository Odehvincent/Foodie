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
import com.mad.foodie.componets.CheckboxComponent
import com.mad.foodie.componets.ClickableLoginTextComponent
import com.mad.foodie.componets.DividerTextComponent
import com.mad.foodie.componets.HeadingText
import com.mad.foodie.componets.MyTextField
import com.mad.foodie.componets.NormalText
import com.mad.foodie.componets.PasswordMyTextField
import com.mad.foodie.navigation.AuthAppRouter
import com.mad.foodie.navigation.Screen

@Composable
fun SignUpScreen() {

    Surface (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ){
        Column(
            modifier = Modifier.fillMaxSize()
        ){
            NormalText(value = stringResource(id = R.string.hello))
            HeadingText(value = stringResource(id = R.string.create))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextField(
                labelValue = stringResource(id = R.string.name),
                painterResource(id = R.drawable.accounts)
            )
            MyTextField(
                labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.accounts)
            )
            MyTextField(
                labelValue = stringResource(id = R.string.email_name),
                painterResource = painterResource(id = R.drawable.email)
            )
            PasswordMyTextField(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.padlock)
            )

            CheckboxComponent(value = stringResource(id = R.string.accept),
                    onTextSelected = {
                        AuthAppRouter.navigateTo(Screen.TermsAndConditionScreen)
                    })


            Spacer(modifier = Modifier.height(60.dp))
            // Register Button
            ButtonComponent(value = stringResource(id = R.string.okay))

            Spacer(modifier = Modifier.height(10.dp))
            //Line divider
            DividerTextComponent()


            // Login Link
            ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
                AuthAppRouter.navigateTo(Screen.LoginScreen)
            })
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SignUpScreen()
}