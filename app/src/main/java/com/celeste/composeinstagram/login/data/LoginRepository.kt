package com.celeste.composeinstagram.login.data

import com.celeste.composeinstagram.login.data.network.LoginService
import javax.inject.Inject

class LoginRepository @Inject constructor(
    private val api : LoginService
) {
    suspend fun doLogin(user: String, password: String): Boolean {
        return api.doLogin(user = user, password = password)
    }
}