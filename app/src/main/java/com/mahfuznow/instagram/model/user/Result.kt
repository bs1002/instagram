package com.mahfuznow.instagram.model.user

import android.os.Parcelable
import com.mahfuznow.instagram.model.user.*
import kotlinx.parcelize.Parcelize

@Parcelize
data class Result(
    val cell: String,
    val dob: Dob,
    val email: String,
    val gender: String,
    val id: Id,
    val location: Location,
    val login: Login,
    val name: Name,
    val nat: String,
    val phone: String,
    val picture: Picture,
    val registered: Registered
) : Parcelable