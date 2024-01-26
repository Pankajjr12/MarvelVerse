package com.pankaj.avengersassemble.views.fragments.movieDetailFragment

import android.content.Context
import android.content.Intent
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel
import com.pankaj.avengersassemble.R
import com.pankaj.avengersassemble.views.activities.home.HomeActivity

class MovieDetailVM(val context: Context, val intent: Intent):ViewModel() {
    var movieName=ObservableField("")
    var dirName=ObservableInt()
    var movStory= ObservableInt()
    var budPrice=ObservableField("")
    init {
        when {
            intent.hasExtra("avengers") -> {

                if (intent.getStringExtra("avengers") == "ironOne") {
                    movieName.set("Iron Man")
                    dirName.set(R.string.dir_ironOne)
                    budPrice.set("14 crores USD")
                    movStory.set(R.string.story_ironOne)

                }
                else if (intent.getStringExtra("avengers") == "incHulk") {
                    movieName.set("Incredible Hulk")
                    dirName.set(R.string.dir_incHulk)
                    budPrice.set("15 crores USD")
                    movStory.set(R.string.story_incHulk)

                }
                else if (intent.getStringExtra("avengers") == "ironTwo") {
                    movieName.set("Iron Man 2")
                    dirName.set(R.string.dir_ironTwo)
                    budPrice.set("20 crores USD")
                    movStory.set(R.string.story_ironTwo)

                }
                else if (intent.getStringExtra("avengers") == "thorOne") {
                    movieName.set("Thor")
                    dirName.set(R.string.dir_thorOne)
                    budPrice.set("15 crores USD")
                    movStory.set(R.string.story_thorFour)

                }
                else if (intent.getStringExtra("avengers") == "captionOne") {
                    movieName.set("Captain America First Avenger")
                    dirName.set(R.string.dir_captainOne)
                    budPrice.set("14 crores USD")
                    movStory.set(R.string.story_captainOne)

                }
                else if (intent.getStringExtra("avengers") == "avgOne") {
                    movieName.set("Avengers 2012")
                    dirName.set(R.string.dir_avgOne)
                    budPrice.set("22 crores USD")
                    movStory.set(R.string.story_avgOne)

                }
                else if (intent.getStringExtra("avengers") == "ironThree") {
                    movieName.set("Iron Man 3")
                    dirName.set(R.string.dir_ironThree)
                    budPrice.set("20 crores USD")
                    movStory.set(R.string.story_ironThree)

                }
                else if (intent.getStringExtra("avengers") == "thorTwo") {
                    movieName.set("Thor The Dark World")
                    dirName.set(R.string.dir_thorTwo)
                    budPrice.set("15 crores USD")
                    movStory.set(R.string.story_thorTwo)

                }
                else if (intent.getStringExtra("avengers") == "captainTwo") {
                    movieName.set("Captain America Winter Soldier")
                    dirName.set(R.string.dir_captainTwo)
                    budPrice.set("17 crores USD")
                    movStory.set(R.string.story_captainTwo)

                }
                else if (intent.getStringExtra("avengers") == "galaxyOne") {
                    movieName.set("Guardian of Galaxy Vol 1")
                    dirName.set(R.string.dir_galaxyOne)
                    budPrice.set("18 crores USD")
                    movStory.set(R.string.story_galaxyOne)

                }
                else if (intent.getStringExtra("avengers") == "avgTwo") {
                    movieName.set("Captain America First Avenger")
                    dirName.set(R.string.dir_avgTwo)
                    budPrice.set("36.5 crores USD")
                    movStory.set(R.string.story_avgTwo)

                }
                else if (intent.getStringExtra("avengers") == "antOne") {
                    movieName.set("Ant-Man")
                    dirName.set(R.string.dir_antOne)
                    budPrice.set("13 crores USD")
                    movStory.set(R.string.story_antOne)

                }
                else if (intent.getStringExtra("avengers") == "captainThree") {
                    movieName.set("Captain America Civil War")
                    dirName.set(R.string.dir_captainThree)
                    budPrice.set("27 crores USD")
                    movStory.set(R.string.story_captainThree)

                }
                else if (intent.getStringExtra("avengers") == "docOne") {
                    movieName.set("Doctor Strange")
                    dirName.set(R.string.dir_docOne)
                    budPrice.set("19 crores USD")
                    movStory.set(R.string.story_docOne)

                }
                else if (intent.getStringExtra("avengers") == "galaxyTwo") {
                    movieName.set("Guardian of Galaxy Vol 2")
                    dirName.set(R.string.dir_galaxyTwo)
                    budPrice.set("21 crores USD")
                    movStory.set(R.string.story_galaxyTwo)

                }
                else if (intent.getStringExtra("avengers") == "spiderOne") {
                    movieName.set("Spiderman Homecoming")
                    dirName.set(R.string.dir_spiderOne)
                    budPrice.set("17.5 crores USD")
                    movStory.set(R.string.story_spiderOne)

                }
                else if (intent.getStringExtra("avengers") == "thorThree") {
                    movieName.set("Thor Ragnarok")
                    dirName.set(R.string.dir_thorThree)
                    budPrice.set("18 crores USD")
                    movStory.set(R.string.story_thorThree)

                }
                else if (intent.getStringExtra("avengers") == "panther") {
                    movieName.set("Black Panther")
                    dirName.set(R.string.dir_pantherOne)
                    budPrice.set("20 crores USD")
                    movStory.set(R.string.story_panther)

                }
                else if (intent.getStringExtra("avengers") == "avgThree") {
                    movieName.set("Avengers Infinity War")
                    dirName.set(R.string.dir_avgThree)
                    budPrice.set("31.6 crores USD")
                    movStory.set(R.string.story_avgThree)

                }
                else if (intent.getStringExtra("avengers") == "antTwo") {
                    movieName.set("Ant-Man And Wasp")
                    dirName.set(R.string.dir_antTwo)
                    budPrice.set("14.5 crores USD")
                    movStory.set(R.string.story_antTwo)

                }
                else if (intent.getStringExtra("avengers") == "capMarvel") {
                    movieName.set("Captain Marvel")
                    dirName.set(R.string.dir_marvelOne)
                    budPrice.set("15.2 crores USD")
                    movStory.set(R.string.story_marvel)

                }
                else if (intent.getStringExtra("avengers") == "avgFour") {
                    movieName.set("Avengers Endgame")
                    dirName.set(R.string.dir_avgFour)
                    budPrice.set("35.6 crores USD")
                    movStory.set(R.string.story_avgFour)

                }
                else if (intent.getStringExtra("avengers") == "spiderTwo") {
                    movieName.set("Spiderman Far From Home")
                    dirName.set(R.string.dir_spiderTwo)
                    budPrice.set("16 crores USD")
                    movStory.set(R.string.story_spiderTwo)

                }
                else if (intent.getStringExtra("avengers") == "widow") {
                    movieName.set("Black Widow")
                    dirName.set(R.string.dir_widow)
                    budPrice.set("20 crores USD")
                    movStory.set(R.string.story_widow)

                }
                else if (intent.getStringExtra("avengers") == "eternal") {
                    movieName.set("Eternals")
                    dirName.set(R.string.dir_eternal)
                    budPrice.set("20 crores USD")
                    movStory.set(R.string.story_eternal)

                }
                else if (intent.getStringExtra("avengers") == "docTwo") {
                    movieName.set("Doctor Strange Multiverse of Madness")
                    dirName.set(R.string.dir_docTwo)
                    budPrice.set("20 crores USD")
                    movStory.set(R.string.story_docTwo)

                }
                else if (intent.getStringExtra("avengers") == "thorFour") {
                    movieName.set("Thor Love and Thunder")
                    dirName.set(R.string.dir_thorFour)
                    budPrice.set("15 crores USD")
                    movStory.set(R.string.story_thorFour)

                }

            }
        }
    }
    fun clicks(value:String)

    {

    }

}


