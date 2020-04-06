package com.example.rv

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class dataitem(
    val name:String,
    val imgurl:Int,
    val price:String,
    val desc:String
) : Parcelable