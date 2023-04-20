package com.jpakku.daggerhiltexploration

import androidx.lifecycle.ViewModel
import com.jpakku.daggerhiltexploration.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

// @HiltViewModel: declares that we want to inject dependencies and we want to inject into constructor
// @Inject = checks modules to see if dependencies exist

// Constructor Injection = dependency is constructed as soon as it's injected
@HiltViewModel
class MyViewModel @Inject constructor (private val myRepository: MyRepository): ViewModel()


// Lazy Injection = dependency is constructed only when it is used
// class MyViewModel @Inject constructor (private val myRepository: Lazy<MyRepository>): ViewModel() {

//        MyRepository will be constructed here
//        init {
//            myRepository.get()
//        }
// }