package com.example.pengeringtepung.response.history


import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
    @Expose
    @SerializedName("created_at")
    val createdAt: String,
    @Expose
    @SerializedName("temp")
    val temp: String,
    @Expose
    @SerializedName("hum")
    val hum: String,
    @Expose
    @SerializedName("volt")
    val volt: String,
    @Expose
    @SerializedName("beratAwal")
    val beratAwal: String,
    @Expose
    @SerializedName("beratAkhir")
    val beratAkhir: String,
    @Expose
    @SerializedName("status")
    val status: String,
    @Expose
    @SerializedName("kadarAir")
    val kadarAir: String,
) : Parcelable