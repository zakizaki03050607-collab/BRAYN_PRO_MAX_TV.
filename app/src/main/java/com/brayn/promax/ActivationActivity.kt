package com.brayn.promax

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class ActivationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var code by remember { mutableStateOf("") }
            
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("BRAYN PRO MAX TV", style = MaterialTheme.typography.headlineLarge)
                Spacer(modifier = Modifier.height(20.dp))
                TextField(
                    value = code,
                    onValueChange = { code = it },
                    label = { Text("أدخل كود التفعيل") }
                )
                Button(onClick = {
                    if (code == "0770994380") {
                        startActivity(Intent(this@ActivationActivity, MainActivity::class.java))
                        finish()
                    } else {
                        Toast.makeText(this@ActivationActivity, "الكود غير صحيح!", Toast.LENGTH_SHORT).show()
                    }
                }) {
                    Text("تفعيل")
                }
            }
        }
    }
}
