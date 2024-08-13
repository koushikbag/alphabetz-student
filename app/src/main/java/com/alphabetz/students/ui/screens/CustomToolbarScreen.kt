package com.alphabetz.students.ui.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.alphabetz.students.ui.theme.PurpleGrey80
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomToolbarScreen(navController: NavHostController, title: String, isBack: Boolean){
    val scope = rememberCoroutineScope()
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    var isDrawerOpen = remember {
        mutableStateOf(false)
    }
    TopAppBar(
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = {
            Text(text = title,color = Color.Black,
                fontSize = 18.sp)
        },
        modifier = Modifier.background(PurpleGrey80),
        scrollBehavior = scrollBehavior
        /*navigationIcon = {
            if (isBack){
                IconButton(onClick = {navController.navigateUp()}) {
                    Icon(Icons.Filled.ArrowBack, "backIcon")
                }
            }else{
                IconButton(onClick = {
                    scope.launch {
                        drawerState.open()
                        Log.i("Drawer", "drawer Open: ")
                    }
                }) {
                    Icon(Icons.Filled.Menu, "backIcon")
                }
            }
        }*/
    )
}