package com.example.artataltspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { ArtatAltSpaceApp() }
    }
}

@Composable
fun ArtLayout() {
    var imgnum by remember { mutableIntStateOf(1) }
    val imageResource = if (imgnum == 1) R.drawable.img20200424173404 else R.drawable.img20200424173418

    Column(
        modifier = Modifier.fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(imageResource), contentDescription = "My Dog")
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("My Dog")
            Text("Greatest Dog")
        }
        Row {
            Button(
                onClick = {
                    imgnum = if (imgnum == 1) 2 else 1
                },
                modifier = Modifier.size(103.dp),
                shape = RectangleShape
            ) {
                Text("Previous", maxLines = 1)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {
                    imgnum = if (imgnum == 2) 1 else 2
                },
                modifier = Modifier.size(103.dp),
                shape = RectangleShape
            ) {
                Text("Next", maxLines = 1)
            }
        }
    }
}

@Preview
@Composable
fun ArtatAltSpaceApp() {
    ArtLayout()
}