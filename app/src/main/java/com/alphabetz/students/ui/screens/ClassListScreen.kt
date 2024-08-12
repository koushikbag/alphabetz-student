package com.alphabetz.students.ui.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun ClassListScreen(
    navigateToHome: () -> Unit
) {
    val classesList = ArrayList<String>()
    classesList.add("Class 1")
    classesList.add("Class 2")
    classesList.add("Class 3")
    classesList.add("Class 4")
    classesList.add("Class 5")
    classesList.add("Class 6")
    classesList.add("Class 7")
    classesList.add("Class 8")
    classesList.add("Class 9")
    classesList.add("Class 10")
    classesList.add("Class 11")
    classesList.add("Class 12")
    val context = LocalContext.current
    ItemGrid(classesList) { item ->
        // Handle item click here, e.g., navigate to another screen
        Toast.makeText(context, "Item $item clicked", Toast.LENGTH_SHORT).show()
    }
}


@Composable
fun ItemGrid(items: List<Any>, onItemClick: ((Any) -> Unit)?) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3)
    ) {
        items(items.size) { index ->
            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .clickable { onItemClick?.invoke(items[index]) },
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                shape = RoundedCornerShape(8.dp), // Add rounded corners
                colors = CardDefaults.cardColors(containerColor = Color.LightGray) // Custom background color
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Item ${items[index]}")
                }
            }
        }
    }
}