package sie.iest.nuvz

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
import sie.iest.E6lazy.nav.Navegacion
import sie.iest.datastore.NavigationManagerView
import sie.iest.lazylist.ViewModels.StudentViewModel
import sie.iest.lazylist.Views.ListProuctView
import sie.iest.lazylist.Views.SorteoView
import sie.iest.nuvz.ui.theme.NuvzTheme
import sie.iest.preferencias.InfoView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NuvzTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column (modifier = Modifier.padding(innerPadding)){
                        //InfoView()
                       //NavigationManagerView()
                    //Navegacion()
                        //val studentViewModel = StudentViewModel()
                        //SorteoView(studentViewModel)
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
    NuvzTheme {
        Greeting("Android")
    }
}