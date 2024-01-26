package com.pankaj.avengersassemble.views.fragments.dashFragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.pankaj.avengersassemble.R
import com.pankaj.avengersassemble.databinding.FragmentDashBinding
import com.pankaj.avengersassemble.factory.Factory

import com.pankaj.avengersassemble.views.activities.home.HomeActivity


import kotlinx.android.synthetic.main.fragment_dash.*
import java.lang.ref.WeakReference



class DashFragment : Fragment() {

    var vm: DashVM? = null
    var binding: FragmentDashBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?

    {
        binding = FragmentDashBinding.inflate(inflater)
        val factory = Factory(WeakReference<Context>(requireContext()), childFragmentManager)
        vm = ViewModelProvider(this, factory).get(DashVM::class.java)
        binding!!.marvel = vm
        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val imageL = ArrayList<SlideModel>()
        imageL.add(SlideModel(R.drawable.thor4,"THOR 4"))
        imageL.add(SlideModel(R.drawable.spiderhome,"SPIDERMAN HOMECOMING"))
        imageL.add(SlideModel(R.drawable.capmarvel,"CAPTAIN MARVEL"))
        imageL.add(SlideModel(R.drawable.docotor2,"DOCTOR STRANGE 2"))

        imageSlider.setImageList(imageL,ScaleTypes.FIT)

//        adapter= SliderAdapter()
//        adapter.setContent(imageList)
//
//        imageSlider.adapter=adapter
    }

    override fun onResume() {
        super.onResume()
        HomeActivity.HomeInterface?.isVisible(isVisible = true)
    }

}




