package com.example.movie_app.repository

import com.example.movie_app.data.model.MovieList

interface MovieRepository {

    suspend fun getUpcomingMovies(): MovieList
    suspend fun getTopRatedMovies(): MovieList
    suspend fun getPopularMovies(): MovieList

}