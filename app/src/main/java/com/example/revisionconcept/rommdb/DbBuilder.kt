package com.example.revisionconcept.rommdb

import android.content.Context
import androidx.room.Room
import com.example.revisionconcept.dbName

object DbBuilder {
    private var database : Database ? =null
    fun getDb(context : Context) : Database?{
        if (database == null){
            database = Room.databaseBuilder(context
                , Database::class.java,
                dbName)
                .allowMainThreadQueries()
                .build()

        }
        return database
    }
}