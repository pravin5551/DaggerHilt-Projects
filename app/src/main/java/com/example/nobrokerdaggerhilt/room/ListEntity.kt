package com.example.nobrokerdaggerhilt.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//Entity which represents the database in form of table
@Entity(tableName = "list_table")
data class ListEntity(
    @ColumnInfo(name = "url") var url: String,
    @ColumnInfo(name = "title") var title: String,
    @ColumnInfo(name = "subtitle") var subtitle: String
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int? = null
}