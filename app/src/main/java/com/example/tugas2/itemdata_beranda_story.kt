package com.example.tugas2

import android.os.Parcel
import android.os.Parcelable

class itemdata_beranda_story (val gambar : Int,val nama:String, val waktu: String, val video: Int) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(gambar)
        parcel.writeString(nama)
        parcel.writeString(waktu)
        parcel.writeInt(video)
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<itemdata_beranda_story> {
        override fun createFromParcel(parcel: Parcel): itemdata_beranda_story {
            return itemdata_beranda_story(parcel)
        }

        override fun newArray(size: Int): Array<itemdata_beranda_story?> {
            return arrayOfNulls(size)
        }
    }
}
