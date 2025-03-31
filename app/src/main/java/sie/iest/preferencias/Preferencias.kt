package sie.iest.preferencias

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class Preferencias(private val context: Context) {
    companion object { //para que sea singleton el acceso al archivo
        val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

        /*Llaves
        stting.txt
        edad =
        nombre =
        registrado =
        */
        val AGE = intPreferencesKey("edad")
        val NAME = stringPreferencesKey("nombre")
        val SIGN_UP = booleanPreferencesKey("registrado")
    }

    /* Equivalente al val flow
   suspend fun getAge(){
   val pref = context.datastore.data.first()
   return pref [AGE] ? :0
   }*/

    val age: Flow<Int> = context.dataStore.data.map { preferences -> // No type safety.
        preferences[AGE] ?: 0
    }
    val name: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[NAME] ?: ""
    }

    suspend fun savePersonData(personName: String, personAge: Int) {
        context.dataStore.edit { settings ->
            settings[AGE] = personAge
            settings[NAME] = personName
        }
    }

    suspend fun saveAge(personName: String, personAge: Int) {
        context.dataStore.edit { settings ->
            settings[AGE] = personAge
        }
    }

    suspend fun clearSession(){
        context.dataStore.edit { preferences ->
            preferences.remove(AGE)
            preferences.remove(NAME)
        }
    }
}


