package com.pankaj.avengersassemble.database

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.pankaj.avengersassemble.model.MovieModel

interface MovieDao {
    @Insert
    fun insertBook(bookEntity: MovieModel)

    @Delete
    fun deleteBook(bookEntity: MovieModel)

    @Query("SELECT * FROM movies")
    fun getAllBooks(): List<MovieModel>

    @Query("SELECT * FROM movies WHERE movie_id = :movieId")
    fun getBookById(movieId: String): MovieModel
}


