package com.redua.api_pagamento.wallet


import org.springframework.data.repository.CrudRepository

interface WalletsRepository: CrudRepository<Wallets, Int>  {
}