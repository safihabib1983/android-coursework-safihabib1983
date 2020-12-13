package com.mustafahabib.archelon.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.mustafahabib.archelon.User
//code based on working on further developer.android.com modules
@Database(entities = [User::class], version = 1)
@TypeConverters(UserTypeConverter::class)
abstract class UserDatabase: RoomDatabase(){

    abstract fun UserDao(): UserDao



}