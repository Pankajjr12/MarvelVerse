package com.pankaj.avengersassemble.views.fragments.movieFragment.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pankaj.avengersassemble.R
import com.pankaj.avengersassemble.model.MovieModel

import com.pankaj.avengersassemble.views.fragments.movieDetailFragment.MovieDetailActivity
import com.squareup.picasso.Picasso

import kotlinx.android.synthetic.main.adapter_movie_list.view.*

class AdapterMovieList(val context: Context,var movieList:List<MovieModel>):RecyclerView.Adapter<AdapterMovieList.MyViewModel>() {


var type=""
    class MyViewModel(itemView: View):RecyclerView.ViewHolder(itemView) {
        val img = itemView.imgMov
        val txt = itemView.movName
        val txt1 = itemView.releaseYear
        val layout = itemView.lLayout

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewModel {
        val lay= LayoutInflater.from(context).inflate(R.layout.adapter_movie_list,parent,false)
        return MyViewModel(lay)
    }

    override fun onBindViewHolder(holder: MyViewModel, position: Int) {
        val currentItem: MovieModel = movieList[position]
        holder.txt1.text = currentItem.year_name

        holder.txt.text = currentItem.movie_name
        Picasso.get().load(currentItem.image).into(holder.img)
        holder.layout.setOnClickListener{
                if (position==0) {
                    val intent = Intent(context, MovieDetailActivity::class.java)
                    intent.putExtra("avengers", "ironOne")
                    context.startActivity(intent)
                }
                if (position==1) {
                    val intent = Intent(context, MovieDetailActivity::class.java)
                    intent.putExtra("avengers", "incHulk")
                    context.startActivity(intent)
                }
            if (position==2) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "ironTwo")
                context.startActivity(intent)
            }
            if (position==3) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "thorOne")
                context.startActivity(intent)
            }
            if (position==4) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "captionOne")
                context.startActivity(intent)
            }
            if (position==5) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "avgOne")
                context.startActivity(intent)
            }
            if (position==6) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "ironThree")
                context.startActivity(intent)
            }
            if (position==7) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "thorTwo")
                context.startActivity(intent)
            }
            if (position==8) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "captainTwo")
                context.startActivity(intent)
            }
            if (position==9) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "galaxyOne")
                context.startActivity(intent)
            }
            if (position==10) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "avgTwo")
                context.startActivity(intent)
            }
            if (position==11) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "antOne")
                context.startActivity(intent)
            }
            if (position==12) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "captainThree")
                context.startActivity(intent)
            }
            if (position==13) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "docOne")
                context.startActivity(intent)
            }
            if (position==14) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "galaxyTwo")
                context.startActivity(intent)
            }
            if (position==15) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "spiderOne")
                context.startActivity(intent)
            }
            if (position==16) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "thorThree")
                context.startActivity(intent)
            }
            if (position==17) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "panther")
                context.startActivity(intent)
            }
            if (position==18) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "avgThree")
                context.startActivity(intent)
            }
            if (position==19) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "antTwo")
                context.startActivity(intent)
            }
            if (position==20) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "capMarvel")
                context.startActivity(intent)
            }
            if (position==21) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "avgFour")
                context.startActivity(intent)
            }
            if (position==22) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "spiderTwo")
                context.startActivity(intent)
            }
            if (position==23) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "widow")
                context.startActivity(intent)
            }
            if (position==24) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "eternal")
                context.startActivity(intent)
            }
            if (position==25) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "docTwo")
                context.startActivity(intent)
            }
            if (position==26) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("avengers", "thorFour")
                context.startActivity(intent)
            }
            }
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

}