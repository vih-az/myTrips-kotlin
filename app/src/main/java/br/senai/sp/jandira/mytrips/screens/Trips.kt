package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddLocation
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.repositorio.ViagemRepositorio
import br.senai.sp.jandira.mytrips.utilitarios.encurtadorDeDatas

@Composable
fun Trips() {
    val cards = ViagemRepositorio().listarTodasAsViagens()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ){
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)){
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RectangleShape
            ){
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Image(
                        painter = painterResource(
                            id = R.drawable.imagemdeparis
                        ),
                        contentDescription = "imagem de paris",
                        contentScale = ContentScale.Crop
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceBetween
                    ){
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ){
                            Column(
                                horizontalAlignment = Alignment.End,
                                modifier = Modifier.padding(19.dp)
                            ) {
                                Image(
                                    painter = painterResource(
                                        id = R.drawable.susanna
                                    ),
                                    contentDescription = "susanna",
                                    modifier = Modifier.height(59.dp).width(59.dp)
                                )
                                Text(
                                    text = "susanna hoffs",
                                    color = Color.White
                                )
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            Column(
                                modifier = Modifier
                                    .padding(horizontal = 19.dp, vertical = 7.dp)
                            ){
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ){
                                    Icon(
                                        imageVector = Icons.Default.LocationOn,
                                        contentDescription = " ",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .height(14.dp)
                                    )
                                    Text(
                                        text = "You`re in Paris",
                                        color = Color.White,
                                        fontSize = 14.sp
                                    )
                                }
                                Text(
                                    text = "My Trips",
                                    color = Color.White,
                                    fontSize = 24.sp
                                )
                            }
                        }
                    }
                }
            }
        }
        Column {
            Text(text = "Categories")
            Row {
                LazyRow{
                    items(3){
                        Card(
                            modifier = Modifier
                                .height(74.dp)
                                .width(109.dp)
                                .padding(end = 8.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06f0))
                        ){
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .fillMaxWidth(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Icon(
                                    imageVector = Icons.Default.LocationOn,
                                    contentDescription = "Localização",
                                    tint = Color.White
                                )
                                Text(
                                    text = "montain",
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
            }
        }
        Column {
            Text(
                text = "Past Trips"
            )
            OutlinedTextField(value = "Search your destiny", onValueChange = {})
            Column {
                LazyColumn{
                    items(cards){
                        Box{
                            Card(
                                colors = CardDefaults.cardColors(containerColor = Color.White),
                                elevation = CardDefaults.cardElevation(8.dp),
                                modifier = Modifier
                                    .height(208.dp)
                                    .width(325.dp)
                            ){
                                Image(
                                    painter = if(it.imagem == null){painterResource(id = R.drawable.noimageavailable)}else{it.imagem !!},
                                    contentDescription = " ",
                                    modifier = Modifier
                                        .height(104.dp)
                                        .width(325.dp)
                                )
                                Column {
                                    Text(
                                        text = "${it.destino} - ${it.dataChegada.year}",
                                        color = Color(0xffcf06f0)
                                    )
                                    Text(
                                        text = "${it.descricao}",
                                        color = Color(0xffa09c9c)
                                    )
                                    Text(text = encurtadorDeDatas(it.dataChegada, it.dataPartida),
                                        color = Color(0xffcf06f0)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TripsPreview(){
    Trips()
}