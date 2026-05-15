package com.chandana.nammahomestay

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LoginScreen()
        }
    }
}

@Composable
fun LoginScreen() {

    val context = LocalContext.current

    var phoneNumber by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Namma Homestay",
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = phoneNumber,
            onValueChange = {
                phoneNumber = it
            },
            label = {
                Text("Phone Number")
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {

                val intent = Intent(
                    context,
                    DashboardActivity::class.java
                )

                context.startActivity(intent)
            },
            modifier = Modifier.fillMaxWidth()
        ) {

            Text("Login")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "New User? Sign Up",
            modifier = Modifier.clickable {

                val intent = Intent(
                    context,
                    SignupActivity::class.java
                )

                context.startActivity(intent)
            }
        )
    }
}