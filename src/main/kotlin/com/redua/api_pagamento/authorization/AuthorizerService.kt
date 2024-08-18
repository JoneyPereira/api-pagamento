package com.redua.api_pagamento.authorization

import com.redua.api_pagamento.transaction.Transaction
import org.springframework.stereotype.Service
import org.springframework.web.client.RestClient

@Service
class AuthorizerService {

    private lateinit var restClient: RestClient
    private val uri = "https://run.mocky.io/v3/5794d450-d2e2-4412-8131-73d0293ac1cc"

    fun authorize(transaction: Transaction){
        val response = restClient
            .get()
            .uri(uri)
            .retrieve()
            .body(Authorization::class.java)
        if (response == null || !response.isAuthorized()) {
            throw RuntimeException("Transação não autorizado!")
        }
    }
}