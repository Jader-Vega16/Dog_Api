package ni.uca.dog_api.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Provides
import ni.uca.dog_api.retrofit.DogRetrofit
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

object RetrofitModule {
    @Singleton
    @Provides
    fun provideGsonBuilder(): Gson {
        return GsonBuilder()
            .excludeFieldsWithoutExposeAnnotation()
            .create()
    }

    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl("https://api.thedogapi.com/v1/images/")
            .addConverterFactory(GsonConverterFactory.create(gson))
    }

    @Singleton
    @Provides
    fun provideCatService(retrofit: Retrofit.Builder): DogRetrofit {
        return retrofit.build().create(DogRetrofit::class.java)
    }
}