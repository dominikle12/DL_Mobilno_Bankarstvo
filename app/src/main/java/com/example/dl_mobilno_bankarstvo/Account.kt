package com.example.dl_mobilno_bankarstvo

data class Account(
    var accUsername: String,
    var accPass: String,
    val accType: String,
    val accName: String,
    val IBAN: String,
    val accountMoneyAmount: Int
)
