package com.redua.api_pagamento.wallet

import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal

@Table(name = "tb_wallets")
data class Wallets(@Id var id: Int,
                        var fullName: String,
                        var cpfCnpj: String,
                        var email: String,
                        var password: String,
                        var type: Int,
                        var balance: BigDecimal){

    fun debit(value: BigDecimal?): Wallets {
        return Wallets(
            id, fullName, cpfCnpj, email, password, type,
            balance.subtract(value)
        )
    }

    fun credit(value: BigDecimal?): Wallets {
        return Wallets(
            id, fullName, cpfCnpj, email, password, type,
            balance.add(value))
    }
}
