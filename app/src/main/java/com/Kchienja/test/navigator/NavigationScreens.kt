package com.Kchienja.test.navigator


sealed class Screen(val route: String){
    object HomeScreen : Screen("home_screen")
    object MainScreen : Screen("main_screen")
    object DetailScreen : Screen("detail_screen")

    fun withArgs(vararg args: String) : String{
        return  buildString {
            append(route)
            args.forEach {arg ->
                append("/$arg")
            }
        }
    }
}