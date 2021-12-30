package com.androiddevs.runningappyt.repositories

import com.androiddevs.runningappyt.database.Run
import com.androiddevs.runningappyt.database.RunDAO
import javax.inject.Inject

class MainDatabaseRepository @Inject constructor(
    val runDAO: RunDAO
) {

    //Insert and Delete synchronous tasks so they are put under suspend functions
    suspend fun insert(run : Run)=runDAO.insertRun(run)

    suspend fun delete(run : Run)=runDAO.deleteRun(run)


    //Getting data by applying filters.They are not suspended functions because they return live data which are observed and they are asynchronous.

    fun getAllRunSortedByDate() = runDAO.getAllRunSortedByDate()

    fun getAllRunSortedByTime() = runDAO.getAllRunSortedByTime()

    fun getAllRunSortedByCaloriesBurned() = runDAO.getAllRunSortedByCaloriesBurned()

    fun getAllRunSortedByDistance() = runDAO.getAllRunSortedByDistance()

    fun getAllRunSortedBySpeed() = runDAO.getAllRunSortedBySpeed()


    //Getting total data.They are not suspended functions because they return live data which are observed and they are asynchronous.

    fun getTotalAverageSpeed() = runDAO.getTotalAvgSpeed()

    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()

    fun getTotalDistance() =runDAO.getTotalDistance()

    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMillis()


}