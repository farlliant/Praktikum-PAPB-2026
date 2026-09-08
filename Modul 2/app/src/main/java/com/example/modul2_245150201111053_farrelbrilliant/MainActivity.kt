package com.example.modul2_245150201111053_farrelbrilliant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.modul2_245150201111053_farrelbrilliant.ui.theme.Modul2_245150201111053_FarrelBrilliantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            Modul2_245150201111053_FarrelBrilliantTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    FollowButton(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun FollowButton(modifier: Modifier = Modifier) {

    var isFollowed by remember {
        mutableStateOf(false)
    }

    Button(
        onClick = {
            isFollowed = !isFollowed
        },
        modifier = modifier
    ) {
        Text(
            text = if (isFollowed) {
                "Unfollow"
            } else {
                "Follow"
            }
        )
    }
}