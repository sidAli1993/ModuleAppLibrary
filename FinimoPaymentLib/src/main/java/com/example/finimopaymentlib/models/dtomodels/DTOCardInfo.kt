package com.example.finimopaymentlib.models.dtomodels

data class DTOCardInfo(
    var issuerResponseData: String? = null,
    var signatureRequired: Boolean? = null,
    var rrn: String? = null,
    var authorizationId: String? = null,
    var acquirer: String? = null,
    var scheme: String? = null,
    var clearingMerchantId: String? = null,
    var clearingTerminalId: String? = null,
    var card: DTOCard? = null
)
