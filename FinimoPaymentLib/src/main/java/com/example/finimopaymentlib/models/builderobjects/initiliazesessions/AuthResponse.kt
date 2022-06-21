package com.example.finimopaymentlib.models.builderobjects.initiliazesessions

class AuthResponse(
    var merchantID: String,
    var transactionToken: String,
    var serialNumber: String
) {
    data class Builder(
        var merchantID: String,
        var transactionToken: String,
        var serialNumber: String
    ) {

        fun merchantID(merchantID: String) =
            apply { this.merchantID = merchantID }

        fun transactionToken(transactionToken: String) =
            apply { this.transactionToken = transactionToken }

        fun serialNumber(serialNumber: String) =
            apply { this.serialNumber = serialNumber }

        fun build() = AuthResponse(merchantID, transactionToken, serialNumber)

    }
}