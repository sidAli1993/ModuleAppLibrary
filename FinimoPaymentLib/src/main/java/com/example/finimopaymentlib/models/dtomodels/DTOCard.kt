package com.example.finimopaymentlib.models.dtomodels

data class DTOCard(
    var maskedPan: String? = null,
    var cardholderName: String? = null,
    var cardholderVerificationMethod: Int? = 0,
    var panEntryMode: Int? = 0,
    var expiryYear: String? = null,
    var expiryMonth: String? = null,
    var expiryDay: String? = null
)
