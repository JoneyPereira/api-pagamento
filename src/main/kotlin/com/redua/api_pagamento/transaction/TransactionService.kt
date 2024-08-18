package com.redua.api_pagamento.transaction

import com.redua.api_pagamento.authorization.AuthorizerService
import com.redua.api_pagamento.notification.NotificationService
import com.redua.api_pagamento.wallet.WalletsRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class TransactionService {

    lateinit var transactionRepository: TransactionRepository
    lateinit var walletsRepository: WalletsRepository

    lateinit var authorizerService: AuthorizerService
    lateinit var notificationService: NotificationService

    @Transactional
    fun create(transaction: Transaction): Transaction {
        /*
        * validar transação
        * criar transação
        * debitar da carteira pagadora
        * creditar na carteira recebedora
        * chamar serviços externos
        * */
        validade(transaction)

        val newTransaction = transactionRepository.save(transaction)

        val walletsPayer = walletsRepository.findById(transaction.payer.toInt())
        val walletsPayee = walletsRepository.findById(transaction.payee.toInt())

        walletsRepository.save(walletsPayer.get().debit(transaction.value))
        walletsRepository.save(walletsPayee.get().credit(transaction.value))

        authorizerService.authorize(transaction)
        notificationService.notify(transaction)

        return newTransaction
    }

    fun validade(transaction: Transaction) {
        /*
        * transação valida se o pagador tem uma carteira do tipo comum
        * transação valida se o pagador tem saldo suficiente
        * transaçao valida se o pagador não for o recebedor
        * */
    }

    fun list(): List<Transaction> {
        return transactionRepository.findAll()
    }
}