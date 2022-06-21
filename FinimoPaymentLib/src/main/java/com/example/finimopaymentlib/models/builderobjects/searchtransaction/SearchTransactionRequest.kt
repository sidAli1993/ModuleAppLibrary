package com.example.finimopaymentlib.models.builderobjects.searchtransaction

import com.example.finimopaymentlib.models.builderobjects.initiliazesessions.AuthResponse

class SearchTransactionRequest(
    var amount: String,
    var authResponse: AuthResponse
) {

    data class Builder(
        var amount: String,
        var authResponse: AuthResponse
    ) {
        fun amount(amount: String) = apply { this.amount = amount }
        fun sessionResponseObject(authResponse: AuthResponse) =
            apply { this.authResponse = authResponse }

        fun build() = SearchTransactionRequest(amount, authResponse)

    }
}