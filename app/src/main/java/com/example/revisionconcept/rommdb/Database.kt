package com.example.revisionconcept.rommdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.revisionconcept.rommdb.dao.ContactDao
import com.example.revisionconcept.rommdb.entity.Contact

@Database(entities = [Contact::class] , version = 1 , exportSchema = false)
abstract class Database : RoomDatabase(){
    abstract fun contactDao () :ContactDao
}