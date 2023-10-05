package com.example.cartodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartodevisita.ui.theme.CartãoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaCartaoVisita()
        }
    }
}


@Preview (showSystemUi = true)
@Composable
fun TelaCartaoVisita (){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.coca),
            contentDescription = null,
            modifier = Modifier.size(150.dp)
        )
        Text(
            text = "The Coca-Cola Company",
            fontSize = 24.sp,
        )
        Text(
            text = "The Coca-Cola Company",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Dados(number = "(11) 98762-5432")
            Dados(number = "(11) 98762-5432")
            Dados(number = "(11) 98762-5432")
        }
    }
}

@Composable
fun Dados (number: String,){
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(
                top = 10.dp
        )
    ) {
        Image(
            painter = painterResource(id = R.drawable.whatsapp),
            contentDescription = null,
            modifier = Modifier
                .size(30.dp)
        )
        Text(
            text = number,
            modifier = Modifier.padding(
                start = 10.dp
            )
        )
    }

}