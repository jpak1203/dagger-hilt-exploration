package com.jpakku.daggerhiltexploration.domain.repository

interface MyRepository {

    suspend fun doNetworkCall()

}