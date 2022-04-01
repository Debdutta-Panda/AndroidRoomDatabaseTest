package com.debduttapanda.androidroomdatabasetest

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(userEntity: UserEntity)

    @Delete
    suspend fun delete(userEntity: UserEntity)

    @Query("Select * from UserEntity")
    fun getUsersList(): LiveData<List<UserEntity>>

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(userEntity: UserEntity)

}