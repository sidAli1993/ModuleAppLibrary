package com.example.finimopaymentlib.models.builderobjects.transactionobj

import com.example.finimopaymentlib.enums.enviornmentenum.Environment
import com.example.finimopaymentlib.enums.transactionenum.TransactionType


class TransactionRequest(
    var amount: String,
    var currency: String,
    var request: TransactionType = TransactionType.SALE,
    var environment: Environment = Environment.DEVELOPMENT
) {

    data class Builder(
        var amount: String,
        var currency: String,
        var request: TransactionType = TransactionType.SALE,
        var environment: Environment = Environment.DEVELOPMENT
    ) {
        fun amount(amount: String) = apply { this.amount = amount }
        fun currency(currency: String) = apply { this.currency = currency }
        fun environment(environment: Environment) = apply { this.environment = environment }
        fun request(request: TransactionType) = apply { this.request = request }
        fun build() = TransactionRequest(amount, currency, request, environment)
    }
}