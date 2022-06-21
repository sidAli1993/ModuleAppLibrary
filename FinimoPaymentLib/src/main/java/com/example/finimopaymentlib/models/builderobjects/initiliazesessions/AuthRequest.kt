package com.example.finimopaymentlib.models.builderobjects.initiliazesessions

data class AuthRequest(
    var organizationName: String,
    var organizationID: String,
    var serialNumber: String,
    var terminalModel: String
) {

    data class Builder(
        var organizationName: String,
        var organizationID: String,
        var serialNumber: String,
        var terminalModel: String
    ) {

        fun organizationName(organizationName: String) =
            apply { this.organizationName = organizationName }

        fun organizationID(organizationID: String) =
            apply { this.organizationID = organizationID }

        fun serialNumber(serialNumber: String) =
            apply { this.serialNumber = serialNumber }

        fun terminalModel(terminalModel: String) =
            apply { this.terminalModel = terminalModel }

        fun build() =
            AuthRequest(organizationName, organizationID, serialNumber, terminalModel)

    }
}