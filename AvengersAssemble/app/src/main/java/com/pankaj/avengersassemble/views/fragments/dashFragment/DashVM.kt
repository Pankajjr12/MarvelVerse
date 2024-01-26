package com.pankaj.avengersassemble.views.fragments.dashFragment


import android.content.Context
import android.view.View
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.pankaj.avengersassemble.HomeInterface
import com.pankaj.avengersassemble.R
import com.pankaj.avengersassemble.adapters.AdapterWeapon
import com.pankaj.avengersassemble.recyclerAdapter.DemoModel
import com.pankaj.avengersassemble.recyclerAdapter.RecyclerAdapter
import com.pankaj.avengersassemble.views.activities.home.HomeActivity


class DashVM(val context: Context):ViewModel() {

    val adapterMovie by lazy { RecyclerAdapter<DemoModel>(R.layout.adapter_movie_row) }
    val adapterWeb by lazy { RecyclerAdapter<DemoModel>(R.layout.adapter_movie_row) }
    val adapterHero1 by lazy { RecyclerAdapter<DemoModel>(R.layout.adapter_superhero) }
    val adapterHero2 by lazy { RecyclerAdapter<DemoModel>(R.layout.adapter_superhero) }


    init {
        var listHeros1= listOf(
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.spiderman, context.theme))),
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.doc, context.theme))),
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.wanda, context.theme))),
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.spiderman, context.theme))),
        )
        adapterHero2.addItems(listHeros1)
        adapterHero2.setOnItemClick(object : RecyclerAdapter.OnItemClick {
            override fun onClick(view: View, position: Int, type: String) {
                when (type) {
                    "imageClick" ->
                        view.findNavController().navigate(R.id.action_dashFragment_to_gallFragment)
                }
            }
        })
    }

    init {
        var listHeroes= listOf(
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.thorodin, context.theme))),

                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.widow, context.theme))),
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.ant, context.theme))),
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.thanos, context.theme))),
        )
        adapterHero1.addItems(listHeroes)
        adapterHero1.setOnItemClick(object : RecyclerAdapter.OnItemClick {
            override fun onClick(view: View, position: Int, type: String) {
                when (type) {
                    "imageClick" ->
                        view.findNavController().navigate(R.id.action_dashFragment_to_gallFragment)
                }
            }

        })
    }
    init {

        var listMovie= listOf(
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.avengers2, context.theme))),
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.thor4, context.theme))),
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.docotor2, context.theme))),
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.civilwar, context.theme)))
        )
        adapterMovie.addItems(listMovie)
        adapterMovie.setOnItemClick(object : RecyclerAdapter.OnItemClick {
            override fun onClick(view: View, position: Int, type: String) {
                when (type) {
                    "imageClick" ->
                        view.findNavController().navigate(R.id.action_dashFragment_to_movieFragment)

                }
            }
        }

        )}

    init {
        var listWeb= listOf(
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.msmarvelweb, context.theme))),
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.whatifweb, context.theme))),
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.falconweb, context.theme))),
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.msmarvelweb, context.theme))),
                (DemoModel(ResourcesCompat.getDrawable(context.resources, R.drawable.lokiweb, context.theme)))
        )
        adapterWeb.addItems(listWeb)
        adapterWeb.setOnItemClick(object : RecyclerAdapter.OnItemClick {
            override fun onClick(view: View, position: Int, type: String) {
                when (type) {
                    "imageClick" ->
                        view.findNavController().navigate(R.id.action_dashFragment_to_movieFragment)
                }
            }
        }

        )


    }
    companion object
    {
        var HomeInterface: HomeInterface?=null
    }
    fun more(value: String)
    {
        when(value)
        {
            "goDashToGallery" -> {
                (context as HomeActivity).navController.navigate(R.id.action_dashFragment_to_gallFragment)
            }
            "goDashToMovie" -> {
                (context as HomeActivity).navController.navigate(R.id.action_dashFragment_to_movieFragment)
            }

        }
    }


    val adapterWeapon=AdapterWeapon(context)
}
