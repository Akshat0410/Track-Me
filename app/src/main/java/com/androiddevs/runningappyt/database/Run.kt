package com.androiddevs.runningappyt.database

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_data_table ")
data class Run(
    var img: Bitmap? =null,
    var timestam: Long= 0L,
    var avgSpeedInKmhr: Float = 0f,
    var distanceInMeters: Int = 0,
    var timeInMillis: Long= 0L,
    var caloriesBurned: Int =0
) {

    @PrimaryKey(autoGenerate = true)
    var id: Int? =null
}