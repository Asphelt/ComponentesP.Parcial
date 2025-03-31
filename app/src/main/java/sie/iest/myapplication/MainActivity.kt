package sie.iest.myapplication

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.Navigation
import sie.iest.CajaDeTexto
import sie.iest.E6lazy.ViewModels.CategoriaModel
import sie.iest.E6lazy.ViewModels.ProductsModel
import sie.iest.E6lazy.nav.Navegacion
import sie.iest.datastore.NavigationManagerView
import sie.iest.lazylist.ViewModels.StudentViewModel
import sie.iest.lazylist.Views.SorteoView
import sie.iest.myapplication.ui.theme.NUVZTheme
import sie.iest.navigation.NavigationManager
import sie.iest.practica.Content
import sie.iest.preferencias.InfoView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NUVZTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   Column(modifier = Modifier.padding(innerPadding)) {
//                      val studentViewModel = StudentViewModel()
//                       SorteoView(studentViewModel)
                      //InfoView()
                       //Navegacion()
                       NavigationManagerView()
                   }
                }
            }
        }
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
    NUVZTheme {
        Greeting("Android")
    }
}