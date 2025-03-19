package sie.iest.lazylist.ViewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import sie.iest.lazylist.models.WinnerModel

class StudentViewModel:ViewModel() {

    var selectedStudent by mutableStateOf("")
        private set

    var isloading by mutableStateOf(false)
        private set

    var contador by mutableIntStateOf(0)
        private set

    var winner by mutableStateOf(WinnerModel(name = "", number = 0))
        private set
    init {
        //viewModelScope.launch {
         //   selectedStudent = getStudentAsync()
        //}
        }
    fun onClickLuckyButton(){
        viewModelScope.launch {
            selectedStudent = getStudentAsync()
            //winner.name = selectedStudent
            winner = winner.copy(name = selectedStudent)
        }
    }

    suspend fun getStudentAsync(): String{
        //IO datos, imagenes y navegacion-> main
        return withContext(Dispatchers.IO){
            isloading = true
            selectedStudent = ""
            contador ++
            //winner.number = contador
            winner = winner.copy(number = contador)
            delay(5000)
            val students = listOf<String>(
                "Beto","Jp","Memo","Edna",
                "David","Valeria","Julia","Max",
                "Luis","Anuel","Yahir","Fabi","Karla",
                "Ester","Gerry","Marchelo","Retta"
            )
            delay(3000)
            isloading = false
             students.random()
        }
    }
}