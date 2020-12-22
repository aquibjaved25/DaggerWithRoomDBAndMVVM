package com.roomdbself

import android.app.Application
import com.roomdbself.di.component.ApplicationComponent
import com.roomdbself.room.database.DeviceDatabase
import javax.inject.Inject

class MyApplication : Application() {

    lateinit var applicationComponent:ApplicationComponent

    override fun onCreate() {
        getDependencies()
        super.onCreate()
    }

    fun getDependencies(){
        //applicationComponent
    }
}