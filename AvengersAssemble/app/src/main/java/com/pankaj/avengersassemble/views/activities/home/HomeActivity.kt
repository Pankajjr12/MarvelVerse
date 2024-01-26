package com.pankaj.avengersassemble.views.activities.home

import android.app.AlertDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.pankaj.avengersassemble.HomeInterface
import com.pankaj.avengersassemble.R
import com.pankaj.avengersassemble.databinding.ActivityHomeBinding
import com.pankaj.avengersassemble.factory.Factory
import java.lang.ref.WeakReference

class HomeActivity : AppCompatActivity(),HomeInterface {
    private var viewModel: HomeVM? = null
    var binding: ActivityHomeBinding? = null
    lateinit var navController: NavController
    var className = "home"

    companion object {
        var HomeInterface: HomeInterface? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        val factory = Factory(WeakReference<Context>(this), supportFragmentManager)
        viewModel = ViewModelProvider(this, factory).get(HomeVM::class.java)
        binding!!.marvel = viewModel
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)
        navController = findNavController(R.id.flHome)
        HomeInterface = this
        setBottomNav()
    }

    private fun setBottomNav() {
        binding?.chipNavigation?.setItemSelected(R.id.home, true)
        binding?.chipNavigation?.setOnItemSelectedListener {
            when (it) {
                R.id.home -> {
                    className = "home"
                    navController.navigate(R.id.dashFragment)
                }
                R.id.movie -> {
                    className = "home"
                    navController.navigate(R.id.movieFragment)
                }
                R.id.gallery -> {
                    className = "home"
                    navController.navigate(R.id.gallFragment)
                }
                R.id.fav -> {
                    className = "home"
                    navController.navigate(R.id.gallFragment)
                }
            }
        }
    }
    override fun backpress() {
        if (supportFragmentManager.backStackEntryCount == 1) {
            val aD = AlertDialog.Builder(this)
            aD.setIcon(R.drawable.thortool)
            aD.setTitle(getString(R.string.app_name))
            aD.setCancelable(false)
            aD.setPositiveButton(getString(R.string.ok)) { dialogInterface, i ->
                dialogInterface.cancel()
                dialogInterface.dismiss()
                finishAffinity()
            }
            aD.setNegativeButton(getString(R.string.cancel)) { dialogInterface, i ->
                dialogInterface.cancel()
                dialogInterface.dismiss()
            }
            finishAffinity()
        }
        else
        {
            super.onBackPressed()
        }
    }

    override fun isVisible(isVisible: Boolean) {
            if (isVisible)
                binding!!.chipNavigation.visibility = View.VISIBLE
            else
                binding!!.chipNavigation.visibility = View.GONE

        }


    override fun className(string: String) {
        TODO("Not yet implemented")
    }

    override fun homeToggle() {
        TODO("Not yet implemented")
    }

    override fun Navigation(boolean: Boolean) {
        TODO("Not yet implemented")
    }

}
