package com.redua.api_pagamento.notification

import com.redua.api_pagamento.transaction.Transaction
import org.springframework.kafka.core.KafkaTemplate

class NotificationProducer {

    private lateinit var kafkaTemplate: KafkaTemplate<String, Transaction>

    fun sendNotification(transaction: Transaction){
        kafkaTemplate.send("transaction-notification", transaction)
    }
}