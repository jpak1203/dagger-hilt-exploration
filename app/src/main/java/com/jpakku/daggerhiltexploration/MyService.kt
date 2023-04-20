package com.jpakku.daggerhiltexploration

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.jpakku.daggerhiltexploration.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService: Service()  {

    // Field Injection = if you cannot do constructor injections
    @Inject
    lateinit var myRepository: MyRepository

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}