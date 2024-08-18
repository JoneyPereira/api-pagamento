package com.redua.api_pagamento.notification

import com.redua.api_pagamento.transaction.Transaction
import org.springframework.stereotype.Service

@Service
class NotificationService {

    lateinit var notificationProducer: NotificationProducer

    fun notify(transaction: Transaction){
        notificationProducer.sendNotification(transaction)
    }
}