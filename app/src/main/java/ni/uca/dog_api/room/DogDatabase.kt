package ni.uca.dog_api.room

import androidx.room.Database

@Database(entities = [DogCacheEntity::class], version = 1)

abstract class DogDatabase {
    companion object{
        val DATABASE_NAME = "DogDB"
    }
    abstract fun catDao(): DogDao
}