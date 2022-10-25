package com.myrawinter.eastereggs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class TestingCompose {


    @Composable
    fun MyView(onViewButtonClick: () -> Unit = {}) {
        Button(colors = ButtonDefaults.buttonColors( ),
            onClick = (onViewButtonClick),
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp, 40.dp, 15.dp, 15.dp)
        ) {
            Text(
                text = "This string",
                color = Color.White,
                fontSize = 20.sp
            )
        }
    }

    @Preview
    @Composable
    fun MyViewPreview() {
        MyView()
    }

  //  @Preview
    @Composable
    fun MessageCard(msg: String) {
        Column {
            Text(text = "First Text")
            Text(text = msg)
        }
    }
}