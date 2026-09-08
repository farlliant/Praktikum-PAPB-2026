package com.example.profilapp_245150201111053_farrelbrilliant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilapp_245150201111053_farrelbrilliant.ui.theme.ProfilApp_245150201111053_FarrelBrilliantTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            ProfilApp_245150201111053_FarrelBrilliantTheme {

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

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF3F4F6)),
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(20.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(Color.White)
                .padding(
                    horizontal = 32.dp,
                    vertical = 28.dp
                )
        ) {

            Image(
                painter = painterResource(id = R.drawable.profil),
                contentDescription = "Foto Profil",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            Text(
                text = "Farrel Brilliant",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF111827)
            )

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            Text(
                text = "NIM: 245150201111053",
                fontSize = 15.sp,
                color = Color(0xFF4B5563)
            )

            Spacer(
                modifier = Modifier.height(6.dp)
            )

            Text(
                text = "Mahasiswa Teknik Informatika",
                fontSize = 16.sp,
                color = Color(0xFF374151)
            )

            Spacer(
                modifier = Modifier.height(22.dp)
            )

            FollowButton()
        }
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
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF2563EB),
            contentColor = Color.White
        )
    ) {

        Text(
            text = if (isFollowed) {
                "Unfollow"
            } else {
                "Follow"
            },
            fontSize = 15.sp,
            fontWeight = FontWeight.Medium
        )
    }
}