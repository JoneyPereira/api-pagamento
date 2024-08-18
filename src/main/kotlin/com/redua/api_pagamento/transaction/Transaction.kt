package com.redua.api_pagamento.transaction

import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.data.annotation.CreatedDate
import java.math.BigDecimal
import java.time.LocalDateTime

@Table(name = "tb_transaction")
data class Transaction(@Id var id: Int,
                       var payer: Long,
                       var payee: Long,
                       var value: BigDecimal,
                       @CreatedDate var createdAt: LocalDateTime)
