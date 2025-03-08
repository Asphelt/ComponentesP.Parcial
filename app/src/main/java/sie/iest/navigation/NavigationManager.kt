package sie.iest.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import sie.iest.HomeView
import sie.iest.ListadoView

@Preview (showBackground = true)
@Composable

fun NavigationManager(){
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "inicio"){
        /////Aqui se alojan los nombres de las rutas y componentes
        composable(route = "inicio"){
            //UI
            HomeView(navController)
        }
        composable(route = "Lista"){
            ListadoView(navController)
        }
//        composable(route="estudiante/{nombre}/{id}",
//            arguments= listOf(
//                navArgument("nombre"){
//                    type = NavType.StringType //Primer parametro
//                }, navArgument("id"){
//                    type=NavType.IntType //termina parametro 2
//                }
//            )){ parametros->
//                val  studentName = parametros.arguments?.getString("nombre" )?:""
//                val  studentId = parametros.arguments?.getInt("id")?:0
//                studentView(studentId,studentName)
//        }
        composable(route="estudiante?id={id}&nombre={nombre}",
            arguments= listOf(
                navArgument("id") {
                    type = NavType.IntType //termina parametro 2
                    defaultValue = 0
                },navArgument("nombre"){
                    type = NavType.StringType //Primer parametro
                    nullable = true
                    defaultValue = "-"
                }
            )){ parametros->
            val  studentId = parametros.arguments?.getInt("id")?:0
            val  studentName = parametros.arguments?.getString("nombre" )?:"*"
            studentView(studentId,studentName)
        }
    }
}