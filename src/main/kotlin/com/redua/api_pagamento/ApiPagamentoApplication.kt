package com.redua.api_pagamento

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class ApiPagamentoApplication

fun main(args: Array<String>) {
	runApplication<ApiPagamentoApplication>(*args)
}
