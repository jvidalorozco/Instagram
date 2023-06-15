package com.celeste.composeinstagram.login.data.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import javax.inject.Inject

class LoginService @Inject constructor(
    private val loginClient: LoginClient
) {
    suspend fun doLogin(user: String, password: String): Boolean {
        return withContext(context = Dispatchers.IO) {
            loginClient.doLogin()
                .body()?.success ?: false
        }
    }
}