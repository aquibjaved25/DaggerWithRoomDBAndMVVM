package com.roomdbself.di.module


import android.content.Context
import com.daggersample.di.qualifier.ActivityContext
import com.daggersample.di.qualifier.ApplicationContext
import com.daggersample.di.qualifier.DatabaseInfo
import com.daggersample.di.qualifier.NetworkInfo
import com.roomdbself.MyApplication
import com.roomdbself.room.dao.DeviceDao
import com.roomdbself.room.database.DeviceDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule constructor(var application: MyApplication) {


    @Provides
    fun provideContext(): Context {
        return application
    }

    @Provides
    @Singleton
    fun provideDatabase() :DeviceDao{return DeviceDatabase.getDeviceDatabase(application).DeviceDao()}

}