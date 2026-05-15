package com.chandana.nammahomestay

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class DashboardActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DashboardScreen(this)
        }
    }
}

@Composable
fun DashboardScreen(activity: DashboardActivity) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Dashboard",
            fontSize = 32.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {
                activity.startActivity(
                    Intent(activity, CreateProfileActivity::class.java)
                )
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Create Profile")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                activity.startActivity(
                    Intent(activity, MenuActivity::class.java)
                )
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Daily Menu")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                activity.startActivity(
                    Intent(activity, GuideActivity::class.java)
                )
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Local Guide")
        }
    }
}