package com.example.revisionconcept.rommdb.entity

import android.provider.ContactsContract.RawContacts.Data
import androidx.room.Entity

@Entity
class Contact (
    var id : Int ? ,
    var profile : Int ? ,
    var name : String ,
    var phonenumber : String ,
    var emailid : String ? ,
//    var data  : Data
)