package com.example.portflio.data.di.services

import com.example.portflio.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubServices {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String?): List<Repo>
}
