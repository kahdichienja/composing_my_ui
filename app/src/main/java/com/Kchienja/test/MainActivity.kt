package com.Kchienja.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.Kchienja.test.navigator.AppNavigator
import com.Kchienja.test.ui.theme.TestTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    DefaultPreview()
                }
            }
        }
    }
}


@ExperimentalFoundationApi
//@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestTheme {
//        HomeScreen()
        AppNavigator()
    }

}

