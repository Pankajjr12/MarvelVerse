package com.pankaj.avengersassemble


import androidx.databinding.BindingAdapter
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager

import com.google.android.material.tabs.TabLayout

object CommomMethods {
    @BindingAdapter(value = ["setRecyclerAdapter"], requireAll = false)
    @JvmStatic
    fun setRecyclerAdapter(recyclerView: RecyclerView, adapter: RecyclerView.Adapter<*>) {
        recyclerView.adapter = adapter
    }
    @BindingAdapter(value = ["setViewPagerAdapterWithTab", "setTapLayout"], requireAll = false)
    @JvmStatic
    fun setViewPagerAdapterWithTab(vp: ViewPager, adapter: FragmentPagerAdapter, tab: TabLayout?) {
        vp.adapter = adapter
        tab?.setupWithViewPager(vp)
    }

//    @BindingAdapter("android:src")
//    fun setImageViewResource(imageView: ImageView, resource: String) {
//        Glide.with(imageView.context).load(resource).into(imageView)
//    }
}