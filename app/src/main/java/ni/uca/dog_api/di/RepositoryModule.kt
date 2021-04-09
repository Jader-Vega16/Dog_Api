package ni.uca.dog_api.di

import dagger.Provides
import ni.uca.dog_api.repository.DogRepository
import ni.uca.dog_api.retrofit.DogRetrofit
import ni.uca.dog_api.retrofit.NetworkMapper
import ni.uca.dog_api.room.CacheMapper
import ni.uca.dog_api.room.DogDao
import javax.inject.Singleton

object RepositoryModule {
    @Singleton
    @Provides
    fun provideCatRepository(
        dogDao: DogDao,
        dogRetrofit: DogRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper
    ): DogRepository {
        return DogRepository(dogDao, dogRetrofit, cacheMapper, networkMapper)
    }
}