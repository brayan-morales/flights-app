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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
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
                text = "Create your\naccount",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(50.dp))

            CustomInput(
                value = name,
                onValueChange = { name = it },
                placeHolder = "Name"
            )

            Spacer(modifier = Modifier.height(30.dp))

            CustomInput(
                value = email,
                onValueChange = { email = it },
                placeHolder = "Email"
            )

            Spacer(modifier = Modifier.height(30.dp))

            CustomInput(
                value = phone,
                onValueChange = { phone = it },
                placeHolder = "Phone"
            )

            Spacer(modifier = Modifier.height(30.dp))

            CustomInput(
                value = password,
                onValueChange = { password = it },
                placeHolder = "Password",
                isPassword = true
            )

            Spacer(modifier = Modifier.height(30.dp))

            CustomInput(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                placeHolder = "Confirmar Contraseña",
                isPassword = true
            )

            Spacer(modifier = Modifier.height(40.dp))

            CustomButton(
                text = "SIGN UP",
                onClick = { navController.navigate("login") }
            )

            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Already have an account? ",
                    color = Color(0XFF235347),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Light
                )
                Text(
                    text = "Login",
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