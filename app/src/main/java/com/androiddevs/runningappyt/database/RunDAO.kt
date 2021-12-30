package com.androiddevs.runningappyt.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run : Run)

    @Delete
    suspend fun deleteRun(run : Run)

    @Query("SELECT * FROM `RUNNING_DATA_TABLE ` ORDER BY timestam DESC")
    fun getAllRunSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM `RUNNING_DATA_TABLE ` ORDER BY timeInMillis DESC")
    fun getAllRunSortedByTime(): LiveData<List<Run>>

    @Query("SELECT * FROM `RUNNING_DATA_TABLE ` ORDER BY caloriesBurned DESC")
    fun getAllRunSortedByCaloriesBurned(): LiveData<List<Run>>

    @Query("SELECT * FROM `RUNNING_DATA_TABLE ` ORDER BY avgSpeedInKmhr DESC")
    fun getAllRunSortedBySpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM `RUNNING_DATA_TABLE ` ORDER BY distanceInMeters DESC")
    fun getAllRunSortedByDistance(): LiveData<List<Run>>

    @Query("SELECT SUM(timeInMillis) FROM `running_data_table `")
    fun getTotalTimeInMillis(): LiveData<Long>

    @Query("SELECT SUM(caloriesBurned) FROM `running_data_table `")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("SELECT SUM(distanceInMeters) FROM `running_data_table `")
    fun getTotalDistance(): LiveData<Int>

    @Query("SELECT AVG(avgSpeedInKmhr) FROM `running_data_table `")
    fun getTotalAvgSpeed(): LiveData<Float>


}