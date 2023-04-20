package com.jpakku.daggerhiltexploration.dagger

import com.jpakku.daggerhiltexploration.data.remote.MyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

/*
* InstallIn() : how long dependencies you provide in this module will live
*
* SingletonComponent = dependencies live as long as application does
* ActivityComponent = dependencies live as long as the activity the dependencies are injected into
* ViewModelComponent = dependencies live as long as the view model the dependencies is injected into
* ActivityRetainedComponent = dependencies live even when activity is recreated (screen rotation)
*/

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    // @Provides = declares that this function provides a dependency
    // if there are parameters, it will check modules to see if the dependency is provided in the module

    // @Singleton = declares that we will only have one instance throughout the lifetime of our application

    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1() = "Hello 1"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "Hello 2"
    
}