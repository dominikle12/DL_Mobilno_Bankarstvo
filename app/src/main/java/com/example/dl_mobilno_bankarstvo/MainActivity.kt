package com.example.dl_mobilno_bankarstvo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val account: Account = Account(accUsername = "domo", accPass = "oplomo",accType = "Žiro", accName = "Dominik Lesar", IBAN = "HR5725000096421853673", accountMoneyAmount = 1000)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}