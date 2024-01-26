package com.pankaj.avengersassemble.views.fragments.movieDetailFragment


import android.content.Context
import android.graphics.Typeface
import android.os.AsyncTask
import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.pankaj.avengersassemble.R
import com.pankaj.avengersassemble.database.MovieDatabase
import com.pankaj.avengersassemble.database.MovieEntity
import com.pankaj.avengersassemble.databinding.FragmentMovieViewBinding
import com.pankaj.avengersassemble.model.MovieModel
import kotlinx.android.synthetic.main.fav_layout.*
import kotlinx.android.synthetic.main.fragment_movie_view.*

class MovieDetailActivity : AppCompatActivity() {

    var bookId: String? = "100"
    private var signUp: FragmentMovieViewBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        signUp = DataBindingUtil.setContentView(this, R.layout.fragment_movie_view)
        val factory = FactoryMovieDetail(this, intent)
        val viewModel = ViewModelProvider(this, factory).get(MovieDetailVM::class.java)
        signUp?.marvel = viewModel
        val bookEntity = MovieModel()
        favBtn.setOnClickListener {

            if (!DBAsyncTask(
                    applicationContext,
                    bookEntity,
                    1
                ).execute().get()
            ) {

                val async =
                    DBAsyncTask(applicationContext, bookEntity, 2).execute()
                val result = async.get()
                if (result) {
                    Toast.makeText(
                        this@MovieDetailActivity,
                        "Book added to favourites",
                        Toast.LENGTH_SHORT
                    ).show()

                } else {
                    Toast.makeText(
                        this@MovieDetailActivity,
                        "Some error occurred!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            } else {

                val async = DBAsyncTask(applicationContext, bookEntity, 3).execute()
                val result = async.get()

                if (result){
                    Toast.makeText(
                        this@MovieDetailActivity,
                        "Book removed from favourites",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    Toast.makeText(
                        this@MovieDetailActivity,
                        "Some error occurred!",
                        Toast.LENGTH_SHORT
                    ).show()
                }

            }
        }

        collTollbar.setExpandedTitleTypeface(Typeface.SANS_SERIF)
        val intent = intent
        val str = intent.getStringExtra("avengers")
        if (str == "ironOne") {
            movieImg.setImageResource(R.drawable.iron1)
        }
        if (str == "incHulk") {
            movieImg.setImageResource(R.drawable.ihulk)
        }
        if (str == "ironTwo") {
            movieImg.setImageResource(R.drawable.iron2)
        }
        if (str == "thorOne") {
            movieImg.setImageResource(R.drawable.thor1)
        }
        if (str == "captainOne") {
            movieImg.setImageResource(R.drawable.captain1)
        }
        if (str == "avgOne") {
            movieImg.setImageResource(R.drawable.avgone)
        }
        if (str == "ironThree") {
            movieImg.setImageResource(R.drawable.ironthree)
        }
        if (str == "thorTwo") {
            movieImg.setImageResource(R.drawable.thor2)
        }
        if (str == "captainTwo") {
            movieImg.setImageResource(R.drawable.cap2)
        }
        if (str == "galaxyOne") {
            movieImg.setImageResource(R.drawable.galxy1)
        }
        if (str == "avgTwo") {
            movieImg.setImageResource(R.drawable.avengers2)
        }
        if (str == "antOne") {
            movieImg.setImageResource(R.drawable.antman1)
        }
        if (str == "captainThree") {
            movieImg.setImageResource(R.drawable.civilwar)
        }
        if (str == "docOne") {
            movieImg.setImageResource(R.drawable.doctor_strange)
        }
        if (str == "galaxyTwo") {
            movieImg.setImageResource(R.drawable.galaxy2)
        }
        if (str == "spiderOne") {
            movieImg.setImageResource(R.drawable.spiderhome)
        }
        if (str == "thorThree") {
            movieImg.setImageResource(R.drawable.thor3)
        }
        if (str == "panther") {
            movieImg.setImageResource(R.drawable.panther)
        }
        if (str == "avgThree") {
            movieImg.setImageResource(R.drawable.avengers3)
        }
        if (str == "antTwo") {
            movieImg.setImageResource(R.drawable.ant2)
        }
        if (str == "capMarvel") {
            movieImg.setImageResource(R.drawable.capmarvel)
        }
        if (str == "avgFour") {
            movieImg.setImageResource(R.drawable.avengers4)
        }
        if (str == "spiderTwo") {
            movieImg.setImageResource(R.drawable.spidermanfar)
        }
        if (str == "widow") {
            movieImg.setImageResource(R.drawable.blackwidow)
        }
        if (str == "eternal") {
            movieImg.setImageResource(R.drawable.eternals)
        }
        if (str == "thorFour") {
            movieImg.setImageResource(R.drawable.thor4)
        }

    }
    class DBAsyncTask(val context: Context, val bookEntity: MovieModel, val mode: Int) :
        AsyncTask<Void, Void, Boolean>() {

        /*
        Mode 1 -> Check DB if the book is favourite or not
        Mode 2 -> Save the book into DB as favourite
        Mode 3 -> Remove the favourite book
        * */

        val db = Room.databaseBuilder(context, MovieDatabase::class.java, "books-db").build()

        override fun doInBackground(vararg p0: Void?): Boolean {

            when (mode) {

                1 -> {

                    // Check DB if the book is favourite or not
                    val book: MovieModel? = db.movieDao().getBookById(bookEntity.movie_id.toString())
                    db.close()
                    return book != null

                }

                2 -> {

                    // Save the book into DB as favourite
                    db.movieDao().insertBook(bookEntity)
                    db.close()
                    return true

                }

                3 -> {

                    // Remove the favourite book
                    db.movieDao().deleteBook(bookEntity)
                    db.close()
                    return true

                }
            }
            return false
        }

    }
}