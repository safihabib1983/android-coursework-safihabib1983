package com.mustafahabib.archelon.database

import androidx.room.TypeConverter
import java.util.*

class UserTypeConverter {

    @TypeConverter
    fun toUUID(uuid: String?): UUID{
        return UUID.fromString(uuid)
    }

    @TypeConverter
    fun fromUUID(uuid: UUID?): String?{
        return uuid?.toString()
    }
}