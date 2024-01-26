package com.pankaj.avengersassemble.views.fragments.movieDetailFragment

import android.content.Context
import android.content.Intent
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class FactoryMovieDetail(val context: Context, val intent: Intent): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieDetailVM::class.java)) {
            return MovieDetailVM(context, intent) as T
        }
        throw IllegalArgumentException("")
    }
}