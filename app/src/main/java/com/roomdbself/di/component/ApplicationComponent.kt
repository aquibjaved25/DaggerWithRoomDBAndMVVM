package com.roomdbself.di.component

import android.content.Context
import com.daggersample.di.qualifier.ApplicationContext
import com.roomdbself.MyApplication
import com.roomdbself.di.module.ApplicationModule
import com.roomdbself.room.database.DeviceDatabase
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(myApplication: MyApplication)


    fun getContext(): Context

    //fun getDatabaseService(): DeviceDatabase
}