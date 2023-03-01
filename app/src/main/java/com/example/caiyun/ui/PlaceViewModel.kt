package com.example.caiyun.ui

import android.view.animation.Transformation
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.caiyun.logic.Repository
import com.example.caiyun.logic.model.Place
import retrofit2.Response

class PlaceViewModel: ViewModel() {
    private val  searchLiveData=MediatorLiveData<String>()
    val placelist=ArrayList<Place>()
    val placeLiveData=Transformations.switchMap(searchLiveData){ query ->
        Repository.searchPlaces(query)
    }
    fun searchPlaces(query:String){
        searchLiveData.value=query
    }
}

//class PlaceViewModel : ViewModel() {
//    private val searchLiveData = MutableLiveData<String>()
//    val placeList = ArrayList<Place>()
//    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
//        Repository.searchPlaces(query)
//    }
//    fun searchPlaces(query: String) {
//        searchLiveData.value = query
//    }
//}