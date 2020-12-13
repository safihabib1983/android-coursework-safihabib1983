package com.mustafahabib.archelon

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.mustafahabib.archelon.database.UserDatabase
import java.util.concurrent.Executors

//worked through the o'reilly learning.oreilly.com chapters that teaches this method
private const val DATABASE_NAME = "user_database"

class UserRepository private constructor(context: Context){

    private val database: UserDatabase =  Room.databaseBuilder(
        context.applicationContext,
        UserDatabase::class.java,
        DATABASE_NAME
    ).build()

    private val userDao = database.UserDao()
    private val executor = Executors.newSingleThreadExecutor()

    fun getUsers(): LiveData<List<User>> = userDao.getUsers()
    fun getUser(username: String): LiveData<User?> = userDao.getUser(username)

    fun insertUser(user: User){
        executor.execute{
            userDao.insertUser(user)
        }
    }

    companion object {
        private var INSTANCE: UserRepository? = null

        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = UserRepository(context)
            }
        }

        fun get(): UserRepository {
            return INSTANCE ?:
            throw IllegalStateException("CrimeRepository must be initialized")
        }
    }
}