package com.example.modul2_245150201111053_farrelbrilliant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
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

                    Column(
                        modifier = Modifier.padding(innerPadding)
                    ) {

                        Text(
                            text = "Dengan Modifier",
                            modifier = Modifier
                                .padding(16.dp)
                                .size(200.dp, 60.dp)
                                .background(Color.Yellow)
                        )

                        Text(
                            text = "Tanpa Modifier"
                        )
                    }
                }
            }
        }
    }
}