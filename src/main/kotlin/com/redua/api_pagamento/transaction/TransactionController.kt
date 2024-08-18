package com.redua.api_pagamento.transaction

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("transaction")
class TransactionController {

    lateinit var transactionService: TransactionService

    @GetMapping
    fun listTransaction(): List<Transaction>{
        return transactionService.list()
    }

    @PostMapping
    fun createTransaction(@RequestBody transaction: Transaction): Transaction{
        return transactionService.create(transaction)
    }
}