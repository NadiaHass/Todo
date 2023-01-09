package com.example.todo.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
data class Note (
    @PrimaryKey(autoGenerate = true)
    var id : Int,
    var title : String,
    var date : String,
    var priority: Priority,
    var description : String
    )