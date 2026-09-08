package com.example.modul2_245150201111053_farrelbrilliant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

                    ProfileScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(16.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.profil),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Text(
            text = "Nama: Andi",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Mahasiswa Teknik Informatika"
        )

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        FollowButton()
    }
}

@Composable
fun FollowButton() {

    var isFollowed by remember {
        mutableStateOf(false)
    }

    Button(
        onClick = {
            isFollowed = !isFollowed
        }
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