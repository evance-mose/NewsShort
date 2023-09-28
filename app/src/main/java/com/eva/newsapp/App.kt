package com.eva.newsapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber


@HiltAndroidApp
class App : Application(){

    override fun onCreate() {
        super.onCreate()
        Timber.d(TAG, "onCreate: ")
    }

    companion object {
        private const val TAG = "App"
    }
}