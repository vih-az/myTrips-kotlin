package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.mytrips.R

@Composable
fun Trips() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(modifier = Modifier
            .fillMaxSize()){
            Card {
                Image(
                    painter = painterResource(
                        id = R.drawable.imagemdeparis
                    ),
                    contentDescription = "imagem de paris"
                )
                Row {
                    Column {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.susanna
                            ),
                            contentDescription = "susanna"
                        )
                        Text(
                            text = "susanna hoffs"
                        )
                    }
                }
                Row {
                    Column {

                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun TripsPreview(){
    Trips()
}