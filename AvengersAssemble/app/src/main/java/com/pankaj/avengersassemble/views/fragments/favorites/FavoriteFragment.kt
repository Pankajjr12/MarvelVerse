package com.pankaj.avengersassemble.views.fragments.favorites

import android.content.Context
import android.os.AsyncTask
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.RelativeLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.pankaj.avengersassemble.R
import com.pankaj.avengersassemble.database.MovieDatabase
import com.pankaj.avengersassemble.database.MovieEntity
import com.pankaj.avengersassemble.model.MovieModel

class FavoriteFragment :Fragment()
{
    lateinit var recyclerFavourite: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: FavoriteAdapter
    var dbBookList = listOf<MovieModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_favorite, container, false)

        recyclerFavourite = view.findViewById(R.id.recyclerFavourite)

        layoutManager = LinearLayoutManager(activity as Context)

        dbBookList = RetrieveFavourites(activity as Context).execute().get()

        if (activity != null) {
            recyclerAdapter = FavoriteAdapter(activity as Context, dbBookList)
            recyclerFavourite.adapter = recyclerAdapter
            recyclerFavourite.layoutManager = layoutManager
        }
        return view
    }


    class RetrieveFavourites(val context: Context) : AsyncTask<Void, Void, List<MovieModel>>() {

        override fun doInBackground(vararg p0: Void?): List<MovieModel> {
            val db = Room.databaseBuilder(context, MovieDatabase::class.java, "books-db").build()

            return db.movieDao().getAllBooks()
        }

    }
}