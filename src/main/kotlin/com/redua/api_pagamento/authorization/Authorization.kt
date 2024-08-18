package com.redua.api_pagamento.authorization


class Authorization(val message:String) {

    fun isAuthorized(): Boolean{
        return message == "Autorizado"
    }
}