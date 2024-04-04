package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TelaLogin(controleNavegacao:){
    var emailState = remember {
        mutableStateOf("")
    }
    var senhaState = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ){
            Card(
                modifier = Modifier
                    .height(40.dp)
                    .width(140.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                shape = RoundedCornerShape(bottomStart = 14.dp)
            ){}
        }
        Column(
            modifier = Modifier
                .padding(start = 14.dp)
        ){
            Text(
                text = "Login",
                color = Color(0xFFCF06F0),
                fontSize = 48.sp,
                fontWeight = FontWeight.Black
            )
            Text(
                text = "Please sign in to continue",
                color = Color(0xFFA09C9C)
            )
        }
        Column(
            modifier = Modifier
                .padding(start = 14.dp)
                .fillMaxWidth()
                .height(340.dp),
            verticalArrangement = Arrangement.SpaceAround
        ){
            Column {
                OutlinedTextField(
                    value = emailState.value,
                    onValueChange = {
                                    emailState.value = it
                    },
                    label = {
                        Text(
                            text = "E-mail"
                        )
                    },
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFCF06F0), focusedBorderColor = Color(0xFFCF06F0)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 14.dp, bottom = 14.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "email icon",
                            tint = Color(0xFFCF06F0)
                        )
                    }
                )
                OutlinedTextField(
                    value = senhaState.value,
                    onValueChange = {
                                    senhaState.value = it
                    },
                    label = {
                        Text(
                            text = "Password"
                        )
                    },
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFCF06F0), focusedBorderColor = Color(0xFFCF06F0)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 14.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "password icon",
                            tint = Color(0xFFCF06F0)
                        )
                    }
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 14.dp)
                    .height(70.dp),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.SpaceBetween
            ){
                Button(
                    onClick = {
                              controleNavegacao.navigate("home")
                    },
                    modifier = Modifier
                        .width(140.dp)
                        .height(44.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFCF06F0))
                ) {
                    Text(
                        text = "SIGN IN",
                        modifier = Modifier
                            .padding(end = 4.dp),
                        fontWeight = FontWeight.Black
                    )
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "Sign in"
                    )
                }
                Row{
                    Text(
                        text = "Don't have an account?",
                        color = Color(0xFFA09C9C),
                        modifier = Modifier
                            .padding(end = 4.dp)
                    )
                    Text(
                        text = "Sign up",
                        color = Color(0xFFCF06F0),
                        fontWeight = FontWeight.Black,
                        modifier = Modifier
                            .clickable {
                                controleNavegacao.navigate("cadastroTela")
                            }
                    )
                }
            }
        }
        Row{
            Card(
                modifier = Modifier
                    .height(40.dp)
                    .width(140.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                shape = RoundedCornerShape(topEnd = 14.dp)
            ){}
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaLoginPreview(){
    TelaLogin()
}