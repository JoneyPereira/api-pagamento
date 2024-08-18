package com.redua.api_pagamento.notification

import com.redua.api_pagamento.transaction.Transaction
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.web.client.RestClient

class NotificationConsumer {

    private lateinit var restClient: RestClient

    private val uri = "https://run.mocky.io/v3/54dc2cf1-3add-45b5-b5a9-6bf7e7f1f4a6"

    @KafkaListener(topics = ["transaction-notification"], groupId = "api-pagamento")
    fun receiveNotification(transaction: Transaction){
        val response = restClient
            .get()
            .uri(uri)
            .retrieve()
            .body(Notification::class.java)
        if (response == null || !response.message) {
            throw RuntimeException("Mensagem não enviada!")
        }
    }
}