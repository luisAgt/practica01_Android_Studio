package mx.ipn.alumno.lagustinf2000.android_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import mx.ipn.alumno.lagustinf2000.android_compose.ui.theme.Android_COMPOSETheme
import androidx.compose.foundation.background

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                containerColor = Color.Cyan
            ) { innerPadding ->
                studentInfoShow(
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}

@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
fun studentInfoShow(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        Text(
            text = "¡H E L L O \nW O R L D! \n From Android Compose",
            fontSize = 28.sp,
            color = Color(0xFF0D47A1)
        )
        Text(
            text = "Lastame:   Agustin",
            color = Color.Black
        )
        Text(
            text = "Surname:    Fuentes",
            color = Color.Black
        )
        Text(
            text = "name:   Luis Angel",
            color = Color.Black
        )
        Text(
            text = "Boleta:     2024630134",
            color = Color.Black
        )
        Text(
            text = "Grupo:  7CV4",
            color = Color.Black
        )
        Text(
            text = "School:     ESCOM",
            color = Color.Black
        )
        Text(
            text = "Carrer:     ISC 2020",
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Android_COMPOSETheme {
        studentInfoShow()
    }
}