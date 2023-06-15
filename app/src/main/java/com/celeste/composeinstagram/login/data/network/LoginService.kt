package com.celeste.composeinstagram.login.data.network

import com.celeste.composeinstagram.core.network.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user: String, password: String): Boolean {
        return withContext(context = Dispatchers.IO) {
            retrofit.create(LoginClient::class.java)
                .doLogin()
                .body()?.success ?: false
        }
    }
}