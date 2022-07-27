package com.tw.instagram.di

import com.tw.instagram.repositories.PostRepository
import com.tw.instagram.viewmodels.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val homeModule = module{
    single {PostRepository()}
    viewModel { HomeViewModel(get()) }
}