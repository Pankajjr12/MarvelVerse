package com.pankaj.avengersassemble.views.fragments.galleryFragment

import android.content.Context

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment

import androidx.recyclerview.widget.GridLayoutManager

import androidx.recyclerview.widget.RecyclerView
import com.pankaj.avengersassemble.R

import com.pankaj.avengersassemble.model.GalleryModel
import com.pankaj.avengersassemble.views.activities.home.HomeActivity

import com.pankaj.avengersassemble.views.fragments.galleryFragment.adapters.AdapterGallery



class GalleryFragment : Fragment() {

    lateinit var recyclerAdapter1: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var recyclerAdapter:AdapterGallery
    var user= arrayOf("")
    var userAdapter: ArrayAdapter<String>? = null
    val galleryList = arrayListOf<GalleryModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)
       galleryImages()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerAdapter1 = view.findViewById(R.id.recyclerGallery)
        recyclerAdapter = AdapterGallery(activity as Context, galleryList)
        recyclerAdapter1.adapter = recyclerAdapter
        gridLayoutManager = GridLayoutManager(activity, 2)
        recyclerAdapter1.layoutManager = gridLayoutManager
        userAdapter = context?.let {
            ArrayAdapter(
                    it,android.R.layout.simple_list_item_1,user)
        }

    }

    override fun onResume() {
        super.onResume()
        HomeActivity.HomeInterface?.isVisible(isVisible = true)
    }
    private fun galleryImages()
    {
        galleryList.add(GalleryModel(R.drawable.wanda,"WANDA MAXIMOFF","Elizabeth Oslen"))
        galleryList.add(GalleryModel(R.drawable.widow,"BLACK WIDOW","Scarlett Johansson"))
        galleryList.add(GalleryModel(R.drawable.thorodin,"THOR ODINSON","Chris Hemisworth"))
        galleryList.add(GalleryModel(R.drawable.iron,"IRON MAN","Robert Dwayne Jr"))
        galleryList.add(GalleryModel(R.drawable.marvelc,"CAPTAIN MARVEL","Brie Larson"))
        galleryList.add(GalleryModel(R.drawable.rofgers,"CAPTAIN AMERICA","Chris Evans"))
        galleryList.add(GalleryModel(R.drawable.hukie,"HULK","Bruce Banner"))
        galleryList.add(GalleryModel(R.drawable.bpanther,"BLACK PANTHER","Chadwick Boseman"))

        galleryList.add(GalleryModel(R.drawable.hawkeye,"HAWKEYE","Jeremy Renner"))
        galleryList.add(GalleryModel(R.drawable.bucky,"WINTER SOLDIER","Sebastian Stan"))
        galleryList.add(GalleryModel(R.drawable.vision,"VISION","Paul Bettany"))
        galleryList.add(GalleryModel(R.drawable.spiderman,"SPIDERMAN","Tom Holland"))
        galleryList.add(GalleryModel(R.drawable.war,"WAR MACHINE","James Rhoades"))

        galleryList.add(GalleryModel(R.drawable.doc,"DOCTOR STRANGE","Benedict Cumberbatch "))
        galleryList.add(GalleryModel(R.drawable.loki,"LOKI","TOM HIDDLESTON"))
        galleryList.add(GalleryModel(R.drawable.thanos,"THANOS","Josh Brolin"))
        galleryList.add(GalleryModel(R.drawable.kong,"KANG THE CONQUEROR","Nathaniel Richards"))
        galleryList.add(GalleryModel(R.drawable.falcon,"Falcon","Anthony Mackie"))
        galleryList.add(GalleryModel(R.drawable.wong,"Wong","Benedict Wong"))

        galleryList.add(GalleryModel(R.drawable.star,"STAR LORD","Chris Pratt"))
        galleryList.add(GalleryModel(R.drawable.drax,"DRAX","Dave Bautista"))
        galleryList.add(GalleryModel(R.drawable.gamora,"GAMORA","Zoe Saldana"))
        galleryList.add(GalleryModel(R.drawable.mat,"MANTIS","Pom Klementieff"))
        galleryList.add(GalleryModel(R.drawable.rocket,"Rocket",""))
        galleryList.add(GalleryModel(R.drawable.grooot,"GROOT",""))
        galleryList.add(GalleryModel(R.drawable.nebula,"NEBULA","Karen Gillan"))
        galleryList.add(GalleryModel(R.drawable.shuri,"SHURI","Letitia Michelle Wright"))
        galleryList.add(GalleryModel(R.drawable.okaye,"OKOYE","Danai Gurira"))
        galleryList.add(GalleryModel(R.drawable.odin,"ODIN","Anthony Hopkins"))
        galleryList.add(GalleryModel(R.drawable.missminute,"MISS MINUTES",""))

        galleryList.add(GalleryModel(R.drawable.valkyrie,"VALKYRIE","Tessa Thompson"))
        galleryList.add(GalleryModel(R.drawable.ant,"ANTMAN","Peyton Redd"))
        galleryList.add(GalleryModel(R.drawable.hope,"WASP","Evangeline Lilly"))

        galleryList.add(GalleryModel(R.drawable.hamedell,"HEIMDALL","Idris Elba"))


        galleryList.add(GalleryModel(R.drawable.happt,"HAPPY HOGAN","Jon Favreau"))

        galleryList.add(GalleryModel(R.drawable.yel,"YELENA BELOVA","Florence Pugh"))
        galleryList.add(GalleryModel(R.drawable.fury,"NICK FURY","Nicholas Joseph"))

        galleryList.add(GalleryModel(R.drawable.ego,"EGO","Kurt Russell"))
    }

}