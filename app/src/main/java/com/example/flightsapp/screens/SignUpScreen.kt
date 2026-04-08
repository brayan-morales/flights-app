package com.example.flightsapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.flightsapp.R
import com.example.flightsapp.components.CustomButton
import com.example.flightsapp.components.CustomInput

@Composable
fun SignUpScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDBF0DD))
    ){
        Box(
            modifier = Modifier
                .size(260.dp)
                .offset(x = 190.dp, y = (-100).dp)
                .background(
                    color = Color(0xFF8CB79B).copy(alpha = 0.2f),
                    shape = CircleShape
                )
        )

        Box(
            modifier = Modifier
                .size(260.dp)
                .align(Alignment.BottomStart)
                .offset(x = (-100).dp, y = 80.dp)
                .background(
                    color = Color(0xFF8CB79B).copy(alpha = 0.2f),
                    shape = CircleShape
                )
        )

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var phone by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmPassword by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 100.dp, horizontal = 50.dp),
            horizontalAlignment = Alignment.Start
        ) {

            Text(
                text = stringResource(R.string.signup_title),
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(50.dp))

            CustomInput(
                value = name,
                onValueChange = { name = it },
                placeHolder = R.string.placeholder_name
            )

            Spacer(modifier = Modifier.height(30.dp))

            CustomInput(
                value = email,
                onValueChange = { email = it },
                placeHolder = R.string.placeholder_email
            )

            Spacer(modifier = Modifier.height(30.dp))

            CustomInput(
                value = phone,
                onValueChange = { phone = it },
                placeHolder = R.string.placeholder_phone
            )

            Spacer(modifier = Modifier.height(30.dp))

            CustomInput(
                value = password,
                onValueChange = { password = it },
                placeHolder = R.string.placeholder_password,
                isPassword = true
            )

            Spacer(modifier = Modifier.height(30.dp))

            CustomInput(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                placeHolder = R.string.placeholder_confirm_password,
                isPassword = true
            )

            Spacer(modifier = Modifier.height(40.dp))

            CustomButton(
                text = R.string.button_signup,
                onClick = { navController.navigate("login") }
            )

            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.signup_footer_account) + " ",
                    color = Color(0XFF235347),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Light
                )
                Text(
                    text = stringResource(R.string.signup_footer_login),
                    color = Color(0XFF235347),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable { navController.navigate("login") }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpScreenPreview() {
    val navController = rememberNavController()
    SignUpScreen(navController = navController)
}