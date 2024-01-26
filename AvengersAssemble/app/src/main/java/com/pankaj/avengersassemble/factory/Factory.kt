package com.pankaj.avengersassemble.factory

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pankaj.avengersassemble.views.activities.home.HomeVM
import com.pankaj.avengersassemble.views.fragments.characterDetail.CharacterVM
import com.pankaj.avengersassemble.views.fragments.dashFragment.DashVM
import com.pankaj.avengersassemble.views.fragments.galleryFragment.GalleryVM
import com.pankaj.avengersassemble.views.fragments.movieDetailFragment.MovieDetailVM
import com.pankaj.avengersassemble.views.fragments.movieFragment.MovieVM
import java.lang.ref.WeakReference

class Factory(val context: WeakReference<Context>, private val childFragmentManager: FragmentManager) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(DashVM::class.java) -> {
                DashVM(this.context.get()!!) as T
            }
            modelClass.isAssignableFrom(HomeVM::class.java) -> {
                HomeVM(this.context.get()!!) as T
            }
            modelClass.isAssignableFrom(MovieVM::class.java)-> {
                MovieVM(this.context.get()!!, Bundle()) as T
            }
            modelClass.isAssignableFrom(GalleryVM::class.java)-> {
                GalleryVM(this.context.get()!!) as T
            }
            else -> throw IllegalArgumentException("Error")
        }
    }
}