package com.example.movie_app.data.remote

import com.example.movie_app.application.AppConstants
import com.example.movie_app.data.model.MovieList
import com.example.movie_app.repository.WebService

class RemoteMovieDataSource(private val webService: WebService) {

    suspend fun getUpcomingMovies(): MovieList = webService.getUpcomingMovies(AppConstants.API_KEY)

    suspend fun getTopRatedMovies(): MovieList = webService.getTopRatedMovies(AppConstants.API_KEY)

    suspend fun getPopularMovies(): MovieList = webService.getPopularMovies(AppConstants.API_KEY)

}