package com.mustafahabib.archelon.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.mustafahabib.archelon.User

@Dao
interface UserDao {

    @Query("SELECT * FROM user_database")
    fun getUsers(): LiveData<List<User>>

    @Query("SELECT password FROM user_database WHERE userName = (:username) " )
    fun getUser(username: String): LiveData<User?>

    @Query("SELECT userName  FROM user_database WHERE password = (:password)")
    fun getPassword(password: String): LiveData<User?>

    @Insert
    fun insertUser(user: User)






}