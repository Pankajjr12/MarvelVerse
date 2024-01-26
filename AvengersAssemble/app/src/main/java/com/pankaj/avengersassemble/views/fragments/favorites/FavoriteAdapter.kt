package com.pankaj.avengersassemble.views.fragments.favorites

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pankaj.avengersassemble.R
import com.pankaj.avengersassemble.database.MovieEntity
import com.pankaj.avengersassemble.model.MovieModel
import com.squareup.picasso.Picasso

class FavoriteAdapter (val context: Context, val bookList: List<MovieModel>) :
    RecyclerView.Adapter<FavoriteAdapter.FavouriteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavouriteViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fav_layout, parent, false)

        return FavouriteViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    override fun onBindViewHolder(holder: FavouriteViewHolder, position: Int) {

        val book = bookList[position]

        holder.txtMovieName.text = book.movieName
        holder.txtRelYear.text = book.movieYear
        Picasso.get().load(book.movieImage).error(R.drawable.antman1).into(holder.imgMovieImage)
    }

    class FavouriteViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtMovieName: TextView = view.findViewById(R.id.movieName)
        val txtRelYear: TextView = view.findViewById(R.id.relYear)
        val imgMovieImage: ImageView = view.findViewById(R.id.img)
        val llContent: LinearLayout = view.findViewById(R.id.lllayout)
    }
}

