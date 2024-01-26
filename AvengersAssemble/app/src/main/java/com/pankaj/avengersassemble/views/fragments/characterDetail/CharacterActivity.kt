package com.pankaj.avengersassemble.views.fragments.characterDetail


import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import androidx.appcompat.app.AppCompatActivity

import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.appbar.AppBarLayout
import com.pankaj.avengersassemble.R
import com.pankaj.avengersassemble.databinding.ActivityCharacterBinding

import kotlinx.android.synthetic.main.activity_character.*



class CharacterActivity : AppCompatActivity(), AppBarLayout.OnOffsetChangedListener {

    private var signUp: ActivityCharacterBinding?= null
   private  val  PERCENTAGE_TO_SHOW_TITLE_AT_TOOLBAR = 0.6f
    private val PERCENTAGE_TO_HIDE_TITLE_DETAILS = 0.3f
    private val ALPHA_ANIMATIONS_DURATION = 200
    private var mIsTheTitleVisible = false
    private var mIsTheTitleContainerVisible = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        signUp = DataBindingUtil.setContentView(this, R.layout.activity_character)
        val factory = FactoryCharacterDetail(this, intent)
        val viewModel = ViewModelProvider(this, factory).get(CharacterVM::class.java)
        signUp?.character = viewModel

        val intent=intent
        val str=intent.getStringExtra("characters")
        if (str=="wanda")
        {
            imgHero.setImageResource(R.drawable.hero_wanda)
            backGrad.setImageResource(R.drawable.wandabg)
            cirHero.setImageResource(R.drawable.wanda)
        }
        if(str=="black")
        {
            imgHero.setImageResource(R.drawable.hero_widow)
            backGrad.setImageResource(R.drawable.blackbg)
            cirHero.setImageResource(R.drawable.widow)
        }
        if(str=="thor")
        {
            imgHero.setImageResource(R.drawable.hero_thor)
            backGrad.setImageResource(R.drawable.asgard)
            cirHero.setImageResource(R.drawable.thorodin)
        }
        if(str=="iron")
        {
            imgHero.setImageResource(R.drawable.hero_iron)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.iron)
        }
        if(str=="marvel")
        {
            imgHero.setImageResource(R.drawable.hero_marvel)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.marvelc)
        }
        if(str=="america")
        {
            imgHero.setImageResource(R.drawable.hero_cap)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.acap)
        }
        if(str=="hulk")
        {
            imgHero.setImageResource(R.drawable.hero_hulk)
            backGrad.setImageResource(R.drawable.hulkbg)
            cirHero.setImageResource(R.drawable.hukie)
        }
        if(str=="panther")
        {
            imgHero.setImageResource(R.drawable.hero_panther)
            backGrad.setImageResource(R.drawable.blbg)
            cirHero.setImageResource(R.drawable.bpanther)
        }
        if(str=="hawk")
        {
            imgHero.setImageResource(R.drawable.hero_hawk)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.hawkeye)
        }
        if(str=="winter")
        {
            imgHero.setImageResource(R.drawable.hero_winter)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.bucky)
        }
        if(str=="vision")
        {
            imgHero.setImageResource(R.drawable.vis_hero)
            backGrad.setImageResource(R.drawable.yelbg)
            cirHero.setImageResource(R.drawable.vision)
        }
        if(str=="spider")
        {
            imgHero.setImageResource(R.drawable.hero_spider)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.spiderman)
        }
        if(str=="war")
        {
            imgHero.setImageResource(R.drawable.hero_war)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.war)
        }
        if(str=="doctor")
        {
            imgHero.setImageResource(R.drawable.hero_doc)
            backGrad.setImageResource(R.drawable.docbg)
            cirHero.setImageResource(R.drawable.doc)
        }
        if(str=="loki")
        {
            imgHero.setImageResource(R.drawable.hero_loki)
            backGrad.setImageResource(R.drawable.lokibg)
            cirHero.setImageResource(R.drawable.loki)
        }
        if(str=="thanos")
        {
            imgHero.setImageResource(R.drawable.hero_thanos)
            backGrad.setImageResource(R.drawable.thanosbg)
            cirHero.setImageResource(R.drawable.thanos)
        }
        if(str=="kang")
        {
            imgHero.setImageResource(R.drawable.kong)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.kong)
        }
        if(str=="falcon")
        {
            imgHero.setImageResource(R.drawable.hero_falcon)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.falcon)
        }
        if(str=="wong")
        {
            imgHero.setImageResource(R.drawable.hero_wong)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.wong)
        }
        if(str=="yel")
        {
            imgHero.setImageResource(R.drawable.hero_yel)
            backGrad.setImageResource(R.drawable.yelbg)
            cirHero.setImageResource(R.drawable.yel)
        }
        if(str=="star")
        {
            imgHero.setImageResource(R.drawable.hero_star)
            backGrad.setImageResource(R.drawable.galbg)
            cirHero.setImageResource(R.drawable.star)
        }
        if(str=="drax")
        {
            imgHero.setImageResource(R.drawable.hero_drax)
            backGrad.setImageResource(R.drawable.galbg)
            cirHero.setImageResource(R.drawable.drax)
        }
        if(str=="gamora")
        {
            imgHero.setImageResource(R.drawable.hero_gamora)
            backGrad.setImageResource(R.drawable.galbg)
            cirHero.setImageResource(R.drawable.gamora)
        }
        if(str=="mantis")
        {
            imgHero.setImageResource(R.drawable.hero_mantis)
            backGrad.setImageResource(R.drawable.galbg)
            cirHero.setImageResource(R.drawable.mat)
        }
        if(str=="rocket")
        {
            imgHero.setImageResource(R.drawable.hero_rocket)
            backGrad.setImageResource(R.drawable.galbg)
            cirHero.setImageResource(R.drawable.rocket)
        }
        if(str=="groot")
        {
            imgHero.setImageResource(R.drawable.hero_groot)
            backGrad.setImageResource(R.drawable.galbg)
            cirHero.setImageResource(R.drawable.grooot)
        }
        if(str=="nebula")
        {
            imgHero.setImageResource(R.drawable.hero_neb)
            backGrad.setImageResource(R.drawable.galbg)
            cirHero.setImageResource(R.drawable.nebula)
        }
        if(str=="shuri")
        {
            imgHero.setImageResource(R.drawable.hero_shuri)
            backGrad.setImageResource(R.drawable.blbg)
            cirHero.setImageResource(R.drawable.shuri)
        }
        if(str=="okaye")
        {
            imgHero.setImageResource(R.drawable.hero_okaye)
            backGrad.setImageResource(R.drawable.blbg)
            cirHero.setImageResource(R.drawable.okaye)
        }
        if(str=="odin")
        {
            imgHero.setImageResource(R.drawable.hero_odin)
            backGrad.setImageResource(R.drawable.asgard)
            cirHero.setImageResource(R.drawable.odin)
        }
        if(str=="minute")
        {
            imgHero.setImageResource(R.drawable.missminute)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.missminute)
        }
        if(str=="valk")
        {
            imgHero.setImageResource(R.drawable.hero_valk)
            backGrad.setImageResource(R.drawable.asgard)
            cirHero.setImageResource(R.drawable.valkyrie)
        }
        if(str=="happy")
        {
            imgHero.setImageResource(R.drawable.hero_happy)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.happt)
        }
        if(str=="antman")
        {
            imgHero.setImageResource(R.drawable.hero_ant)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.ant)
        }
        if(str=="wasp")
        {
            imgHero.setImageResource(R.drawable.hero_hope)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.hope)
        }
        if(str=="hamdell")
        {
            imgHero.setImageResource(R.drawable.ham_hwerp)
            backGrad.setImageResource(R.drawable.asgard)
            cirHero.setImageResource(R.drawable.hamedell)
        }

        if(str=="fury")
        {
            imgHero.setImageResource(R.drawable.hero_nick)
            backGrad.setImageResource(R.drawable.marvelbg)
            cirHero.setImageResource(R.drawable.fury)
        }
        if(str=="egor")
        {
            imgHero.setImageResource(R.drawable.hero_egor)
            backGrad.setImageResource(R.drawable.galbg)
            cirHero.setImageResource(R.drawable.ego)
        }



        main_appbar.addOnOffsetChangedListener(this)
        startAlphaAnimation(main_textview_title, 0, View.INVISIBLE)
    }

    override fun onOffsetChanged(appBarLayout: AppBarLayout, offset: Int) {
        val maxScroll = appBarLayout.totalScrollRange
        val percentage = Math.abs(offset).toFloat() / maxScroll.toFloat()
        handleAlphaOnTitle(percentage)
        handleToolbarTitleVisibility(percentage)
    }
    
    private fun handleToolbarTitleVisibility(percentage: Float) {
        if (percentage >= PERCENTAGE_TO_SHOW_TITLE_AT_TOOLBAR) {
            if (!mIsTheTitleVisible) {
                startAlphaAnimation(
                    main_textview_title,
                    ALPHA_ANIMATIONS_DURATION.toLong(),
                    View.VISIBLE
                )
                mIsTheTitleVisible = true
            }
        } else {
            if (mIsTheTitleVisible) {
                startAlphaAnimation(
                    main_textview_title,
                    ALPHA_ANIMATIONS_DURATION.toLong(),
                    View.INVISIBLE
                )

                mIsTheTitleVisible = false
            }
        }
    }
    private fun handleAlphaOnTitle(percentage: Float) {
        if (percentage >= PERCENTAGE_TO_HIDE_TITLE_DETAILS) {
            if (mIsTheTitleContainerVisible) {
                startAlphaAnimation(
                    main_linearlayout_title,
                    ALPHA_ANIMATIONS_DURATION.toLong(),
                    View.INVISIBLE
                )

                mIsTheTitleContainerVisible = false
            }
        } else {
            if (!mIsTheTitleContainerVisible) {
                startAlphaAnimation(
                    main_linearlayout_title,
                    ALPHA_ANIMATIONS_DURATION.toLong(),
                    View.VISIBLE
                )
                mIsTheTitleContainerVisible = true
            }
        }
    }
    fun startAlphaAnimation(v: View, duration: Long, visibility: Int) {
        val alphaAnimation =
            if (visibility == View.VISIBLE) AlphaAnimation(0f, 1f) else AlphaAnimation(1f, 0f)
        alphaAnimation.duration = duration
        alphaAnimation.fillAfter = true
        v.startAnimation(alphaAnimation)
    }
}