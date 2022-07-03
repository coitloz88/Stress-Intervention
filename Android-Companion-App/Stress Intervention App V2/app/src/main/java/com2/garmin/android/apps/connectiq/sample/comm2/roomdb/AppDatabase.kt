package com2.garmin.android.apps.connectiq.sample.comm2.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [HRVdata::class], version = 1)
abstract class AppDatabase1 : RoomDatabase() {
    abstract fun roomDAO(): RoomDAO1
}

@Database(entities = [ESMdata::class], version = 1)
abstract class AppDatabase2 : RoomDatabase() {
    abstract fun roomDAO(): RoomDAO2
}