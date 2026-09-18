package com.example.praktikum3_state_245150201111053_farrelbrilliant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import com.example.praktikum3_state_245150201111053_farrelbrilliant.ui.theme.Praktikum3_State_245150201111053_FarrelBrilliantTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            Praktikum3_State_245150201111053_FarrelBrilliantTheme {

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    Praktikum3Screen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Praktikum3Screen(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF3F4F6))
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Praktikum 3 - State dan Rekomposisi",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF111827)
        )

        Spacer(
            modifier = Modifier.height(24.dp)
        )

        CounterSection()

        Spacer(
            modifier = Modifier.height(28.dp)
        )

        ColorToggleSection()

        Spacer(
            modifier = Modifier.height(28.dp)
        )

        ProfileSection()

        Spacer(
            modifier = Modifier.height(20.dp)
        )
    }
}

@Composable
fun CounterSection() {

    var count by remember {
        mutableStateOf(0)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .background(Color.White)
            .padding(24.dp)
    ) {

        Text(
            text = "Counter Plus-Minus",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF111827)
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        Text(
            text = "Nilai Counter: $count",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2563EB)
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Button(
                onClick = {
                    if (count > 0) {
                        count--
                    }
                }
            ) {
                Text("- Kurang")
            }

            Button(
                onClick = {
                    count++
                }
            ) {
                Text("+ Tambah")
            }
        }
    }
}

@Composable
fun ColorToggleSection() {

    var isRed by remember {
        mutableStateOf(false)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .background(Color.White)
            .padding(24.dp)
    ) {

        Text(
            text = "Toggle Warna",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF111827)
        )

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        Text(
            text = "Klik kotak untuk mengganti warna",
            fontSize = 14.sp,
            color = Color(0xFF4B5563)
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(
                    if (isRed) {
                        Color.Red
                    } else {
                        Color.Green
                    }
                )
                .clickable {
                    isRed = !isRed
                }
        )
    }
}

@Composable
fun ProfileSection() {

    var isFollowed by remember {
        mutableStateOf(false)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .background(Color.White)
            .padding(
                horizontal = 32.dp,
                vertical = 24.dp
            )
    ) {

        Text(
            text = "Profil Interaktif",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF111827)
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.profil),
            contentDescription = "Foto Profil",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(110.dp)
                .clip(CircleShape)
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        Text(
            text = "Farrel Brilliant",
            fontSize = 21.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF111827)
        )

        Spacer(
            modifier = Modifier.height(4.dp)
        )

        Text(
            text = "Mahasiswa Teknik Informatika",
            fontSize = 15.sp,
            color = Color(0xFF4B5563)
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Button(
            onClick = {
                isFollowed = !isFollowed
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isFollowed) {
                    Color(0xFF16A34A)
                } else {
                    Color(0xFF2563EB)
                },
                contentColor = Color.White
            )
        ) {

            Text(
                text = if (isFollowed) {
                    "Unfollow"
                } else {
                    "Follow"
                }
            )
        }

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Text(
            text = if (isFollowed) {
                "Anda mengikuti akun ini"
            } else {
                "Anda belum mengikuti akun ini"
            },
            fontSize = 14.sp,
            color = if (isFollowed) {
                Color(0xFF15803D)
            } else {
                Color(0xFF6B7280)
            }
        )
    }
}