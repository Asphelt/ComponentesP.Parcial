package sie.iest.datastore

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Preview(showBackground = true)
@Composable
fun NavigationManagerView() {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            DataStoreView(navController)
        }

        composable(
            route = "products/{name}/{age}/{height}/{cash}",
            arguments = listOf(
                navArgument("name") { type = NavType.StringType },
                navArgument("age") { type = NavType.IntType },
                navArgument("height") { type = NavType.FloatType },
                navArgument("cash") { type = NavType.FloatType }
            )
        ) { parametros ->
            val Name = parametros.arguments?.getString("name") ?: ""
            val Age = parametros.arguments?.getInt("age") ?: 0
            val Height = parametros.arguments?.getFloat("height") ?: 0f
            val Cash = parametros.arguments?.getFloat("cash") ?: 0f
            ListProductsView(Name, Age, Height, Cash)
        }
    }
}
