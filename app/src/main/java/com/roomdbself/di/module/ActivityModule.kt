package com.roomdbself.di.module

import android.app.Activity
import android.content.Context
import com.daggersample.di.qualifier.ActivityContext
import com.daggersample.di.qualifier.ApplicationContext
import com.daggersample.di.qualifier.DatabaseInfo
import com.roomdbself.room.database.DeviceDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ActivityModule constructor(var activity: Activity) {



    @Provides
    fun provideContext(): Context {
        return activity
    }

}