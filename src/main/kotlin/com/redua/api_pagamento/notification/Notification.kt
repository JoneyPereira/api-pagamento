package com.redua.api_pagamento.notification

import jakarta.persistence.Table

@Table(name = "tb_notification")
data class Notification(var message: Boolean)
