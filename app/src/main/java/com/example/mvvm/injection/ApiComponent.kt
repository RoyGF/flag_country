package com.example.mvvm.injection

import com.example.mvvm.model.CountriesService
import com.example.mvvm.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)

}