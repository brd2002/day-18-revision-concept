package com.example.revisionconcept.rommdb.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.revisionconcept.rommdb.entity.Contact

@Dao
interface ContactDao {

    // insert the contact
    @Insert(onConflict = OnConflictStrategy.IGNORE) // if conflict happen then it will happen
    fun createContact (contact: Contact)

    // update the contact
    @Update
    fun updataContact (contact: Contact)


    // return the contact list
    @Query("SELECT * FROM CONTACT")
    fun readContact() : List<Contact>


    // delete the contact
    @Delete
    fun deleteContact(contact: Contact)
}