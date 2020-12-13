package com.mustafahabib.archelon

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "user_database")
data class User (@PrimaryKey val id: UUID = UUID.randomUUID(),
                 @ColumnInfo var firstName: String = "",
                 @ColumnInfo var emailAd: String = "",
                 @ColumnInfo var userName: String = "",
                 @ColumnInfo var password: String = "",
                 @ColumnInfo var reEnteredPassword: String = "" )
