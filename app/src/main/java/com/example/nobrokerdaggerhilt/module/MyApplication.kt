package com.example.nobrokerdaggerhilt.module

import android.app.Application
import com.example.nobrokerdaggerhilt.repository.NoBrokerRepository
import com.example.nobrokerdaggerhilt.room.ListDatabase
import dagger.hilt.android.HiltAndroidApp


//Application class
@HiltAndroidApp
class MyApplication : Application() {
//    val listDao by lazy {
//        val listDatabase = ListDatabase.getDatabase(this)
//        listDatabase.getListDao()
//    }
//
//    val myRepository by lazy {
//        NoBrokerRepository(listDao)
//    }
}