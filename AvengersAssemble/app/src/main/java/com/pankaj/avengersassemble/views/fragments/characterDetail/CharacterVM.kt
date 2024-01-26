package com.pankaj.avengersassemble.views.fragments.characterDetail

import android.content.Context
import android.content.Intent
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel
import com.pankaj.avengersassemble.R
import com.pankaj.avengersassemble.views.activities.home.HomeActivity

class CharacterVM(val context: Context,val intent: Intent) : ViewModel() {
    var heroName = ObservableField("")
    var heroHeight = ObservableField("")
    var aboutStory = ObservableInt()
    var tagName=ObservableField("")

    init {
        when {
            intent.hasExtra("characters") -> {

                if (intent.getStringExtra("characters") == "wanda") {
                    heroName.set("Wanda MaximOff")
                    heroHeight.set("Avengers Age of Ultron, Captain America Civil War, Avengers Infinity War, Avengers Endgame, Wanda & Vision Web-Series")
                    tagName.set("The Witch")
                    aboutStory.set(R.string.wanda_about)
                }
                if (intent.getStringExtra("characters")=="black")
                {
                    tagName.set("Natasha Romanoff")
                    heroHeight.set("Iron Man 2, Avengers 2012, Avengers Age of Ultron, Captain America Civil War, Avengers Infinity War, Avengers Endgame, Black Widow")
                    heroName.set("Black Widow")
                    aboutStory.set(R.string.nat_about)
                }
                if (intent.getStringExtra("characters")=="thor")
                {
                    heroName.set("Thor Odinson")
                    heroHeight.set("Thor, Avengers 2012, Thor The Dark World, Avengers Age of Ultron, Captain America Civil War, Avengers Infinity War, Thor Ragnarok, Avengers Endgame")
                    tagName.set("God of Thunder")
                    aboutStory.set(R.string.thor_about)

                }
                if (intent.getStringExtra("characters")=="iron")
                {
                    tagName.set("Tony Stark")
                    heroHeight.set("Iron Man 1, Iron Man 2, Avengers 2012, Iron Man 3, Avengers Age of Ultron, Captain America Civil War, Avengers Infinity War, SpiderMan Homecoming, Avengers Endgame")
                    heroName.set("Iron Man")
                    aboutStory.set(R.string.iron_about)
                }
                if (intent.getStringExtra("characters")=="marvel")
                {
                    heroHeight.set("Captain Marvel,Avengers Endgame,Captain Marvel 2")
                    tagName.set("Carol Danvers")
                    heroName.set("Captain Marvel")
                    aboutStory.set(R.string.marvel_about)
                }
                if (intent.getStringExtra("characters")=="america")
                {
                    heroHeight.set("Captain America First Avenger, Avengers 2012, Captain America Winter Soldier, Avengers Age of Ultron, Captain America Civil War, Avengers Infinity War, Avengers Endgame")
                    tagName.set("Steve Rogers")
                    heroName.set("Captain America")
                    aboutStory.set(R.string.america_about)
                }
                if (intent.getStringExtra("characters")=="hulk")
                {
                    heroHeight.set("Incredible Hulk, Avengers 2012, Avengers Age of Ultron, Avengers Infinity War, Thor Ragnarok, Avengers Endgame")
                    tagName.set("Bruce Banner")
                    heroName.set("Hulk")
                    aboutStory.set(R.string.hulk_about)
                }
                if (intent.getStringExtra("characters")=="panther")
                {
                    heroHeight.set("Captain America Civil War, Black Panther, Avengers Infinity War, Avengers Endgame")
                    tagName.set("T'Challa")
                    heroName.set("Black Panther")
                    aboutStory.set(R.string.panther_about)
                }
                if (intent.getStringExtra("characters")=="hawk")
                {
                    heroHeight.set("Avengers 2012, Avengers Age of Ultron, Captain America Civil War, Avengers Infinity War, Avengers Endgame, HawkEye Web-series")
                    tagName.set("Clint Barton")
                    heroName.set("HawkEye")
                    aboutStory.set(R.string.hawk_about)
                }
                if (intent.getStringExtra("characters")=="winter")
                {
                    heroHeight.set("Captain America Winter Soldier, Captain America Civil War, avengers Infinity War, Avengers Endgame, The Falcon and Winter Soldier Web-series")
                    tagName.set("Bucky Barnes")
                    heroName.set("Winter Soldier")
                    aboutStory.set(R.string.winter_about)
                }
                if (intent.getStringExtra("characters")=="vision")
                {
                    heroHeight.set("Avengers Age of Ultron, Captain America Civil War, Avengers Infinity War, Avengers Endgame, Wanda & Vision Web Series")
                    heroName.set("Vision")
                    tagName.set("Mind Stone")
                    aboutStory.set(R.string.vision_about)
                }
                if (intent.getStringExtra("characters")=="spider")
                {
                    heroHeight.set("SpiderMan Homecoming, Captain America Civil War, Avengers Infinity War, Avengers Endgame, SpiderMan Far From Home, SpiderMan No Way Home")
                    tagName.set("Peter Parker")
                    heroName.set("SpiderMan")
                    aboutStory.set(R.string.spider_about)
                }
                if (intent.getStringExtra("characters")=="war")
                {
                    heroHeight.set("Iron Man 1, Iron Man 2, Iron Man 3, Avengers Age of Ultron, Captain America Civil War, Avengers Infinity War, Avengers Endgame")
                    tagName.set("James Rhodey")
                    heroName.set("War Machine")
                    aboutStory.set(R.string.war_about)
                }
                if (intent.getStringExtra("characters")=="doctor")
                {
                    heroHeight.set("Doctor Strange, Avengers Infinity War, Avengers Endgame, Doctor Strange Multiverse of Madness")
                    tagName.set("The eye of Agamotto")
                    heroName.set("Doctor Strange")
                    aboutStory.set(R.string.doctor_about)
                }
                if (intent.getStringExtra("characters")=="loki")
                {
                    heroHeight.set("Thor, Avengers 2012, Thor The Dark World, Avengers Infinity War, Thor Ragnarok, Avengers Endgame, Loki Web-series")
                    heroName.set("Loki")
                    tagName.set("The God of Mischief")
                    aboutStory.set(R.string.loki_about)
                }
                if (intent.getStringExtra("characters")=="thanos")
                {
                    heroHeight.set("Guardian of Galaxy Vol 2, Avengers Infinity war, Avengers Endgame")
                    heroName.set("Thanos")
                    tagName.set("The Great Titan")
                    aboutStory.set(R.string.thanos_about)
                }
                if (intent.getStringExtra("characters")=="kang")
                {
                    heroHeight.set("Loki Web-series")
                    heroName.set("Kang")
                    tagName.set("The Conqueror")
                    aboutStory.set(R.string.kang_about)
                }
                if (intent.getStringExtra("characters")=="falcon")
                {
                    heroHeight.set("Captain America Civil War, Avengers Infinity war, Avengers Endgame, The Falcon and Winter Soldier Web-series")
                    tagName.set("Sam Wilson")
                    heroName.set("Falcon")
                    aboutStory.set(R.string.falcon_about)
                }
                if (intent.getStringExtra("characters")=="wong")
                {
                    heroHeight.set("Doctor Strange, Avengers Infinity war, Avengers Endgame")
                    tagName.set("Martial Arts")
                    heroName.set("Wong")
                    aboutStory.set(R.string.wong_about)
                }
                if (intent.getStringExtra("characters")=="star")
                {
                    heroHeight.set("Guardian of Galaxy Vol 1, Guardian of Galaxy Vol 2, Avengers Infinity War, Avengers Endgame")
                    tagName.set("Peter Quill")
                    heroName.set("Star Lord")
                    aboutStory.set(R.string.star_about)
                }
                if (intent.getStringExtra("characters")=="drax")
                {
                    heroHeight.set("Guardian of Galaxy Vol 1, Guardian of Galaxy Vol 2, Avengers Infinity War, Avengers Endgame")
                    heroName.set("Drax")
                    tagName.set("The Destroyer")
                    aboutStory.set(R.string.drax_about)
                }
                if (intent.getStringExtra("characters")=="gamora")
                {
                    heroHeight.set("Guardian of Galaxy Vol 1, Guardian of Galaxy Vol 2, Avengers Infinity War, Avengers Endgame")
                    heroName.set("Gamora")
                    tagName.set("Daughter of thanos")
                    aboutStory.set(R.string.gamora_about)
                }
                if (intent.getStringExtra("characters")=="mantis")
                {
                    heroHeight.set("Guardian of Galaxy Vol 2, Avengers Infinity War, Avengers Endgame")
                    heroName.set("Mantis")
                    tagName.set("Empathy")
                    aboutStory.set(R.string.mantis_about)
                }
                if (intent.getStringExtra("characters")=="rocket")
                {
                    heroHeight.set("Guardian of Galaxy Vol 1, Guardian of Galaxy Vol 2, Avengers Infinity War, Avengers Endgame")
                    heroName.set("Rocket")
                    tagName.set("Raccoon")
                    aboutStory.set(R.string.rocket_about)
                }
                if (intent.getStringExtra("characters")=="groot")
                {
                    heroHeight.set("Guardian of Galaxy Vol 1, Guardian of Galaxy Vol 2, Avengers Infinity War, Avengers Endgame")
                    heroName.set("Groot")
                    tagName.set("Galactic Roots")
                    aboutStory.set(R.string.groot_about)
                }
                if (intent.getStringExtra("characters")=="nebula")
                {
                    heroHeight.set("Guardian of Galaxy Vol 1, Guardian of Galaxy Vol 2, Avengers Infinity War, Avengers Endgame")
                    heroName.set("Nebula")
                    tagName.set("Daughter of thanos")
                    aboutStory.set(R.string.neb_about)
                }
                if (intent.getStringExtra("characters")=="shuri")
                {
                    heroHeight.set("Black Panther, Avengers Infinity War, Avengers Endgame")
                    heroName.set("Shuri")
                    tagName.set("Sister of T'Challa")
                    aboutStory.set(R.string.shuri_about)
                }
                if (intent.getStringExtra("characters")=="okaye")
                {
                    heroHeight.set("Black Panther, Avengers Infinity War, Avengers Endgame")
                    heroName.set("Okoye")
                    tagName.set("General of Dora Milaje")
                    aboutStory.set(R.string.okaye_about)
                }
                if (intent.getStringExtra("characters")=="odin")
                {
                    heroHeight.set("Thor, Thor The Dark World, Thor Ragnarok")
                    heroName.set("Odin Borson")
                    tagName.set("God of War")
                    aboutStory.set(R.string.odin_about)
                }
                if (intent.getStringExtra("characters")=="minute")
                {
                    heroHeight.set("Loki Web-Series")
                    heroName.set("Miss Minute")
                    tagName.set("Timniopedia")
                    aboutStory.set(R.string.miss_about)
                }
                if (intent.getStringExtra("characters")=="valk")
                {
                    heroHeight.set("Thor Ragnarok, Avengers Endgame")
                    heroName.set("Valkyrie")
                    tagName.set("Asgardian Warrior")
                    aboutStory.set(R.string.val_about)
                }
                if (intent.getStringExtra("characters")=="antman")
                {
                    heroHeight.set("Captain America Civil War, AntMan 1, AntMan & Wasp, Avengers Endgame")
                    heroName.set("AntMan")
                    tagName.set("Scott Lang")
                    aboutStory.set(R.string.antman_about)
                }
                if (intent.getStringExtra("characters")=="wasp")
                {
                    heroHeight.set("AntMan 1, AntMan & Wasp, Avengers Endgame")
                    heroName.set("Wasp")
                    tagName.set("Hank Pym Daughter")
                    aboutStory.set(R.string.wasp_about)
                }
                if (intent.getStringExtra("characters")=="hamdell")
                {
                    heroHeight.set("Thor, Thor The dark World, Thor Ragnarok, Avengers Endgame")
                    heroName.set("Heimdall")
                    tagName.set("The Watchman of gods")
                    aboutStory.set(R.string.ham_about)
                }
                if (intent.getStringExtra("characters")=="happy")
                {
                    heroHeight.set("Iron Man 2, Iron Man 3, SpiderMan Homecoming, Avengers Endgame, SpiderMan Far From Home")
                    heroName.set("Happy Hogan")
                    tagName.set("Fight Manager")
                    aboutStory.set(R.string.happy_about)
                }
                if (intent.getStringExtra("characters")=="yel")
                {
                    heroHeight.set("Inhumans Web-series, Black Widow, HawkEye Web-series")
                    heroName.set("Yelena Belova")
                    tagName.set("Natasha's Sister")
                    aboutStory.set(R.string.yelena_about)
                }
                if (intent.getStringExtra("characters")=="fury")
                {
                    heroHeight.set("Avengers 2012, Avengers Age of Ultron, Avengers Infinity War, Captain Marvel, Avengers Endgame")
                    heroName.set("Nick Fury")
                    tagName.set("Governor of Shield")
                    aboutStory.set(R.string.nick_about)
                }
                if (intent.getStringExtra("characters")=="egor")
                {
                    heroHeight.set("Guardian of Galaxy Vol 2")
                    heroName.set("Ego")
                    tagName.set("The Living Planet")
                    aboutStory.set(R.string.ego_about)
                }

            }
        }
    }
    fun more(value:String)
    {


    }
}

