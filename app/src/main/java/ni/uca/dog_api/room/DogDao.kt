package ni.uca.dog_api.room

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface DogDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(catEntity: DogCacheEntity): Long
    @Query("select * from perrito")
    suspend fun get(): List<DogCacheEntity>
}