package com.example.portflio.data.repositores

import com.example.portflio.data.di.services.GitHubServices
import kotlinx.coroutines.flow.flow


class RepoRepositoryImpl(private val service: GitHubServices) : RepoRepository {
    override suspend fun listRepositories(user: String) = flow {
        val repoList = service.listRepositories(user)
        emit(repoList)
    }


}
