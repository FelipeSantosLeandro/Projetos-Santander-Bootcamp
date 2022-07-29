package com.example.portflio.domain.di

import com.example.portflio.domain.ListUsersRepositoriesUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModule())
    }
    private fun useCaseModule() : Module {
        return module {
            factory { ListUsersRepositoriesUseCase(get()) }
        }
    }
}
