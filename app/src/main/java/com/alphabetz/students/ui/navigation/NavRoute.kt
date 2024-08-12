package com.alphabetz.students.ui.navigation

sealed class NavRoute(val path: String) {
    object ClassList : NavRoute("classList")

    object StudentList : NavRoute("studentList") {
        val className = "className"
    }

    object studentDetail : NavRoute("studentDetail") {
        const val routeWithArgument: String = "studentDetail/{studentId}"
        const val argument0: String = "studentId"
    }

    object addStudent : NavRoute("addStudent")

    // build navigation path (for screen navigation)
    fun withArgs(vararg args: String): String {
        return buildString {
            append(path)
            args.forEach{ arg ->
                append("/$arg")
            }
        }
    }

    // build and setup route format (in navigation graph)
    fun withArgsFormat(vararg args: String) : String {
        return buildString {
            append(path)
            args.forEach{ arg ->
                append("/{$arg}")
            }
        }
    }
}