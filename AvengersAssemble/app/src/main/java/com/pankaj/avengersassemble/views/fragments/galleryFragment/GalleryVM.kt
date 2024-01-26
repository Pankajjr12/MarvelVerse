package com.pankaj.avengersassemble.views.fragments.galleryFragment

import android.content.Context
import androidx.lifecycle.ViewModel
import com.pankaj.avengersassemble.HomeInterface
import com.pankaj.avengersassemble.views.activities.home.HomeActivity


class GalleryVM(val context: Context):ViewModel() {
    companion object{
        var HomeInterface: HomeInterface?=null
    }
    fun clicks(value:String)
    {
        when(value)
        {
            "back"->
            {
                (context as HomeActivity).navController.navigateUp()
            }
        }
    }

}