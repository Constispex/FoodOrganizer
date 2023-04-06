package com.example.foodprodukt

import android.graphics.Paint.Style
import android.os.Bundle
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em

class UIBase {

    companion object {
        @Composable
        fun getHeader (page: Int) {
            Column {
                Row {
                    IconButton(onClick = { /*TODO*/ }) {

                    }
                    Text(text = if(page == 0) "Home" else "", style = TextStyle(fontSize = 15.em))
                }
            }
        }
    }


}