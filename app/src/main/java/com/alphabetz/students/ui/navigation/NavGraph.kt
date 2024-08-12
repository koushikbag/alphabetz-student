package com.alphabetz.students.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.alphabetz.students.ui.screens.ClassListScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.ClassList.path
    ) {
        addClassList(navController, this)
    }
}

fun addClassList(navController: NavController, navGraphBuilder: NavGraphBuilder) {
    navGraphBuilder.composable(route = NavRoute.ClassList.path) {
        ClassListScreen(
            navigateToHome = {
                navController.navigate(NavRoute.ClassList.path)
            }
        )
    }
}
