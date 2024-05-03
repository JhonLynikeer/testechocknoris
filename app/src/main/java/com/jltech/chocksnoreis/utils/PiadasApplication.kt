package com.jltech.chocksnoreis.utils

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PiadasApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        instance = applicationContext
        startKoin{
            androidContext(this@PiadasApplication)
        }
    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        var instance: Context? = null
            private set
    }
}