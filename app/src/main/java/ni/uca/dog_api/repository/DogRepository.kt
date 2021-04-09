package ni.uca.dog_api.repository

import ni.uca.dog_api.retrofit.DogRetrofit
import ni.uca.dog_api.retrofit.NetworkMapper
import ni.uca.dog_api.room.CacheMapper
import ni.uca.dog_api.room.DogDao

class DogRepository (
    private val dogDao:DogDao,
    private val dogRetrofit:DogRetrofit,
    private val cacheMapper:CacheMapper,
    private val networkMapper:NetworkMapper
)