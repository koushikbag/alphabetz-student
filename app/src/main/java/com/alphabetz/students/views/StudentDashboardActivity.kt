package com.alphabetz.students.views

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.alphabetz.students.ui.navigation.NavGraph
import com.alphabetz.students.ui.theme.AlphabetzStudentsTheme

class StudentDashboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
private fun MainScreen() {
    AlphabetzStudentsTheme {
        val navController = rememberNavController()
        NavGraph(navController)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainScreen()
}