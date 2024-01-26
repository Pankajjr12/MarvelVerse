package com.pankaj.avengersassemble.views.fragments.movieFragment


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pankaj.avengersassemble.R
import com.pankaj.avengersassemble.databinding.FragmentMovieViewBinding
import com.pankaj.avengersassemble.model.MovieModel
import com.pankaj.avengersassemble.views.activities.home.HomeActivity

import com.pankaj.avengersassemble.views.fragments.movieFragment.adapter.AdapterMovieList


class MovieListFragment : Fragment() {
    var bundle=Bundle()
    lateinit var vm: MovieVM
    lateinit var binding: FragmentMovieViewBinding
    lateinit var recyclerAdapter2: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var recyclerAdapter: AdapterMovieList
    val galleryList = arrayListOf<MovieModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie_list, container, false)
        galleryImages()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerAdapter2 = view.findViewById(R.id.recMovie)
        recyclerAdapter = AdapterMovieList(activity as Context, galleryList)
        recyclerAdapter2.adapter = recyclerAdapter
        gridLayoutManager = GridLayoutManager(activity, 2)
        recyclerAdapter2.layoutManager = gridLayoutManager
    }

    override fun onResume() {
        super.onResume()
        HomeActivity.HomeInterface?.isVisible(isVisible = true)
    }

    private fun galleryImages() {
        galleryList.add(MovieModel(R.drawable.iron,"IRON MAN","2008",1))
        galleryList.add(MovieModel(R.drawable.ihulk,"THE INCREDIBLE HULK","2008",2))
        galleryList.add(MovieModel(R.drawable.iron2,"IRON MAN 2","2008",3))
        galleryList.add(MovieModel(R.drawable.thor1,"THOR","2011",27))
        galleryList.add(MovieModel(R.drawable.captain1,"CAPTAIN AMERICA FIRST AVENGERS","2011",4))
        galleryList.add(MovieModel(R.drawable.avgone,"AVENGERS","2012",5))
        galleryList.add(MovieModel(R.drawable.ironthree,"IRON MAN 3","2013",6))
        galleryList.add(MovieModel(R.drawable.thor2,"THOR THE DARK WORLD","2013",7))
        galleryList.add(MovieModel(R.drawable.cap2,"CAPTAIN AMERICA WINTER SOLDIER","2014",8))
        galleryList.add(MovieModel(R.drawable.galxy1,"GUARDIANS OF THE GALAXY VOL 1","2014",9))
        galleryList.add(MovieModel(R.drawable.avengers2,"AVENGERS AGE OF ULTRON","2015",10))
        galleryList.add(MovieModel(R.drawable.antman1,"ANT MAN","2015",11))
        galleryList.add(MovieModel(R.drawable.civilwar,"CAPTAIN AMERICA CIVIL WAR","2016",12))
        galleryList.add(MovieModel(R.drawable.doctor_strange,"DOCTOR STRANGE","2016",13))
        galleryList.add(MovieModel(R.drawable.galaxy2,"GUARDIAN OF THE GALAXY VOL 2","2017",14))
        galleryList.add(MovieModel(R.drawable.spiderhome,"SPIDERMAN HOMECOMING","2017",15))
        galleryList.add(MovieModel(R.drawable.thor3,"THOR RAGNAROK","2017",16))
        galleryList.add(MovieModel(R.drawable.panther,"BLACK PANTHER","2018",17))
        galleryList.add(MovieModel(R.drawable.avengers3,"AVENGERS INFINITY WAR","2018",18))
        galleryList.add(MovieModel(R.drawable.ant2,"ANT MAN & WASP","2018",19))
        galleryList.add(MovieModel(R.drawable.capmarvel,"CAPTAIN MARVEL","2019",20))
        galleryList.add(MovieModel(R.drawable.avengers4,"AVENGERS ENDGAME","2019",21))
        galleryList.add(MovieModel(R.drawable.spidermanfar,"SPIDERMAN FAR FROM HOME","2019",22))
        galleryList.add(MovieModel(R.drawable.blackwidow,"BLACK WIDOW","2021",23))
        galleryList.add(MovieModel(R.drawable.eternalsmovie,"ETERNALS","2021",24))
        galleryList.add(MovieModel(R.drawable.docotor2,"DOCTOR STRANGE MADNESS RETURNS","2021",25))
        galleryList.add(MovieModel(R.drawable.thor4,"THOR LOVE AND THUNDER","2021",26))
    }
}