package com.example.nobrokerdaggerhilt.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

//Data Access Object
@Dao
interface ListDao {

    //adds the list into database
    @Insert
    fun addList(listEntity: ListEntity)

    /*
   This will return a LiveData<List<ListEntity>> , so whenever the database is changed the observer
   is notified
    */
    @Query("select * from list_table")
    fun getList(): LiveData<List<ListEntity>>


    //delete previous data present in database
    @Query("DELETE FROM list_table")
    fun deleteAll()
}