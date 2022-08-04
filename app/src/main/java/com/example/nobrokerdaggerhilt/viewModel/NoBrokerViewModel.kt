package com.example.nobrokerdaggerhilt.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.nobrokerdaggerhilt.repository.NoBrokerRepository
import com.example.nobrokerdaggerhilt.room.ListEntity

class NoBrokerViewModel(private val repository: NoBrokerRepository):ViewModel() {
    //hit the api using kotlin coroutine
    suspend fun getApi(){
        repository.getList()
    }

    //fetch all the data from database using livedata
    fun displayList():LiveData<List<ListEntity>>{
        return repository.displayList()
    }

    //deletes all the record from database
    fun deleteList() {
        repository.deletePreviousList()
    }

}
