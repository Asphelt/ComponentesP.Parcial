package sie.iest.compartido

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Preview(showBackground = true)
@Composable

fun NavegacionLabo(){
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "inicio") {
        composable(route = "inicio") {
            LaboInicio(navController)
        }
        composable(route = "persona") {
            PersonaView(navController)
        }
        composable(route = "verificar/{id}/{nombre}/{mensaje}") { backStackEntry ->
            VerificarView(
                navController,
                backStackEntry.arguments?.getString("id"),
                backStackEntry.arguments?.getString("nombre"),
                backStackEntry.arguments?.getString("mensaje")
            )
        }

    }
}