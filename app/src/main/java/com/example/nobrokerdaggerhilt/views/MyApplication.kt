package com.example.nobrokerdaggerhilt.views

import android.app.Application
import com.example.nobrokerdaggerhilt.repository.NoBrokerRepository
import com.example.nobrokerdaggerhilt.room.ListDatabase


//Application class
class MyApplication : Application() {
    val listDao by lazy {
        val listDatabase = ListDatabase.getDatabase(this)
        listDatabase.getListDao()
    }

    val myRepository by lazy {
        NoBrokerRepository(listDao)
    }
}