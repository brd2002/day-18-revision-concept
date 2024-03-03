package com.example.revisionconcept.rommdb.entity

import android.provider.ContactsContract.RawContacts.Data
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Contact (
   @PrimaryKey var id : Int ?  = null,
    var profile : Int ?  = null,
    var name : String ,
    var phonenumber : String ,
    var emailid : String ? = null,
//    var data  : Data
)