package com.example.praktikum3_245150201111053_farrelbrilliant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.praktikum3_245150201111053_farrelbrilliant.ui.theme.Praktikum3_245150201111053_FarrelBrilliantTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            Praktikum3_245150201111053_FarrelBrilliantTheme {

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    FollowApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun FollowApp(modifier: Modifier = Modifier) {

    var isFollowed by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        FollowButton(
            isFollowed = isFollowed,
            onClick = {
                isFollowed = !isFollowed
            }
        )
    }
}

@Composable
fun FollowButton(
    isFollowed: Boolean,
    onClick: () -> Unit
) {

    Button(
        onClick = onClick
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