package com.example.tarea_tiempo_activa

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tarea_tiempo_activa.ui.theme.Tarea_tiempo_activaTheme

class MainActivity : ComponentActivity() {
    val TAG = "Estado"
    var startTime: Long = 0L
    var totalTimeActive: Long = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tarea_tiempo_activaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Función onStart")
        startTime = System.currentTimeMillis()


    }

    override fun onPause() {
        var endTime: Long = System.currentTimeMillis()
       totalTimeActive = startTime -endTime

        super.onPause()
        Log.d(TAG,"Función onPause, ha estado activa "+ totalTimeActive + " ms")
    }

}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tarea_tiempo_activaTheme {
        Greeting("Android")
    }
}