package com.play.k2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.play.k2.ui.theme.K2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            K2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column() {
                        var text by remember {
                            mutableStateOf("")
                        }
                        val context = LocalContext.current
                        TextField(
                            value = text,
                            onValueChange = {
                                text = it
                            },
                            placeholder = {
                                Text(text = "请输入密码")
                            }
                        )
                        Button(
                            onClick = {
                                Toast.makeText(context,"你干嘛",Toast.LENGTH_SHORT).show()
                            }
                        ) {
                            Text(text = "KunVirus Premier")
                        }
                    }
                }
            }
        }
    }
}