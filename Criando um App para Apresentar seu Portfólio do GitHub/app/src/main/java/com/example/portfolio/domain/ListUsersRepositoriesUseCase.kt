package com.example.portflio.domain

import com.example.portflio.core.UseCase
import com.example.portflio.data.di.services.GitHubServices
import com.example.portflio.data.model.Repo
import com.example.portflio.data.repositores.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUsersRepositoriesUseCase(
    private val repository: RepoRepository) :
    UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return  repository.listRepositories(param)
    }
}
