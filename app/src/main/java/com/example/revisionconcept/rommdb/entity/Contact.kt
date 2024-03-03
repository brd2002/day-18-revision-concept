package com.example.revisionconcept.rommdb.entity

import androidx.room.Entity

@Entity
class Contact (
    var id : Int ,
    var profile : Int ,
    var name : String ,
    var phonenumber : String ,
    var emailid : String
)