package com.example.religionapp.ui.viewmodel

import com.example.religionapp.data.cloud.BookData
import com.example.religionapp.domain.usecase.BaseUseCase
import com.example.religionapp.ui.core.Communication

class MainViewModel(
    private val useCase: BaseUseCase,
    private val communication: Communication<BookData>
) : BaseViewModel() {


}