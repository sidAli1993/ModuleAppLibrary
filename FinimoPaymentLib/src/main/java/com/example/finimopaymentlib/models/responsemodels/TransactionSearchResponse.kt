package com.example.finimopaymentlib.models.responsemodels

import com.example.finimopaymentlib.models.dtomodels.DTOPaymentInfo

data class TransactionSearchResponse(
    var transactionId: String? = null,
    var clientTransactionId: String? = null,
    var chargeResult: String? = null,
    var chargeResultMessage: String? = null,
    var isoResponseCode: String? = null,
    var displayAmount: String? = null,
    var amountInCents: Int = 0,
    var currency: String? = null,
    var transactionTime: String? = null,
    var DTOPaymentInfo: DTOPaymentInfo? = null,
    var updateAvailable: Boolean? = false
)
