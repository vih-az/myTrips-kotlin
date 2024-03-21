package br.senai.sp.jandira.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.PermIdentity
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
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
                    value = "",
                    onValueChange = {},
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
                    value = "",
                    onValueChange = {},
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
                        /*TODO*/
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
                        fontWeight = FontWeight.Black
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
fun GreetingPreview() {
    MyTripsTheme {
        Greeting()
    }
}

@Composable
fun CadastroTela(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
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
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Sign up",
                    color = Color(0xFFCF06F0),
                    fontWeight = FontWeight.Black,
                    fontSize = 32.sp
                )
                Text(
                    text = "Create a new account",
                    color = Color(0xFFA09C9C),
                )
            }
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp),
                contentAlignment = Alignment.Center
            ){
                Card(
                    modifier = Modifier
                        .size(80.dp),
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFF6F6F6))
                ){
                    Icon(
                        imageVector = Icons.Default.PermIdentity,
                        contentDescription = "icon",
                        modifier = Modifier
                            .fillMaxSize(),
                        tint = Color(0xFFCF06F0)
                    )
                }
                Card(
                    modifier = Modifier
                        .size(28.dp)
                        .offset(x = 28.dp, y = 28.dp),
                    shape = RectangleShape,
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent)
                ){
                    Icon(
                        imageVector = Icons.Default.AddAPhoto,
                        contentDescription = "icon",
                        tint = Color(0xFFCF06F0)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(text = "Username")
                    },
                    modifier = Modifier
                        .width(340.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFCF06F0))
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(text = "Phone")
                    },
                    modifier = Modifier
                        .width(340.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFCF06F0))
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(text = "E-mail")
                    },
                    modifier = Modifier
                        .width(340.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFCF06F0))
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(text = "Password")
                    },
                    modifier = Modifier
                        .width(340.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFCF06F0))
                )
            }
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Checkbox(
                        checked = false,
                        onCheckedChange = {},
                        colors = CheckboxDefaults.colors(uncheckedColor = Color(0xFFCF06F0))
                    )
                    Text(
                        text = "Over 18?"
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(340.dp)
                        .height(48.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFCF06F0)),
                    shape = RoundedCornerShape(14.dp)
                ) {
                   Text(
                       text = "CREATE ACCOUNT",
                       fontWeight = FontWeight.Black
                   )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 2.dp),
                horizontalArrangement = Arrangement.End
            ){
                Text(
                    text = "Already have an account?",
                    color = Color(0xFFA09C9C)
                )
                Spacer(modifier = Modifier
                    .width(2.dp))
                Text(
                    text = "Sign in",
                    color = Color(0xFFCF06F0),
                    fontWeight = FontWeight.Black
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ){
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
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CadastroTelaPreview(){
    MyTripsTheme {
        CadastroTela()
    }
}

@Composable
fun Trips(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column {
            Card {
                Column {
                    Column {
                        Card {

                        }
                        Text(text = )
                    }
                    Column {
                        Row {
                            Icon(imageVector = , contentDescription = )
                            Text(text = )
                        }
                        Text(text = )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TripsPreview(){
    MyTripsTheme{
        Trips()
    }
}