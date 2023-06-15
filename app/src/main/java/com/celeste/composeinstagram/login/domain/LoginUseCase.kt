package com.celeste.composeinstagram.login.domain

import com.celeste.composeinstagram.login.data.LoginRepository

class LoginUseCase {
    private val loginRepository = LoginRepository()

    suspend operator fun invoke(user: String, password: String): Boolean {
        return loginRepository.doLogin(user = user, password = password)
    }
}