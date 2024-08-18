package com.redua.api_pagamento.transaction

import org.springframework.stereotype.Service

@Service
class TransactionService {

    fun create() {
        /*
        * validar transação
        * criar transação
        * debitar da carteira
        * chamar serviços externos
        * */
    }

    fun validade(){
        /*
        * transação valida se o pagador tem uma carteira do tipo comum
        * transação valida se o pagador tem saldo suficiente
        * transaçao valida se o pagador não for o recebedor
        * */
    }
}