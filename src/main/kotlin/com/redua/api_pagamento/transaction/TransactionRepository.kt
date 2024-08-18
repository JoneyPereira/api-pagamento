package com.redua.api_pagamento.transaction

import org.springframework.data.repository.ListCrudRepository

interface TransactionRepository: ListCrudRepository<Transaction, Int> {
}