package com.example.submissionarchitecture.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FilmEntity(
        var title: String,
        var description: String,
        var time: String,
        var imagepath: String
):Parcelable