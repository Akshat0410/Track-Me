package com.androiddevs.runningappyt.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.androiddevs.runningappyt.repositories.MainDatabaseRepository


class StatisticsViewModel @ViewModelInject constructor(
    val repository: MainDatabaseRepository
): ViewModel() {
}