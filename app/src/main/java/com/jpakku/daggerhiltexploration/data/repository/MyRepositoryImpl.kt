package com.jpakku.daggerhiltexploration.data.repository

import android.app.Application
import com.jpakku.daggerhiltexploration.R
import com.jpakku.daggerhiltexploration.data.remote.MyApi
import com.jpakku.daggerhiltexploration.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(private val myApi: MyApi,
                                           private val appContext: Application): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("The app name is $appName")
    }

    override suspend fun doNetworkCall() {

    }


}