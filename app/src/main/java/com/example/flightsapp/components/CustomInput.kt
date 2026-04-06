package com.example.flightsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomInput(
    value: String,
    placeHolder: String,
    isPassword: Boolean = false,
    onValueChange: (String)-> Unit)
{
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        textStyle = TextStyle(
            color = Color(0xFF051F20),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal
        ),
        modifier = Modifier.fillMaxWidth(),
        visualTransformation =
            if (isPassword){
                PasswordVisualTransformation()
            } else{
                VisualTransformation.None
            },
        decorationBox = { innerTextField ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
            ) {
                Box(modifier = Modifier.fillMaxWidth()) {
                    if (value.isEmpty()) {
                        BasicText(
                            text = placeHolder,
                            style = TextStyle(
                                color = Color(0xFF235347),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Light
                            )
                        )
                    }
                    innerTextField()
                }

                Spacer(modifier = Modifier.height(8.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(2.dp)
                        .background(Color(0xFF8CB79B))
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun CustomInputPreview(){
    CustomInput( "", "Email", onValueChange = {})
}