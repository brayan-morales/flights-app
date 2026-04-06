package com.example.flightsapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
fun LoginScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0XFFDBF0DD))

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.banner_diagonal),
                contentDescription = "Banner Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            Column(
                modifier = Modifier
                    .padding(30.dp)
            ) {
                Text(
                    text = "Welcome\nBack",
                    color = Color.White,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = "Enter your credentials to access your account",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.plane),
                contentDescription = "Main Image",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(155.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            CustomInput(
                value = email,
                onValueChange = { email = it },
                placeHolder = "Email"
            )

            Spacer(modifier = Modifier.height(30.dp))

            CustomInput(
                value = password,
                onValueChange = { password = it },
                placeHolder = "Password",
                isPassword = true
            )

            Spacer(modifier = Modifier.height(40.dp))

            CustomButton(
                text = "LOGIN",
                onClick = { }
            )

            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Don't have an account? ",
                    color = Color(0XFF235347),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Light
                )
                Text(
                    text = "Register",
                    color = Color(0XFF235347),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable {navController.navigate("signup")}
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    val navController = rememberNavController()
    LoginScreen(navController = navController)
}