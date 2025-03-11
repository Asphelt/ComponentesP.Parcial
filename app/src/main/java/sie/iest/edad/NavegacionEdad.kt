package sie.iest.edad

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Preview(showBackground = true)
@Composable

fun NavegacionEdad(){
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "inicio") {
        composable(route = "inicio") {
           IngresarEdad(navController)
        }
        composable(route = "calcular") {
            CalcularEdad(navController)
        }
        composable(route = "verificar/{edad}/{nombre}/{mensaje}") { backStackEntry ->
            ValidarEdad(
                navController,
                backStackEntry.arguments?.getString("edad"),
                backStackEntry.arguments?.getString("nombre"),
                backStackEntry.arguments?.getString("mensaje")
            )
        }

    }
}