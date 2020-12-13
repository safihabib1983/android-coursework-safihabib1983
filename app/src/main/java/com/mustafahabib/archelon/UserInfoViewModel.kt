package com.mustafahabib.archelon

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class UserInfoViewModel(): ViewModel() {
    private val userRepository = UserRepository.get()
    private val usernameLiveData = MutableLiveData<String>()

    var userLiveData: LiveData<User?> = Transformations.switchMap(usernameLiveData){
        username -> userRepository.getUser(username)
    }

    fun saveUser(user:User){
        userRepository.insertUser(user)
    }


}