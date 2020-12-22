package com.roomdbself.di.component

import com.roomdbself.activity.AddDeviceActivity
import com.roomdbself.di.module.ActivityModule
import com.roomdbself.di.scope.ActivityScope
import dagger.Component

@ActivityScope
@Component(
    dependencies = arrayOf(ApplicationComponent::class),
    modules = arrayOf(ActivityModule::class)
)
interface ActivityComponent {
    fun inject(activity: AddDeviceActivity)
}
