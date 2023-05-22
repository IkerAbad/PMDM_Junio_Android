package es.davidcorcuera.ordinaria2023.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel(){
    private val _score = MutableLiveData<Int>(0)
    val score: LiveData<Int>
        get()=_score

    fun increasePoints(){
        _score.value = _score.value!! + 1
    }

    fun decreasePoints(){
        _score.value = _score.value!! - 1
    }

}