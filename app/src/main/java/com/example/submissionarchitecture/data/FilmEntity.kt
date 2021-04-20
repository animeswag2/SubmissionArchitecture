package com.example.submissionarchitecture.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FilmEntity(
        var id: String,
        var title: String,
        var description: String,
        var deadline: String,
        var image: Int
):Parcelable