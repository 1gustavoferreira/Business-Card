package br.com.gustavoferreira.businesscard

import android.app.Application
import br.com.gustavoferreira.businesscard.data.AppDataBase
import br.com.gustavoferreira.businesscard.data.BusinessCardRepository

class App :Application() {
    val database by lazy { AppDataBase.getDatabase(this) }
    val repository by lazy{ BusinessCardRepository(database.businessDao()) }
}