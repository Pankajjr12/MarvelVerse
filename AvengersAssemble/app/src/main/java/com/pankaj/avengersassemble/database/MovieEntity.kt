package com.pankaj.avengersassemble.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class MovieEntity(
    @PrimaryKey val movie_id: Int,
    @ColumnInfo(name = "movie_name") val movieName: String,
    @ColumnInfo(name = "movie_year") val movieYear: String,
    @ColumnInfo(name = "movie_image") val movieImage: String
)