package com.android.applemarket

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class MyItem(val aImg:Int, val aTitle:String,val aUserlocation : String,val aSubtitle : String, val aUserid:String, val aPrice:Int, var aChat:Int, val aHeart:Int ,var isLike : Boolean) : Parcelable
