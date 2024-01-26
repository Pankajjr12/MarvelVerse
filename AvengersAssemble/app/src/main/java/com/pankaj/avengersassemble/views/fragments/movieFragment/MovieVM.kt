package com.pankaj.avengersassemble.views.fragments.movieFragment

import android.content.Context
import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.pankaj.avengersassemble.HomeInterface
import com.pankaj.avengersassemble.views.activities.home.HomeActivity

class MovieVM(val context: Context,var bundle: Bundle):ViewModel() {

    companion object
    {
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